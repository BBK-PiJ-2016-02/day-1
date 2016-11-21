/**
* A smart phone that can browse the internet
*/
public class SmartPhone extends MobilePhone {
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