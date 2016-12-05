class GCD {
    public static void main(String[] args) {
        System.out.println(find(20, 10));
        System.out.println(find(20, 3));
        System.out.println(find(25, 15));
        System.out.println(find(103, 7));
        System.out.println(find(999, 888));
    }

    public static int find(int p, int q) {
        if(p % q == 0) {
            return q;
        }

        return find(q, p % q);
    }
}
