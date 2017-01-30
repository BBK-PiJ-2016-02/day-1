public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        // System.out.println(obj.doggyMethod(1));
        // System.out.println(obj.mcCarthy91(99));
        System.out.println(obj.mcCarthy91(50));
        System.out.println(obj.mcCarthy91(73));
        System.out.println(obj.mcCarthy91(95));
    }

    public String doggyMethod(int n) {
        String result = doggyMethod(n-3) + n + doggyMethod(n-2);

        if (n <= 0) {
            return "";
        }
        return result;
    }


    private int iterations = 0;
    public int mcCarthy91(int n) {
        int iteration = iterations;
        iterations++;

        String spacing = "";
        for(int i = 0; i < iteration; i++) {
            spacing += " ";
        }
        System.out.println(spacing + iteration + " | mcCarthy91(" + n + ")");

        if (n > 100) {
            int a = n - 10;
            System.out.println(spacing + iteration + " | " + n + " - 10 => " + a);
            return a;
        } else {
            int b = mcCarthy91(n+11);
            int c = mcCarthy91(b);
            System.out.println(spacing + iteration + " | mcCarthy91(" + n + " + 11) => " + b);
            System.out.println(spacing + iteration + " | mcCarthy91(mcCarthy91(" + n + " + 11)) => " + c);
            return b;
        }
    }
}