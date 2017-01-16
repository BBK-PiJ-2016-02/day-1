public class Person {
    public String getInitials(String fullName) {
        String result = "";
        String[] words = fullName.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > 0) {
                String nextInitial = "" + words[i].charAt(0);
                result = result + nextInitial.toUpperCase();
            }
        }

        return result;
    }
}