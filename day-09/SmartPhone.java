/**
* A smart phone that can browse the internet
*/
public class SmartPhone extends MobilePhone {
    /**
     * Class constructor
     * @param  brand Brand name of phone
     */
    public SmartPhone(String brand) {
        super(brand);
    }

    /**
     * Call specified number
     * @param number Which number to call
     */
    public void call(String number) {
        if(number.startsWith("00")) {
            addNumberToCallHistory(number);
            System.out.println("Calling " + number + " through the internet to save money...");
        } else {
            super.call(number);
        }
    }

    /**
     * Browse the internet
     * @param url Address to navigate to
     */
    public void browseWeb(String url) {
        System.out.println("Navigating to " + url + "...");
    }

    /**
     * Find the location of the phone
     * @return Lon/Lat representation of the phone's location
     */
    public String findPosition() {
        return "51.521679, -0.1298603";
    }
}