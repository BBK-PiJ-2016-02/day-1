public class Comparator {
    public static void main(String[] args) {
        Comparator obj = new Comparator();
        obj.run();
    }

    public void run() {
        System.out.println(this.getMax(2,9));
        System.out.println(this.getMax(2.0,9.0));
        System.out.println(this.getMax("2","9"));
    }

    public int getMax(int n, int m) {
        return (int) this.getMax(
            (double) n,
            (double) m
        );
    }

    public double getMax(double d1, double d2) {
        if (d1 > d2) {
            return d1;
        } else {
            return d2;
        }
    }

    public String getMax(String number1, String number2) {
        return "" + this.getMax(
            Integer.parseInt(number1),
            Integer.parseInt(number2)
        );
    }
}