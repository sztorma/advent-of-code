package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {

    public static String getFileContent(String fileName) {
        String content = "";
        File fileToRead = new File(fileName);
        try {
            Scanner scanner = new Scanner(fileToRead);
            while (scanner.hasNextLine()) {
                content += scanner.nextLine();
                content += "\n";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return content.trim();
    }
}
