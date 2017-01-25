/**
 * Make a class that implements a method that reads a list of marks between 0
 * and 100 from the user, one per line, and stops when the user introduces a -1.
 * The program should output at the end (and only at the end) how many marks
 * there were in total, how many were distinctions (70–100), how many were
 * passes (50–69), how many failed (0–49), and how many were invalid
 * (e.g. 150 or -3).
 * Use readLine() exactly once.
 */

public class DoWhileEx {

    private int countDist = 0;
    private int countPass = 0;
    private int countFail = 0;

    private String markString;

    private int mark = 0;

    private int counter = 0;

    // This constructor is pretty useless like this
    public DoWhileEx() {
        this.countDist = countDist;
        this.countPass = countPass;
        this.countFail = countFail;

        this.counter = counter;

        this.markString = markString;

        this.mark = mark;
    }

    public void readMarks(int mark) {

        System.out.println("Insert mark (0-100 / -1 to exit): ");

        do {
            markString = System.console().readLine();
            mark = Integer.parseInt(markString);

            // Test for valid input
            if (mark != -1 && mark < -1 || mark > 100) {
                System.out.println("Please enter a valid mark.");
            } else if (mark >= 70) {
                countDist++;
            } else if (mark >= 50 && mark < 70) {
                countPass++;
            } else if (mark >= 0 && mark < 50) {
                countFail++;
            }

        } while(mark != -1);

        System.out.println("Distinctions: " + countDist);
        System.out.println("Passes: " + countPass);
        System.out.println("Failed: " + countFail);
    }
}