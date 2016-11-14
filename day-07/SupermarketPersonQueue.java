public class SupermarketPersonQueue implements PersonQueue {

    private Person first;

    /**
    * Adds another person to the queue.
    */
    public void insert(Person person) {
        if(first == null) {
            first = person;
        } else {
            Person current = first;
            while(current.next != null) {
                current = current.next;
            }
            current.next = person;
        }

        System.out.println("\"" + person.name + "\" joined the queue. " + getSize() + " person(s) in the queue.");
    }

    /**
    * Removes a person from the queue.
    */
    public Person retrieve() {
        Person next = first;
        if(first != null) {
            first = first.next;
        }
        System.out.println("Serving \"" + next.name + "\". " + getSize() + " person(s) in the queue.");
        return next;
    }

    /**
     * Calculates the size of the queue
     */
    public int getSize() {
        int queueSize = 0;
        Person current = first;
        while(current != null) {
            queueSize++;
            current = current.next;
        }
        return queueSize;
    }
}