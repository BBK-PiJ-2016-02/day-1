public class Supermarket {

    private PersonQueue queue;

    public static void main(String[] args) {
        Supermarket instance = new Supermarket();
        instance.open();
    }

    public void open() {
        queue = new SupermarketPersonQueue();

        Person person1 = new Person("Alice");
        addPerson(person1);

        Person person2 = new Person("John");
        addPerson(person2);

        servePerson();
    }

    public void addPerson(Person person) {
        queue.insert(person);
    }

    public void servePerson() {
        Person nextPerson = queue.retrieve();
    }

}