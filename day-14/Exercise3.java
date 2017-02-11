import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        List<Integer> sequence = obj.hailstoneSequence(
            Integer.parseInt(
                System.console().readLine("Hailstone number sequence, enter a number to start on: ")
            )
        );

        for(int i = 0; i < sequence.size(); i++) {
            System.out.print(sequence.get(i) + " ");
        }
    }

    private List<Integer> hailstoneSequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();

        sequence.add(n);
        while(n != 1) {
            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;

            }
            sequence.add(n);
        }

        return sequence;
    }
}