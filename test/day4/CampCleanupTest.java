package day4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CampCleanupTest {

    private static final String PATH = "/home/sztorma/development/advent-of-code/test/day4/input/";

    private static CampCleanup campCleanup;

    @BeforeAll
    public static void setup() {
        campCleanup = new CampCleanup();
    }

    @Test
    public void testGetSolutionSample() {
        String fileName = PATH + "input-sample.txt";
        int result = campCleanup.getSolution(fileName);
        assertEquals(2, result);
    }

    @Test
    public void testGetSolutionLive() {
        String fileName = PATH + "input-live.txt";
        int result = campCleanup.getSolution(fileName);
        assertEquals(538, result);
    }
}
