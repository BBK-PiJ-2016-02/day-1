public class QueueElement {
    private int value;
    private QueueElement prevElement;
    private QueueElement nextElement;

    public QueueElement() {
        this.value = value;
    }

    public QueueElement getNext() {
        return nextElement;
    }

    public QueueElement getPrev() {
        return prevElement;
    }

    public void setNextElement(QueueElement element) {
        nextElement = element;
    }
}