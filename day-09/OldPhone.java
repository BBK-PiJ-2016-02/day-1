/**
* A phone that just makes calls
*/
public class OldPhone implements Phone {
    /**
     * Brand of phone
     */
    private String brand = null;

    /**
     * Class constructor
     * @param  brand Brand name of phone
     */
    public OldPhone(String brand) {
        this.brand = brand;
    }

    /**
     * Get the phone brand
     * @return Phone brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Call specified number
     * @param number Which number to call
     */
    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }
}