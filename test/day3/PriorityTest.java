package day3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PriorityTest {

    @Test
    void testGetPriorityOfCaseSensitiveCharA() {
        int result = Priority.getPriorityOfCaseSensitiveChar('a');
        assertEquals(1, result);
    }

    @Test
    void testGetPriorityOfCaseSensitiveCharCapitalA() {
        int result = Priority.getPriorityOfCaseSensitiveChar('A');
        assertEquals(27, result);
    }

    @Test
    void testGetPriorityOfCaseSensitiveCharZ() {
        int result = Priority.getPriorityOfCaseSensitiveChar('z');
        assertEquals(26, result);
    }

    @Test
    void testGetPriorityOfCaseSensitiveCharCapitalZ() {
        int result = Priority.getPriorityOfCaseSensitiveChar('Z');
        assertEquals(52, result);
    }
}
