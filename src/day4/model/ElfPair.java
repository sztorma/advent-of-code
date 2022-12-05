package day4.model;

public class ElfPair {

    private Elf elfA;
    private Elf elfB;

    // 1-2,3-4
    public ElfPair(String textLine) {
        int indexOfComma = textLine.indexOf(",");
        String textSectionA = textLine.substring(0, indexOfComma);
        String textSectionB = textLine.substring(indexOfComma + 1);
        this.elfA = new Elf(new Section(textSectionA));
        this.elfB = new Elf(new Section(textSectionB));
    }

    public Elf getElfA() {
        return elfA;
    }

    public Elf getElfB() {
        return elfB;
    }

    public boolean isAnyElfSectionsFullyContainOther() {
        return elfA.getSection().isAnyContainsOther(elfB.getSection());
    }

    public boolean isAnyElfSectionsOverlapped() {
        return elfA.getSection().isOverlapped(elfB.getSection());
    }

}
