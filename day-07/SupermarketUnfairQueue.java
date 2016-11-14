public class SupermarketUnfairQueue implements PersonQueue {

    private Person first;

    /**
    * Adds another person to the queue.
    */
    public void insert(Person person) {
        if(first == null) {
            first = person;
        } else {

            Person previous = null;
            Person current = first;

            while(current != null && current.age > person.age) {
                previous = current;
                current = current.next;
            }

            person.next = current;
            current = person;

            if(previous == null) {
                first = person;
            } else {
                previous.next = person;
            }
        }
    }

    /**
    * Removes a person from the queue.
    */
    public Person retrieve() {
        Person next = first;
        if(first != null) {
            first = first.next;
        }
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