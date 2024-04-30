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
        tr.add(e);
    } // addClass

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