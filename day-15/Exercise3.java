import java.util.*;

public class Exercise3 {
    private int size;
    private Scanner scanner;

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();
        obj.launch();
    }

    public void launch() {
        this.scanner = new Scanner(System.in);
        this.size = this.getIntInput("How many numbers would you like to enter?: ");

        List<Integer> list = new ArrayList<Integer>();

        while(list.size() < size) {
            list.add(
                this.getIntInput("Please enter an integer ("+(list.size()+1)+"/"+ size +"): ")
            );
        }

        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double mean = sum/size;

        System.out.println("\nThe mean value of your input is: " + mean);
    }

    private int getIntInput(String msg) {
        Integer input = null;
        while(input == null) {
            try {
                System.out.print(msg);
                input = this.scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input, please only enter an integer value\n");
                this.scanner.next();
            }
        }

        return input;
    }
}