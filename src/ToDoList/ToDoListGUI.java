package ToDoList;
import javax.swing.*;
import java.awt.*;
public class ToDoListGUI extends JFrame {
    private DefaultListModel<String> listModel;
    private JList<String> taskJList;
    private JTextField taskInput;
    private JButton addButton, deleteButton, doneButton;
    public ToDoListGUI(){
        setTitle("TO-DO-LIST");
        setSize(400,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        listModel = new DefaultListModel<>();
        taskJList = new JList<>(listModel);
        taskInput = new JTextField();
        addButton = new JButton("Add Task");
        deleteButton = new JButton("Delete Task");
        doneButton = new JButton("Mark Done");

        addButton.addActionListener(e -> {
            String task = taskInput.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskInput.setText("");
            }
        });

        // Delete selected task
        deleteButton.addActionListener(e -> {
            int selected = taskJList.getSelectedIndex();
            if (selected != -1) {
                listModel.remove(selected);
            }
        });

        // Mark selected task as done
        doneButton.addActionListener(e -> {
            int selected = taskJList.getSelectedIndex();
            if (selected != -1) {
                String task = listModel.get(selected);
                if (!task.endsWith(" [Done]")) {
                    listModel.set(selected, task + " [Done]");
                }
            }
        });

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(taskInput, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(doneButton);
        buttonPanel.add(deleteButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(taskJList), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
    public static void main(String []args){
        SwingUtilities.invokeLater(ToDoListGUI::new);
    }
}
