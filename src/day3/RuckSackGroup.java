package day3;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RuckSackGroup {

    private List<Rucksack> ruckSacks;

    public RuckSackGroup(List<Rucksack> ruckSacks) {
        this.ruckSacks = ruckSacks;
    }

    public char getCommonCharOfRucksackGroup() {
        List<Set<Character>> charSets = new LinkedList<>();
        ruckSacks.forEach(rucksack -> charSets.add(rucksack.getRuckSackCharSet()));
        charSets.get(0).retainAll(charSets.get(1));
        charSets.get(0).retainAll(charSets.get(2));
        return charSets.get(0).iterator().next();
    }
}
