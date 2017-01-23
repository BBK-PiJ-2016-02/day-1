import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        obj.launch(0); // Execution order: 01-21 (IndexOutOfBoundsException), 24-27
        obj.launch(2); // Execution order: 01-17 (IndexOutOfBoundsException), 24-27
        obj.launch(4); // Execution order: 01-13 (IndexOutOfBoundsException), 24-27
        obj.launch(6); // Execution order: 01-11 (IndexOutOfBoundsException), 24-27

    }

/* 01 */    public void launch(int userInput) {
/* 02 */        List<Integer> intList = new ArrayList<Integer>();
/* 03 */        intList.add(1);
/* 04 */        intList.add(2);
/* 05 */        intList.add(3);
/* 06 */        intList.add(4);
/* 07 */        intList.add(5);
/* 08 */        intList.add(6);
/* 09 */        try {
/* 10 */            intList.remove(0);
/* 11 */            System.out.println(intList.get(userInput));
/* 12 */            intList.remove(0);
/* 13 */            System.out.println(intList.get(userInput));
/* 14 */            intList.remove(0);
/* 15 */            System.out.println(intList.get(userInput));
/* 16 */            intList.remove(0);
/* 17 */            System.out.println(intList.get(userInput));
/* 18 */            intList.remove(0);
/* 19 */            System.out.println(intList.get(userInput));
/* 20 */            intList.remove(0);
/* 21 */            System.out.println(intList.get(userInput));
/* 22 */            intList.remove(0);
/* 23 */            System.out.println(intList.get(userInput));
/* 24 */        } catch (IndexOutOfBoundsException ex) {
/* 25 */            ex.printStackTrace();
/* 26 */        }
/* 27 */    }
}