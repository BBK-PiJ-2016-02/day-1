class Palindrome {
    public static void main(String[] args) {
        System.out.println(recursive("aa"));
        System.out.println(recursive("a"));
        System.out.println(recursive("abbbbcccaaa"));
        System.out.println(recursive("aabbcCcb ! Sbaa"));
        System.out.println(recursive("aabbccbbaa"));
        System.out.println(recursive("abba"));
        System.out.println(recursive("abca"));

    }

    public static boolean recursive(String str) {

        /*
            We're only interested in alphanumeric characters.
            Improvement: ideally we'd break this out so it's only called once
        */
        str = str.replaceAll("[^A-Za-z0-9]", "");
        str = str.toLowerCase();

        if(str.endsWith(str.substring(0,1))) {
            if(str.length() > 2) {
                return recursive(str.substring(1, str.length() - 1));
            } else {
                return true;
            }
        }

        return false;
    }
}
