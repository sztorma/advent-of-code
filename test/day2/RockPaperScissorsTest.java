package day2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RockPaperScissorsTest {

    private static final String PATH = "/home/sztorma/development/advent-of-code/test/day2/";

    @Test
    void testCalculatePoints() {
        RockPaperScissors instance = new RockPaperScissors();
        int result = instance.calculatePoints(PATH + "input.txt");
        assertEquals(13924, result);
    }

    @Test
    void testCalculatePointsForSampleFile() {
        RockPaperScissors instance = new RockPaperScissors();
        int result = instance.calculatePoints(PATH + "input1.txt");
        assertEquals(15, result);
    }

    @Test
    void testCalculatePointsRockWin() {
        RockPaperScissors instance = new RockPaperScissors();
        int result = instance.calculatePoints(PATH + "input-rock-win.txt");
        assertEquals((1 + 6), result);
    }

    @Test
    void testCalculatePointsRockLose() {
        RockPaperScissors instance = new RockPaperScissors();
        int result = instance.calculatePoints(PATH + "input-rock-lose.txt");
        assertEquals(1, result);
    }

    @Test
    void testCalculatePointsPaperWin() {
        RockPaperScissors instance = new RockPaperScissors();
        int result = instance.calculatePoints(PATH + "input-paper-win.txt");
        assertEquals((2 + 6), result);
    }

    @Test
    void testCalculatePointsPaperLose() {
        RockPaperScissors instance = new RockPaperScissors();
        int result = instance
                .calculatePoints(PATH + "input-paper-lose.txt");
        assertEquals(2, result);
    }

    @Test
    void testCalculatePointsScissorsWin() {
        RockPaperScissors instance = new RockPaperScissors();
        int result = instance
                .calculatePoints(PATH + "input-scissors-win.txt");
        assertEquals((3 + 6), result);
    }

    @Test
    void testCalculatePointsScissorsLose() {
        RockPaperScissors instance = new RockPaperScissors();
        int result = instance
                .calculatePoints(PATH + "input-scissors-lose.txt");
        assertEquals(3, result);
    }
}
