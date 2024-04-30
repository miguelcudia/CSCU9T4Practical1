package com.stir.cscu9t4practical1;

import java.util.Calendar;

// Subclass for swimming training sessions
public class SwimEntry extends Entry {
    private int laps; // Number of laps swum
    private String where; // Location of the swim

    // Constructor
    public SwimEntry(String name, int day, int month, int year, int hour, int minute, int second, float distance,
            String where) {
        super(name, day, month, year, hour, minute, second, distance);
        this.laps = laps;
        this.where = where;
    }

    // Redefinition of the getEntry method for swimming sessions
    @Override
    public String getEntry() {
        return getName() + " swam " + getDistance() + " km " + where + " in " +
                getDateAndTime().get(Calendar.HOUR_OF_DAY) + ":" + getDateAndTime().get(Calendar.MINUTE) +
                ":" + getDateAndTime().get(Calendar.SECOND) + " on " +
                getDateAndTime().get(Calendar.DATE) + "/" + (getDateAndTime().get(Calendar.MONTH) + 1) +
                "/" + getDateAndTime().get(Calendar.YEAR) + "\n";
    }

    // Getter method for the location of the swim
    public String getWhere() {
        return "in a " + where;
    }
}
