package day2;

import java.util.Scanner;

import util.FileUtil;

public class RockPaperScissors2 extends MainRockPaperScissors {

    public int calculatePoints(String fileName) {
        String fileContent = FileUtil.getFileContent(fileName);
        Scanner scanner = new Scanner(fileContent);
        int points = 0;
        while (scanner.hasNextLine()) {
            char opponentShape = scanner.next().charAt(0);
            char winPredictor = scanner.next().charAt(0);
            int temp = getPointOfARound(opponentShape, winPredictor);
            points += temp;
        }
        scanner.close();

        return points;
    }

    public int getPointOfARound(char oppenentShape, char winPredictor) {
        int point = 0;
        switch (winPredictor) {
            // Lose
            case 'X':
                char myLoseShape = getLoseShapeAgainst(oppenentShape);
                point = 0 + getShapeReward(myLoseShape);
                break;
            // draw
            case 'Y':
                char myDrawShape = oppenentShape;
                point = 3 + getShapeReward(myDrawShape);
                break;
            // win
            case 'Z':
                char myWinShape = getWinShapeAgainst(oppenentShape);
                point = 6 + getShapeReward(myWinShape);
                break;
            default:
                throw new RuntimeException("No such element: " + String.valueOf(winPredictor));
        }
        return point;
    }

    private char getWinShapeAgainst(char oppenentShape) {
        switch (oppenentShape) {
            // Lose
            case 'A':
                return 'B';
            // draw
            case 'B':
                return 'C';
            // win
            case 'C':
                return 'A';
            default:
                throw new RuntimeException("No such element: " + String.valueOf(oppenentShape));
        }
    }

    private char getLoseShapeAgainst(char oppenentShape) {
        switch (oppenentShape) {
            // Lose
            case 'A':
                return 'C';
            // draw
            case 'B':
                return 'A';
            // win
            case 'C':
                return 'B';
            default:
                throw new RuntimeException("No such element: " + String.valueOf(oppenentShape));
        }
    }

}
