public class HashUtilities {
    public static int shortInt(int value) {
        // Not % 1000 as we can end up with 0 (1000), result must be between 0 & 1000
        return Math.abs((value % 999) + 1);
    }
}