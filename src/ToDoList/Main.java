package ToDoList;
import java.util.Scanner;
public class Main {
    public static void main(String []args){
        ToDoList todo = new ToDoList();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n1.Add Task \n2.View Task \n3.Mark Done \n4.Delete Task \n5.Exit");
            System.out.println("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter Task: ");
                    String title = sc.nextLine();
                    todo.addTask(title);
                    break;
                case 2:
                    todo.showTasks();
                    break;
                case 3:
                    System.out.println("Enter task number to mark done: ");
                    todo.markComplete(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter task number to delete: ");
                    todo.deleteTask(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Good Bye!!!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
