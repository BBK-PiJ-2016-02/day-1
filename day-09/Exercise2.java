public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        obj.run();
    }

    public void run() {
        SmartPhone phone = new SmartPhone("Apple");

        /*
            `MobilePhone phone = new SmartPhone("Apple");`

            2.2 The above won't work as the MobilePhone class does not implement
            the browseWeb or findPosition methods, a potential solution is to
            either introduce those methods to that class, remove calls to those
            methods or switch the type hint to SmartPhone.
         */

        phone.call("01234 567890");
        phone.browseWeb("https://www.google.com/");
        phone.findPosition();
    }
}