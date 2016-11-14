public class Supermarket {

    private PersonQueue queue;

    public static void main(String[] args) {
        Supermarket instance = new Supermarket();
        instance.open();
    }

    public void open() {
        queue = new SupermarketUnfairQueue();

        Person person = null;
        addPerson(new Person("Alice", 22));
        addPerson(new Person("John", 72));
        addPerson(new Person("Julia", 22));
        addPerson(new Person("Bill", 56));
        addPerson(new Person("Jess", 34));
        addPerson(new Person("Gloria", 82));
        addPerson(new Person("Ted", 27));

        while(queue.getSize() > 0) {
            servePerson();
        }
    }

    public void addPerson(Person person) {
        queue.insert(person);
        System.out.println("\"" + person.name + "(" + person.age + ")\" joined the queue. " + queue.getSize() + " person(s) in the queue.");
    }

    public void servePerson() {
        Person next = queue.retrieve();
        System.out.println("Serving \"" + next.name + "(" + next.age + ")\". " + queue.getSize() + " person(s) in the queue.");
    }

}