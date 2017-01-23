/*
    # Expectation

    The NullPointerException catch block will never execute even if a
    NullPointerException is thrown within the try block.

    This is because NullPointerException extends Exception (by extending
    RuntimeException) and Exception is caught in the preceeding catch block.

    # Result

    The error "exception NullPointerException has already been caught" is
    outputted, with the second catch block highlighted as the source.

    We can see that only the first catch block is executed by the calls to
    System.out.println, only the first one is ever outputted
*/

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        obj.launch();
    }

    public void launch() {
        List<Integer> list = new ArrayList<Integer>();
        try {
            list = null;
            list.add(1);
        } catch (Exception ex) {
            System.out.println("# Exception");
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            System.out.println("# NullPointerException");
            ex.printStackTrace();
        }
    }
}