public class DoublyLinkedList<E> {
    private Node start = null;
    private Node end = null;
    private Integer size = 0;

    public void add(E element) {
        Node node = new Node(element);

        if(this.start == null) {
            this.start = node;
            this.end = node;
        }

        node.setPrevNode(this.end);
        node.setNextNode(this.start);
        this.end = node;

        size++;
    }

    public E get(Integer index) {
        // if
        return this.start.getElement();
    }

    public Integer size() {
        return this.size;
    }

    public class Node {
        private Node prevNode;
        private Node nextNode;
        private E element;

        public Node(E element) {
            this.element = element;
        }

        public Node getPrevNode() {
            return this.prevNode;
        }

        public Node getNextNode() {
            return this.nextNode;
        }

        public E getElement() {
            return this.element;
        }

        public void setPrevNode(Node node) {
            this.prevNode = node;
        }

        public void setNextNode(Node node) {
            this.nextNode = node;
        }
    }
}