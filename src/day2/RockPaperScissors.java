package day2;

import java.util.Scanner;

import util.FileUtil;

public class RockPaperScissors extends MainRockPaperScissors {

    public int calculatePoints(String fileName) {
        String fileContent = FileUtil.getFileContent(fileName);
        Scanner scanner = new Scanner(fileContent);
        int points = 0;
        while (scanner.hasNextLine()) {
            char oppenentShape = scanner.next().charAt(0);
            char myDecodedShape = scanner.next().charAt(0);
            char myShape = decodeShape(myDecodedShape);
            points += getPointOfARound(oppenentShape, myShape);
        }
        scanner.close();

        return points;
    }

    public char decodeShape(char decodedShape) {
        char result;
        switch (decodedShape) {
            // rock
            case 'X':
                result = 'A';
                break;
            // paper
            case 'Y':
                result = 'B';
                break;
            // scissors
            case 'Z':
                result = 'C';
                break;
            default:
                throw new RuntimeException("No such element: " + String.valueOf(decodedShape));
        }
        return result;
    }

    public int getPointOfARound(char oppenentShape, char myShape) {
        return getShapeReward(myShape) + getWinReward(oppenentShape, myShape);
    }

}