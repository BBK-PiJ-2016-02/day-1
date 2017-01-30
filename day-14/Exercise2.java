import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        // run(40);
        run(45);
        run(45);
        // run(10);
        // run(17);
        // run(67);
    }

    public static void run(long n) {
        long startTime = System.nanoTime();
        long result = fibonacci(n);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("fibonacci("+n+") => " + result + "\n# Took: " + (totalTime/1000000) + "ms\n");

        startTime = System.nanoTime();
        result = fibonacciMemoized(n);
        totalTime = System.nanoTime() - startTime;
        System.out.println("fibonacciMemoized("+n+") => " + result + "\n# Took: " + (totalTime/1000000) + "ms\n");
    }

    public static long fibonacci(long n) {
        if(n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static Map<Long, Long> memo = new HashMap<>();
    public static long fibonacciMemoized(long n) {
        if(n < 2) return n;
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}