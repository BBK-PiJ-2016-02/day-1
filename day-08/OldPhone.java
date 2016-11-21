/**
* A phone that just makes calls
*/
public class OldPhone implements Phone {
    /**
     * Call specified number
     * @param number Which number to call
     */
    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }
}