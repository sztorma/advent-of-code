package day4.model;

public class Section {
    private int from;
    private int to;

    // 2-4
    public Section(String textSection) {
        int indexOfDash = textSection.indexOf("-");
        this.from = Integer.parseInt(textSection.substring(0, indexOfDash));
        this.to = Integer.parseInt(textSection.substring(indexOfDash + 1));
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public boolean isAnyContainsOther(Section section) {
        if (isFromOrToSame(section)) {
            return true;
        }

        if (isFromLower(section)) {
            return isToHigher(section);
        } else {
            return !isToHigher(section);
        }

    }

    private boolean isFromOrToSame(Section other) {
        return this.from == other.from || this.to == other.to;
    }

    private boolean isFromLower(Section other) {
        return this.from < other.from;
    }

    private boolean isToHigher(Section other) {
        return this.to > other.to;
    }

    public boolean isOverlapped(Section other) {
        return this.to >= other.from && this.from <= other.to;
    }
}
