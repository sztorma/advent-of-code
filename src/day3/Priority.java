package day3;

public class Priority {

    public static int getPriorityOfCaseSensitiveChar(char character) {
        int priority = Character.getNumericValue(character);
        int priorityAdjustment = -9;
        if (Character.isUpperCase(character)) {
            priorityAdjustment += 26;
        }
        return priority + priorityAdjustment;
    }
}
