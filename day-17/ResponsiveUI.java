import java.util.*;
import java.lang.*;

public class ResponsiveUI implements Runnable {
    private int taskId;
    private int sleepTime;

    public ResponsiveUI(int taskId, int sleepTime) {
        this.taskId = taskId;
        this.sleepTime = sleepTime;
    }

    public static void main(String[] args) {
        int taskI = 0;
        Map<Integer,Thread> threadList = new HashMap<Integer,Thread>();

        while(true) {
            int sleepTime = ResponsiveUI.getIntInput("Enter the duration (in ms) of task " + taskI + ": ");

            List<String> completedTasks = new ArrayList<String>();
            Iterator it = threadList.entrySet().iterator();

            while(it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                int taskId = (int) pair.getKey();
                Thread thread = (Thread) pair.getValue();

                if(!thread.isAlive()) {
                    completedTasks.add("" + taskId);
                }
            }

            if(completedTasks.size() > 0) {
                System.out.println(
                    "Finished tasks: " +
                    String.join(", ", completedTasks)
                );
                for(String taskId : completedTasks) {
                    threadList.remove(Integer.parseInt(taskId));
                }
            }

            ResponsiveUI sleepTask = new ResponsiveUI(taskI, sleepTime);
            Thread thread = new Thread(sleepTask);
            threadList.put(taskI, thread);
            thread.start();

            taskI++;
        }
    }

    private static int getIntInput(String msg) {
        Integer input = null;
        Scanner scanner = new Scanner(System.in);

        while(input == null) {
            try {
                System.out.print(msg);
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input, please only enter an integer value\n");
                scanner.next();
            }
        }

        return input;
    }

    public int getTaskId() {
        return this.taskId;
    }

    public void run() {
        try {
            Thread.sleep(this.sleepTime);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}