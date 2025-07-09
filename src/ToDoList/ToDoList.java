package ToDoList;
import java.util.List;
import java.util.ArrayList;

public class ToDoList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title){
        tasks.add(new Task(title));
    }
    public void showTasks(){
        if (tasks.isEmpty()){
            System.out.println("No Tasks");
        }
        else {
            for (int i =0;i < tasks.size();i++){
                Task t = tasks.get(i);
                System.out.println((i+1)+"."+ t.getTitle()+(t.is_done()?" --Done-- ":""));
            }
        }
    }
    public void markComplete(int index){
        if (index > 0 && index <= tasks.size()){
            tasks.get(index-1).Mark_done();
        }
    }
    public void deleteTask(int index){
        if (index > 0 && index <= tasks.size()){
            tasks.remove(index-1);
        }
    }
}
