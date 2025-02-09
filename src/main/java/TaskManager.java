import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        this.tasks = new ArrayList<String>();
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public List<String> listTasks() {
        return this.tasks;

    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
        try {
            FileWriter myWriter = new FileWriter("tasks.txt");
            for (String i : this.tasks) {
                myWriter.write(i);
            }
            myWriter.close();
            System.out.println("Successfully wrote tasks to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}