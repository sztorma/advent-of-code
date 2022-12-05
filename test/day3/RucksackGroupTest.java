package day3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class RucksackGroupTest {

    @Test
    public void testGetCharOfRucksackGroup() {
        List<Rucksack> rucksacks = new LinkedList<>();
        rucksacks.add(new Rucksack("nuls"));
        rucksacks.add(new Rucksack("bulr"));
        rucksacks.add(new Rucksack("nbol"));

        RuckSackGroup ruckSackGroup = new RuckSackGroup(rucksacks);
        char commonChar = ruckSackGroup.getCommonCharOfRucksackGroup();
        assertEquals('l', commonChar);
    }
}
