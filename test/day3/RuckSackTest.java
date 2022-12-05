package day3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class RuckSackTest {

    @Test
    public void constructorTest() {
        Rucksack instance = new Rucksack("null");
        assertEquals("nu", instance.getCompartment1());
        assertEquals("ll", instance.getCompartment2());
    }

    @Test
    public void testGetCommonChar() {
        Rucksack instance = new Rucksack("abccddBa");
        char result = instance.getCommonChar();
        assertEquals('a', result);
    }

    @Test
    public void testGetCommonCapitalChar() {
        Rucksack instance = new Rucksack("aafbbCCfDD");
        char result = instance.getCommonChar();
        assertEquals('f', result);
    }

    @Test
    public void testGetRucksackCharSet() {
        Rucksack instance = new Rucksack("aabc");
        Set<Character> result = instance.getRuckSackCharSet();
        assertEquals(new HashSet<>(List.of('a', 'b', 'c')), result);
    }
}
