package day3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RucksackReorganization2Test {

    private static final String PATH = "/home/sztorma/development/advent-of-code/test/day3/";

    private static RucksackReorganization2 rucksackReorganization2;

    @BeforeAll
    public static void setup() {
        rucksackReorganization2 = new RucksackReorganization2();
    }

    @Test
    public void testGetSolutionSample() {
        String fileName = PATH + "input-sample.txt";
        int result = rucksackReorganization2.getSolution(fileName);
        assertEquals(70, result);
    }

    @Test
    public void testGetSolutionLive() {
        String fileName = PATH + "input-live.txt";
        int result = rucksackReorganization2.getSolution(fileName);
        assertEquals(2633, result);
    }
}
