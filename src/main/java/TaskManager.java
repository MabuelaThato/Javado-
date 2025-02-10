import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        this.tasks = new ArrayList<String>();
        try {
            File file = new File("tasks.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                this.tasks.add(line);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
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
            System.out.println("An error occurred while writing tasks to the file.");
        }
    }
}