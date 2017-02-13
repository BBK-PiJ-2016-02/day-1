import java.io.*;

public class cat {
    public static void main(String[] args) {
        for(String fileName: args) {
            File file = new File(fileName);

            if (file.isDirectory()) {
                System.out.println(fileName + ":  Is a directory");
            } else {
                try (BufferedReader in = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = in.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (FileNotFoundException ex) {
                    System.out.println(fileName + ": No such file or directory");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
