package day4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import day4.model.ElfPair;

public class ElfPairTest {

    @Test
    public void testTextLineConstructor() {
        ElfPair elfPair = new ElfPair("1-2,3-4");
        assertEquals(1, elfPair.getElfA().getSection().getFrom());
        assertEquals(2, elfPair.getElfA().getSection().getTo());
        assertEquals(3, elfPair.getElfB().getSection().getFrom());
        assertEquals(4, elfPair.getElfB().getSection().getTo());

    }

    @Test
    public void testIsAnyElfSectionsFullyContainOtherNoLap() {
        ElfPair elfPair = new ElfPair("0-1,2-3");
        ElfPair elfPairReverse = new ElfPair("2-3,0-1");

        assertEquals(false, elfPair.isAnyElfSectionsFullyContainOther());
        assertEquals(false, elfPairReverse.isAnyElfSectionsFullyContainOther());

    }

}
