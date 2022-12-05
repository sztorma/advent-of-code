package day3;

import java.util.Set;
import java.util.stream.Collectors;

public class Rucksack {

    private String compartment1;
    private String compartment2;

    public String getCompartment1() {
        return compartment1;
    }

    public String getCompartment2() {
        return compartment2;
    }

    public Rucksack(String line) {
        int halfIndex = line.length() / 2;
        compartment1 = line.substring(0, halfIndex);
        compartment2 = line.substring(halfIndex);
    }

    public char getCommonChar() {
        Set<Character> charSet1 = compartment1.chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet());
        Set<Character> charSet2 = compartment2.chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet());
        charSet1.retainAll(charSet2);
        return charSet1.iterator().next();
    }

    public Set<Character> getRuckSackCharSet() {
        return compartment1.concat(compartment2).chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.toSet());
    }

}
