package edu.guilford;

import java.util.Random;

public class Rational {
    int numerator;
    int denominator;

    //Constructor that takes no arguments and sets the numberator to 0 and
    // demoninator to 1

    //Modify it so that if there is an attempt to create a rational number with a denominator of 0, than the constructor should selest a new random denominator
    public Rational() {
    try {
        Random rand = new Random();
        int denominator = rand.nextInt( -101) + 201;
        int numerator = rand.nextInt(-101) + 201;
        while (denominator == 0) {
            denominator = rand.nextInt(-101)+201;
        }
        }
    catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }

    //Constructor that takes no arguments where if there is an attempt to create a rational number with a denominator of 0, the denominator is set to 1

    // Second constructor that takes two arguments and sets the numerator and
    // denominator
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // ToString Method that returns a string representation of the rational number
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Method called negate that reverses the sign of the rational number
    public void negate() {
        // void is present to show that the method does not return a value
        // it will perform an action that we will call in the driver program
        numerator = -numerator;

    }

    // Method called invert that swaps the numerator and denominator
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    //Instance Method called toDouble that returns a double representation of the rational number
    //Instance here means that the method will have a return type that is an instance of the class
    public double toDouble() {
        return (double) numerator / denominator;
    }

    //Method called reduce that reduces the rational number to lowest terms
    //Greatest Common Divisor means the largest number that divides evenly into both the numerator and denominator
    //https://introcs.cs.princeton.edu/java/23recursion/Euclid.java.html
    public int reduce(int p, int q) {
        if (q == 0) {
            return p;
        }
        return reduce(q, p%q);
    }

    //Method called add that takes a rational number as an argument and adds it to the current rational number
    public Rational add(Rational ra) {
        int newNumerator = numerator * ra.denominator + ra.numerator * denominator;
        int newDenominator = denominator * ra.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    //Method that prints out code for a warning message if the denominator is 0
    public void warning() {
        if (denominator == 0) {
            System.out.println("Warning: Denominator is 0");
        }
    }



   

}
