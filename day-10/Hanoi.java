class Hanoi {
    public static void main(String[] args) {

        System.out.println(movesRequired(1));
        System.out.println(movesRequired(3));
        System.out.println(movesRequired(4));
        System.out.println(movesRequired(8));
        System.out.println(movesRequired(29));
        System.out.println(movesRequired(32));
        System.out.println(movesRequired(128));

    }

    public static int movesRequired(int discCount) {
        double pow = Math.pow(2, discCount);
        return ((int) pow) - 1;
    }
}
