package day3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RucksackReorganizationTest {

    private static final String PATH = "/home/sztorma/development/advent-of-code/test/day3/";

    private static RucksackReorganization rucksackReorganization;

    @BeforeAll
    public static void setup() {
        rucksackReorganization = new RucksackReorganization();
    }

    @Test
    public void testGetSolutionSample() {
        String fileName = PATH + "input-sample.txt";
        int result = rucksackReorganization.getSolution(fileName);
        assertEquals(157, result);
    }

    @Test
    public void testGetSolutionLive() {
        String fileName = PATH + "input-live.txt";
        int result = rucksackReorganization.getSolution(fileName);
        assertEquals(7785, result);
    }
}
