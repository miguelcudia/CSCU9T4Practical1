// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.*;

public class TrainingRecord {
    private List<Entry> tr;

    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } // constructor

    // add a record to the list
    public void addEntry(Entry e) {
        // Check if an entry for the same person on the same day already exists
        boolean isDuplicate = tr.stream()
                .anyMatch(entry -> entry.getName().equals(e.getName()) &&
                        entry.getDay() == e.getDay() &&
                        entry.getMonth() == e.getMonth() &&
                        entry.getYear() == e.getYear());

        // If it's not a duplicate, add the entry
        if (!isDuplicate) {
            tr.add(e);
        }
    }

    // look up the entry of a given day and month
    public String lookupEntry(int d, int m, int y) {
        ListIterator<Entry> iter = tr.listIterator();
        String result = "No entries found";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay() == d && current.getMonth() == m && current.getYear() == y)
                result = current.getEntry();
        }
        return result;
    } // lookupEntry

    public String lookupEntries(int day, int month, int year) {
        StringBuilder result = new StringBuilder();
        boolean entriesFound = false;

        for (Entry entry : tr) {
            if (entry.getDay() == day && entry.getMonth() == month && entry.getYear() == year) {
                result.append(entry.getEntry());
                entriesFound = true;
            }
        }

        if (!entriesFound) {
            return "Sorry couldn't find anything for this date";
        }

        return result.toString();
    }

    // Method to retrieve all entries on a given date in a single string
    public String getAllEntriesByDate(int d, int m, int y) {
        StringBuilder result = new StringBuilder();
        boolean entriesFound = false;

        for (Entry entry : tr) {
            if (entry.getDay() == d && entry.getMonth() == m && entry.getYear() == y) {
                result.append(entry.getEntry());
                entriesFound = true;
            }
        }

        if (!entriesFound) {
            return "No entries found for " + d + "/" + m + "/" + y;
        }

        return result.toString();
    }

    public boolean removeEntry(String name, int day, int month, int year) {
        for (int i = 0; i < tr.size(); i++) {
            Entry entry = tr.get(i);
            if (entry.getName().equals(name) && entry.getDay() == day &&
                    entry.getMonth() == month && entry.getYear() == year) {
                tr.remove(i);
                return true; // Entry removed successfully
            }
        }
        return false; // No matching entry found
    }

    // Count the number of entries
    public int getNumberOfEntries() {
        return tr.size();
    }

    // Clear all entries
    public void clearAllEntries() {
        tr.clear();
    }

    // Method to get the list of Entry objects in the TrainingRecord
    public List<Entry> getTrainingRecords() {
        return tr;
    }

} // TrainingRecord