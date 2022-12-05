package day2;

public class MainRockPaperScissors {

    // 1 for Rock, 2 for Paper, and 3 for Scissors
    protected int getShapeReward(char shape) {
        int shapeReward = 0;
        switch (shape) {
            case 'A':
                shapeReward = 1;
                break;
            case 'B':
                shapeReward = 2;
                break;
            case 'C':
                shapeReward = 3;
                break;
            default:
                break;
        }
        return shapeReward;
    }

    // 0 for lost 3 for draw 6 for win
    protected int getWinReward(char oppenentShape, char myShape) {
        int winReward = 0;
        if (oppenentShape == myShape) {
            return 3;
        }
        if (isWinResult(oppenentShape, myShape)) {
            winReward = 6;
        }
        return winReward;
    }

    protected boolean isWinResult(char oppenentShape, char myShape) {
        return myShape == 'A' && oppenentShape == 'C'
                || myShape == 'B' && oppenentShape == 'A'
                || myShape == 'C' && oppenentShape == 'B';
    }
}
