package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import day4.model.ElfPair;

public class CampCleanup {

    public int getSolution(String fileName) {
        int sumOfContainings = 0;
        File fileToRead = new File(fileName);
        try {
            Scanner scanner = new Scanner(fileToRead);
            while (scanner.hasNextLine()) {
                ElfPair elfPair = new ElfPair(scanner.nextLine());
                boolean isAnyContaining = elfPair.isAnyElfSectionsFullyContainOther();
                if (isAnyContaining) {
                    sumOfContainings++;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Filename path is not valid");
        }
        return sumOfContainings;
    }

}
