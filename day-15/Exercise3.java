import java.util.*;

public class Exercise3 {
    private int size = 10;

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();
        obj.launch();
    }

    public void launch() {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        while(list.size() < size) {
            try {
                System.out.print("Please enter an integer ("+(list.size()+1)+"/"+ size +"): ");
                list.add(scanner.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input, please only enter an integer value\n");
                scanner.next();
            }
        }

        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double mean = sum/size;

        System.out.println("\nThe mean value of your input is: " + mean);
    }
}