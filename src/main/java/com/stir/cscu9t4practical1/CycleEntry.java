package com.stir.cscu9t4practical1;

// Subclass for cycling training sessions
public class CycleEntry extends Entry {
    private String terrain; // Type of terrain
    private String tempo; // Speed of cycling

    // Constructor
    public CycleEntry(String name, int day, int month, int year, int hour, int minute, int second, float distance,
            String terrain, String tempo) {
        super(name, day, month, year, hour, minute, second, distance);
        this.terrain = terrain;
        this.tempo = tempo;
    }

    // Redefinition of the getEntry method for cycling sessions
    @Override
    public String getEntry() {
        return getName() + " cycled " + getDistance() + " km in " + getHour() + ":" + getMin() + ":" + getSec() +
                " on " + getDay() + "/" + getMonth() + "/" + getYear() + " on " + terrain + " at " + tempo + " tempo\n";
    }

    // Getter method for terrain
    public String getTerrain() {
        return terrain;
    }

    // Getter method for tempo
    public String getTempo() {
        return tempo;
    }
}
