/*
    The c field is shared between each thread, during which the internal
    n field is attempted to be incremented, however we end up with race
    conditions and as a result don't get the field incrementing as we'd expect.
    In fact we lose many increment operations.

    If we modify the increase method on the Counter class to be synchronized, it
    will ensure the value is incremented consistently, with no loss of
    increments.
 */

public class Increaser implements Runnable {
    private Counter c;

    public Increaser(Counter counter) {
        this.c = counter;
    }

    public static void main(String args[]) {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Increaser increaserTask = new Increaser(counter);
            Thread t = new Thread(increaserTask);
            t.start();
        }
    }

    public void run() {
        System.out.println("Starting at " + c.getCount());
        for (int i = 0; i < 1000; i++) {
            c.increase();
        }
        System.out.println("Stopping at " + c.getCount());
    }
}