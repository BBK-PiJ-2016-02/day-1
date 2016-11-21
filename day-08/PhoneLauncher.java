public class PhoneLauncher {
    /**
     * Application entry point
     * @param args Arguments for application
     */
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    /**
     * Create phone instances
     */
    public void launch() {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.printLastNumbers();
        mobilePhone.call("07111111111");
        mobilePhone.call("07222222222");
        mobilePhone.call("07333333333");
        mobilePhone.printLastNumbers();
        mobilePhone.call("07444444444");
        mobilePhone.call("07555555555");
        mobilePhone.call("07666666666");
        mobilePhone.call("07777777777");
        mobilePhone.call("07888888888");
        mobilePhone.call("07999999999");
        mobilePhone.call("07000000000");
        mobilePhone.call("07121212121");
        mobilePhone.printLastNumbers();
        mobilePhone.ringAlarm("Siren");
        mobilePhone.playGame("Snake");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.ringAlarm("BeepBeep");
        smartPhone.browseWeb("http://google.com/");
        System.out.println("Phone position: " + smartPhone.findPosition());
    }
}