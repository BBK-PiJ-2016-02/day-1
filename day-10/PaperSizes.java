class PaperSizes {

    private static double a0Width  = 841;
    private static double a0Height = 1189;

    public static void main(String[] args) {
        System.out.println(calculateSize("A0"));
        System.out.println(calculateSize("A4"));
        System.out.println(calculateSize("A00"));
        System.out.println(calculateSize("A1"));
        System.out.println(calculateSize("A00000"));
    }

    public static String calculateSize(String dinSize) {
        int sizeModifier = 1;
        double mmWidth = a0Width;
        double mmHeight = a0Height;
        double mmPrevDimension = 0;

        if(dinSize.substring(1, 2).equals("0")) {
            sizeModifier = (dinSize.length() - 2);
        } else {
            sizeModifier = -(Integer.parseInt(dinSize.substring(1)));
        }

        while(sizeModifier != 0) {
            if(sizeModifier > 0) {
                mmPrevDimension = mmWidth;
                mmWidth = mmHeight;
                mmHeight = mmPrevDimension * 2;
                sizeModifier--;
            } else {
                mmPrevDimension = mmHeight;
                mmHeight = mmWidth;
                mmWidth = mmPrevDimension / 2;
                sizeModifier++;
            }
        }

        String size = mmWidth + "mm x " + mmHeight + "mm";
        return "The size of an " + dinSize + " sheet of paper is " + size;
    }
}
