import java.util.concurrent.*;

public class TextLoopExecutor implements Runnable {
    public static final int COUNT = 10;

    private final String name;

    public TextLoopExecutor(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            System.out.println("Loop:" + name + ", iteration:" + i + ".");
        }
    }

    public static void main(String args[]) {
        ExecutorService e = Executors.newFixedThreadPool(COUNT);
        for (int i = 0; i < COUNT; i++) {
            Runnable r = new TextLoopExecutor("Thread " + i);
            e.execute(r);
        }
        e.shutdown();
    }
}