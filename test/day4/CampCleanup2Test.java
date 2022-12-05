package day4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CampCleanup2Test {

    private static final String PATH = "/home/sztorma/development/advent-of-code/test/day4/input/";

    private static CampCleanup2 campCleanup2;

    @BeforeAll
    public static void setup() {
        campCleanup2 = new CampCleanup2();
    }

    @Test
    public void testGetSolutionSample() {
        String fileName = PATH + "input-sample.txt";
        int result = campCleanup2.getSolution(fileName);
        assertEquals(4, result);
    }

    @Test
    public void testGetSolutionLive() {
        String fileName = PATH + "input-live.txt";
        int result = campCleanup2.getSolution(fileName);
        assertEquals(792, result);
    }
}
