public class SupermarketUnfairClusteredQueue implements PersonQueue {

    private Person firstOap;
    private Person firstAdult;
    private Person firstChild;

    /**
    * Adds another person to the queue.
    */
    public void insert(Person person) {
        Person first = getFirst(person.age);

        if(first == null) {
            setFirst(person);
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
                setFirst(person);
            } else {
                previous.next = person;
            }
        }
    }

    /**
     * Get first Person in matching age bracket
     */
    private Person getFirst(int age) {
        if(age >= 65) {
            return firstOap;
        }

        if(age >= 18) {
            return firstAdult;
        }

        return firstChild;
    }

    /**
     * Set the first pointer for age group
     */
    private void setFirst(Person person) {
        if(person.age >= 65) {
            firstOap = person;
        }

        if(person.age >= 18) {
            firstAdult = person;
        }

        firstChild = person;
    }

    /**
    * Removes a person from the queue.
    */
    public Person retrieve() {
        Person next = null;

        if(firstOap != null) {
            next = firstOap;
            firstOap = firstOap.next;
        }

        if(firstAdult != null) {
            next = firstAdult;
            firstAdult = firstAdult.next;
        }
        if(firstChild != null) {
            next = firstChild;
            firstChild = firstChild.next;
        }

        return next;
    }

    /**
     * Calculates the size of the queue
     */
    public int getSize() {
        int queueSize = 0;
        Person current = firstOap;

        while(current != null) {
            queueSize++;
            current = current.next;
        }

        current = firstAdult;
        while(current != null) {
            queueSize++;
            current = current.next;
        }

        current = firstChild;
        while(current != null) {
            queueSize++;
            current = current.next;
        }

        return queueSize;
    }
}