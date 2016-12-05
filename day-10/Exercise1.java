class Exercise1 {
    public static void main(String[] args) {
        /*

         Expected output:
         6
            4
                2
                2
                1
                1
            4
            3
                1
                1
            3
         6

        */
        printNumbers(6);
    }

    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n-2);
        printNumbers(n-3);
        System.out.println(n);
    }

    public static String buggyMethod(int n) {
        /*
            ISSUE:
            The base case is returned when the n variable is equal to exactly 0,
            however it is quite possible that the value 0 is never assigned to
            the n variable and the program would loop forever until hitting a
            StackOverflowError

            POTENTIAL FIX:
            The comparison operator in the if statement should be changed from
            using `==` to `<=`
         */
        if (n == 0) {
            return "";
        }
        return n + " " + buggyMethod(n - 2);
    }

}
