package com.stir.cscu9t4practical1;

// Subclass for sprint training sessions
public class SprintEntry extends Entry {
    private int repetitions; // Number of repetitions
    private int recovery; // Recovery time in minutes

    // Constructor
    public SprintEntry(String name, int day, int month, int year, int hour, int minute, int second, float distance,
            int repetitions, int recovery) {
        super(name, day, month, year, hour, minute, second, distance);
        this.repetitions = repetitions;
        this.recovery = recovery;
    }

    // Redefinition of the getEntry method for sprint sessions
    @Override
    public String getEntry() {
        return getName() + " sprinted " + repetitions + "x" + (int) getDistance() + "m in " + getHour() + ":"
                + getMin() + ":" + getSec() + " with " + recovery + " minutes recovery on " + getDay() + "/"
                + getMonth() + "/" + getYear() + "\n";
    }

    // Getter method for repetitions
    public int getRepetitions() {
        return repetitions;
    }

    // Getter method for recovery
    public int getRecovery() {
        return recovery;
    }
}
