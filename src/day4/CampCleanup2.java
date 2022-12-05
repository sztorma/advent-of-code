package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import day4.model.ElfPair;

public class CampCleanup2 {

    public int getSolution(String fileName) {
        int sumOfOverlaps = 0;
        File fileToRead = new File(fileName);
        try {
            Scanner scanner = new Scanner(fileToRead);
            while (scanner.hasNextLine()) {
                ElfPair elfPair = new ElfPair(scanner.nextLine());
                boolean isOverlapped = elfPair.isAnyElfSectionsOverlapped();
                if (isOverlapped) {
                    sumOfOverlaps++;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Filename path is not valid");
        }
        return sumOfOverlaps;
    }
}
