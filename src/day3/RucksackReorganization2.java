package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RucksackReorganization2 {

    public int getSolution(String fileName) {
        int sumOfPriorities = 0;
        File fileToRead = new File(fileName);
        try {
            Scanner scanner = new Scanner(fileToRead);
            while (scanner.hasNextLine()) {
                List<Rucksack> rucksacks = new LinkedList<>();
                rucksacks.add(new Rucksack(scanner.nextLine()));
                rucksacks.add(new Rucksack(scanner.nextLine()));
                rucksacks.add(new Rucksack(scanner.nextLine()));
                RuckSackGroup rucksackGroup = new RuckSackGroup(rucksacks);
                char commonChar = rucksackGroup.getCommonCharOfRucksackGroup();
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
