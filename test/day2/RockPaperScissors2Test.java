package day2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class RockPaperScissors2Test {

    private static final String PATH = "/home/sztorma/development/advent-of-code/test/day2/";

    @Test
    void testCalculatePoints() {
        RockPaperScissors2 instance = new RockPaperScissors2();
        int result = instance.calculatePoints(PATH + "input.txt");
        assertEquals(13448, result);
    }

    @Test
    void testCalculatePointsForSampleFile() {
        RockPaperScissors2 instance = new RockPaperScissors2();
        int result = instance.calculatePoints(PATH + "input1.txt");
        assertEquals(12, result);
    }
}
