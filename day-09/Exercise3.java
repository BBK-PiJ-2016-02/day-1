public class Exercise3 {
    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();
        obj.run();
    }

    public void run() {
    	DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    	list.add(1);
    	list.add(3);
    	System.out.println(list.size());
    	list.add(4);
    	list.add(2);
    	System.out.println(list.size());
    }
}