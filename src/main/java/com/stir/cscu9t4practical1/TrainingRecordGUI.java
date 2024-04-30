// GUI and main program for the Training Record
package com.stir.cscu9t4practical1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrainingRecordGUI extends JFrame implements ActionListener {

    private JTextField name = new JTextField(30);
    private JTextField day = new JTextField(2);
    private JTextField month = new JTextField(2);
    private JTextField year = new JTextField(4);
    private JTextField hours = new JTextField(2);
    private JTextField mins = new JTextField(2);
    private JTextField secs = new JTextField(2);
    private JTextField dist = new JTextField(4);
    private JLabel labn = new JLabel(" Name:");
    private JLabel labd = new JLabel(" Day:");
    private JLabel labm = new JLabel(" Month:");
    private JLabel laby = new JLabel(" Year:");
    private JLabel labh = new JLabel(" Hours:");
    private JLabel labmm = new JLabel(" Mins:");
    private JLabel labs = new JLabel(" Secs:");
    private JLabel labdist = new JLabel(" Distance (km):");
    private JButton addR = new JButton("Add");
    private JButton lookUpByDate = new JButton("Look Up");
    private JButton findAllByDate = new JButton("Find All By Date"); // New button
    // Add buttons for different entry types
    private JButton addRunEntry = new JButton("Add Run Entry");
    private JButton addSwimEntry = new JButton("Add Swim Entry");
    private JButton addCycleEntry = new JButton("Add Cycle Entry");
    // Add remove button
    private JButton removeEntry = new JButton("Remove");

    private TrainingRecord myAthletes = new TrainingRecord();

    private JTextArea outputArea = new JTextArea(5, 50);

    public static void main(String[] args) {
        TrainingRecordGUI aplic = new TrainingRecordGUI();
    } // main

    // set up the GUI
    public TrainingRecordGUI() {
        super("Training Record");
        setLayout(new FlowLayout());
        add(labn);
        add(name);
        name.setEditable(true);
        add(labd);
        add(day);
        day.setEditable(true);
        add(labm);
        add(month);
        month.setEditable(true);
        add(laby);
        add(year);
        year.setEditable(true);
        add(labh);
        add(hours);
        hours.setEditable(true);
        add(labmm);
        add(mins);
        mins.setEditable(true);
        add(labs);
        add(secs);
        secs.setEditable(true);
        add(labdist);
        add(dist);
        dist.setEditable(true);
        add(addR);
        addR.addActionListener(this);
        add(lookUpByDate);
        lookUpByDate.addActionListener(this);
        add(findAllByDate);
        findAllByDate.addActionListener(this);
        // Add ActionListener for the new button
        add(addRunEntry);
        addRunEntry.addActionListener(this);
        add(addSwimEntry);
        addSwimEntry.addActionListener(this);
        add(addCycleEntry);
        addCycleEntry.addActionListener(this);
        add(removeEntry);
        removeEntry.addActionListener(this);
        add(outputArea);
        outputArea.setEditable(false);
        setSize(720, 250);
        setVisible(true);
        blankDisplay();

        // To save typing in new entries while testing, uncomment
        // the following lines (or add your own test cases)

    } // constructor

    // Modified actionPerformed method to handle different entry types
    public void actionPerformed(ActionEvent event) {
        String message = "";
        if (event.getSource() == removeEntry) {
            message = removeEntry();
        } else if (event.getSource() == addRunEntry) {
            message = addEntry("run");
        } else if (event.getSource() == addSwimEntry) {
            message = addEntry("swim");
        } else if (event.getSource() == addCycleEntry) {
            message = addEntry("cycle");
        }
        outputArea.setText(message);
        blankDisplay();
    }

    // Modified addEntry method to handle different entry types
    public String addEntry(String type) {
        String message = "Record added\n";
        System.out.println("Adding " + type + " entry to the records");
        // Depending on the type, create the corresponding entry object
        if (type.equals("run")) {
            // Create RunEntry object
        } else if (type.equals("swim")) {
            // Create SwimEntry object
        } else if (type.equals("cycle")) {
            // Create CycleEntry object
        }
        // Add the entry to the training record
        return message;
    }

    // Implement removeEntry method to remove an entry
    public String removeEntry() {
        String message = "Record removed\n";
        String n = name.getText();
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        // Call TrainingRecord method to remove entry
        boolean removed = myAthletes.removeEntry(n, d, m, y);
        if (!removed) {
            message = "No record found for the given details";
        }
        return message;
    }

    public String lookupEntry() {
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        outputArea.setText("looking up record ...");
        String message = myAthletes.lookupEntry(d, m, y);
        return message;
    }

    // Method to find all entries for a specific date
    public String findAllEntriesByDate() {
        int d = Integer.parseInt(day.getText());
        int m = Integer.parseInt(month.getText());
        int y = Integer.parseInt(year.getText());

        // Use the TrainingRecord method to retrieve all entries for the specified date
        String entries = myAthletes.getAllEntriesByDate(d, m, y);

        return entries;
    }

    public void blankDisplay() {
        name.setText("");
        day.setText("");
        month.setText("");
        year.setText("");
        hours.setText("");
        mins.setText("");
        secs.setText("");
        dist.setText("");

    }// blankDisplay
     // Fills the input fields on the display for testing purposes only

    public void fillDisplay(Entry ent) {
        name.setText(ent.getName());
        day.setText(String.valueOf(ent.getDay()));
        month.setText(String.valueOf(ent.getMonth()));
        year.setText(String.valueOf(ent.getYear()));
        hours.setText(String.valueOf(ent.getHour()));
        mins.setText(String.valueOf(ent.getMin()));
        secs.setText(String.valueOf(ent.getSec()));
        dist.setText(String.valueOf(ent.getDistance()));
    }

} // TrainingRecordGUI
