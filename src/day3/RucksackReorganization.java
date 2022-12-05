package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RucksackReorganization {

    public int getSolution(String fileName) {
        int sumOfPriorities = 0;
        File fileToRead = new File(fileName);
        try {
            Scanner scanner = new Scanner(fileToRead);
            while (scanner.hasNextLine()) {
                Rucksack rucksack = new Rucksack(scanner.nextLine());
                char commonChar = rucksack.getCommonChar();
                sumOfPriorities += Priority.getPriorityOfCaseSensitiveChar(commonChar);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sumOfPriorities;
    }

}
