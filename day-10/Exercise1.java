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

}
