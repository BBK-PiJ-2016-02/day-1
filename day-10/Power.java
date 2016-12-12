class Power {
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        System.out.println(pow(2, 1));
        System.out.println(pow(2, 12));
    }

    public static int pow(int base, int exponent) {
        int result = base;

        while(exponent > 1) {
            result *= base;
            exponent--;
        }

        return result;
    }
}
