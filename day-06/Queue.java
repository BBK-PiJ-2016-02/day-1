public class Queue {

    private int size;

    public Queue() {
        this.size = 0;
    }

    // inserts an element at the beginning of the queue.
    public void insert(QueueElement element) {
        this.size++;
    }

    // remove an element from the end of the queue.
    public void retrieve() {
        this.size--;
    }

    // returns the current size of the queue.
    public int size() {
        return this.size;
    }
}