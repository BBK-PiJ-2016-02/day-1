class Fibonacci {
    public static void main(String[] args) {

        System.out.println(recursively(7));
        System.out.println(iteratively(7));

    }

    public static int recursively(int n) {
        if(n < 3) {
            return 1;
        }

        return recursively(n-2) + recursively(n-1);
    }

    public static int iteratively(int n) {
        int result = 1;

        int a = 0;
        int b = 1;

        while(1 < n--) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

}
