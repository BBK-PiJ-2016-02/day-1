import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class cp {
    public static void main(String[] args) {
        if (args.length <= 1) {
            System.out.println("Invalid argument count provided.");
            return;
        }

        File target = new File(args[args.length - 1]);
        if (args.length > 2 && !target.isDirectory()) {
            System.out.println("Target is not a directory.");
            return;
        }

        for (int i = 0; i < args.length - 1; i++) {
            String fileName = args[i];
            File source = new File(fileName);

            if (!source.exists()) {
                System.out.println(fileName + ": No such file or directory");
                continue;
            } else if (source.isDirectory()) {
                System.out.println(fileName + "  is a directory (not copied).");
                continue;
            }

            try {
                String targetPath = target.getPath();
                if (target.isDirectory()) targetPath += "/" + source.getName();

                Files.copy(source.toPath(), Paths.get(targetPath), REPLACE_EXISTING);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
