public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        obj.run();
    }

    public void run() {
        SmartPhone phone = new SmartPhone("Apple");
        phone.call("01234 567890");
        phone.browseWeb("https://www.google.com/");
        phone.findPosition();
    }
}