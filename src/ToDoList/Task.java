package ToDoList;

public class Task {
    private String title;
    private boolean is_done;
public Task(String title){
    this.title=title;
    this.is_done = false;
}
    public String getTitle() {return title;}
    public boolean is_done() {return is_done;}
    // Method
    public void Mark_done (){is_done=true;}
}
