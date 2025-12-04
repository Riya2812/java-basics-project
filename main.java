public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Finish Cognizant Registration", true);
        Task task2 = new Task("Practice Java", false);

        task1.displayTask();
        task2.displayTask();
    }
}

class Task {
    String title;
    boolean status;

    Task(String title, boolean status) {
        this.title = title;
        this.status = status;
    }

    void displayTask() {
        System.out.println("Task: " + title);
        System.out.println("Completed: " + (status ? "Yes" : "No"));
        System.out.println("----------------------------");
    }
}
