package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class Entry {
  private String name;
  private Calendar dateAndTime;
  private float distance;
  private String terrain; // Type of terrain
  private String tempo; // Speed of cycling
  private int repetitions; // Number of repetitions
  private int recovery; // Recovery time in minutes

  public Entry(String n, int d, int m, int y, int h, int min, int s, float dist) {
    name = n;
    Calendar inst = Calendar.getInstance();
    inst.set(y, m - 1, d, h, min, s);
    dateAndTime = inst;
    distance = dist;

  } // constructor

  public String getName() {
    return name;
  } // getName

  public int getDay() {
    return dateAndTime.get(Calendar.DATE);
  } // getDay

  public int getMonth() {
    int month = dateAndTime.get(Calendar.MONTH) + 1;
    return month;
  } // getMonth

  public int getYear() {
    return dateAndTime.get(Calendar.YEAR);
  } // getYear

  public int getHour() {
    return dateAndTime.get(Calendar.HOUR);
  } // getHour

  public int getMin() {
    return dateAndTime.get(Calendar.MINUTE);
  } // getMin

  public int getSec() {
    return dateAndTime.get(Calendar.SECOND);
  } // getSec

  public float getDistance() {
    return distance;
  } // getYear

  // Getter method for terrain
  public String getTerrain() {
    return terrain;
  }

  // Getter method for tempo
  public String getTempo() {
    return tempo;
  }

  // Getter method for repetitions
  public int getRepetitions() {
    return repetitions;
  }

  // Getter method for recovery
  public int getRecovery() {
    return recovery;
  }

  // Getter method for dateAndTime
  public Calendar getDateAndTime() {
    return dateAndTime;
  }

  // Getter method for getEntry
  public String getEntry() {
    String result = getName() + " ran " + getDistance() + " km in "
        + getHour() + ":" + getMin() + ":" + getSec() + " on "
        + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
    return result;
  }

} // Entry
