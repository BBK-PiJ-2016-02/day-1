import java.io.File;

public class mkdir {
    public static void main(String[] args) {
        for(String dirName: args) {
            File dir = new File(dirName);
            dir.mkdir();
            System.out.println("Created directory: " + dirName);
        }
    }
}