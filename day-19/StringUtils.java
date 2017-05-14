import java.util.Arrays;

public class StringUtils {

    private String[] strings = {
        "I", "feel", "like", "Bobby", "Fischer",
        "Always", "four", "moves", "ahead", "of",
        "My", "competition", "listen",
        "They", "ain’t", "gonna", "stop", "me", "ever",
        "I", "feel", "as", "large", "as", "Biggie",
        "Swear", "it", "could", "not", "get", "better",
        "I", "feel", "in", "charge", "like", "Biggie",
        "Wearing", "that", "Cosby", "Sweater",
    };

    public static void main(String[] args) {
        StringUtils obj = new StringUtils();
        obj.exercise1();
        obj.exercise2();
    }

    public static Integer eChecker(String strA, String strB) {
        if(strA.toLowerCase().charAt(0) == 'e') {
            if(strB.toLowerCase().charAt(0) == 'e') {
                return 0;
            }
            return -1;
        }
        return 1;
    }

    public void exercise1() {

        // Sorted by length (shortest to longest)
        String[] stringSortByLengthAsc = Arrays.copyOf(this.strings, this.strings.length);
        Arrays.sort(stringSortByLengthAsc, (String strA, String strB) -> strA.length() - strB.length());

        // Sorted by length (longest to shortest)
        String[] stringSortByLengthDesc = Arrays.copyOf(this.strings, this.strings.length);
        Arrays.sort(stringSortByLengthDesc, (String strA, String strB) -> strB.length() - strA.length());

        // Sorted by first letter
        String[] stringSortByFirstLetter = Arrays.copyOf(this.strings, this.strings.length);
        Arrays.sort(stringSortByFirstLetter, (String strA, String strB) -> strA.compareTo(strB));

        // Sorted by letter E first
        String[] stringSortByLetterEFirst = Arrays.copyOf(this.strings, this.strings.length);
        Arrays.sort(stringSortByLetterEFirst, (String strA, String strB) -> (strA.toLowerCase().charAt(0) == 'e') ? -1 : 1);

        // Output
        System.out.println("# strings:\n" + String.join(", ", strings) + "\n");
        System.out.println("# stringSortByLengthAsc:\n" + String.join(", ", stringSortByLengthAsc) + "\n");
        System.out.println("# stringSortByLengthDesc:\n" + String.join(", ", stringSortByLengthDesc) + "\n");
        System.out.println("# stringSortByFirstLetter:\n" + String.join(", ", stringSortByFirstLetter) + "\n");
        System.out.println("# stringSortByLetterEFirst:\n" + String.join(", ", stringSortByLetterEFirst) + "\n");

    }

    public void exercise2() {
        String[] stringSortByLetterEFirstStatic = Arrays.copyOf(this.strings, this.strings.length);
        Arrays.sort(stringSortByLetterEFirstStatic, StringUtils::eChecker);

        System.out.println("# stringSortByLetterEFirstStatic:\n" + String.join(", ", stringSortByLetterEFirstStatic) + "\n");
    }
}
