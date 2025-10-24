package com.ashwin.assignmenttwo;

/**
 * Main class to demonstrate Student and Commission classes.
 */
public class MainClass {
    public static void main(String[] args) {
        // Demonstrating Student class
        Student s = new Student();

        // Demonstrating Commission class
        Commision emp = new Commision();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}
