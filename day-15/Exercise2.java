/*
    # Expectation

    The NullPointerException catch block will never execute even if a
    NullPointerException is thrown within the try block.

    This is because NullPointerException extends Exception (by extending
    RuntimeException) and Exception is caught in the preceeding catch block.
*/

public class Exercise2 {
    public static void main(String[] args) {

    }

    public void launch() {
        // Some code here
        try {
            // more code here
            list.add(newElement);
            // more code here
        } catch (Exception ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}