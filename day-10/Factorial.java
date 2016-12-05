class Factorial {
    public static void main(String[] args) {

        System.out.println(recursively(10));
        System.out.println(iteratively(10));

    }

    public static int recursively(int n) {
        if(n == 1) {
            return 1;
        }

        return n * recursively(n-1);
    }

    public static int iteratively(int n) {
        int result = 1;

        while(n != 1) {
            result *= n;
            n--;
        }

        return result;
    }

}
