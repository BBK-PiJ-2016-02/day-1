import java.io.File;

public class ls {
    public static void main(String[] args) {
        File dir = new File("./");
        String[] list = dir.list();
        for(String item: list) {
            System.out.println(item);
        }
    }
}