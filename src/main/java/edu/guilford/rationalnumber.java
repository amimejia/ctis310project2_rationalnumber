package edu.guilford;

import java.util.Random;
import java.util.Scanner;

public class rationalnumber {
    public static void main(String[] args) {
        // Print out toString Method from Rational Class
        Rational ra1 = new Rational(0, 1);
        System.out.println("Here's my rational with 0 as numerator and 1 as denominator: " + ra1);//.toString());

        // Print negate method from Rational Class
        Rational ra2 = new Rational(3, 12);
        ra2.negate();
        System.out.println("Input: 3/12; " + "Expected Output: -3/12:  " + ra2);

        // Print invert method from Rational Class
        Rational ra3 = new Rational(5, 24);
        //System.out.println("Rational Number here should be 5 / 24: " + ra3);
        ra3.invert();
        System.out.println("Input: 5/24; " + "Expected Output: 24/5 " + ra3);

        // Print toDouble method from Rational Class
        Rational ra4 = new Rational(11, 12);
        //System.out.println("Rational Number here should be 11 / 12: " + ra4);
        System.out.println("Input: 11/12; " + "Expected Output: 9166666666666666:"  + ra4.toDouble());

        // Print reduce method from Rational Class
        Rational ra5 = new Rational(34, 27);
        System.out.println("Input: 34/27; " + "Expected Output: User p and q variable:" + ra5);

        // Trying out Euclid's Algorithm with User

        Rational ra6 = new Rational();

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a numerator: ");
        int p = user.nextInt();
        System.out.println("Enter denominator: ");
        int q = user.nextInt();

        System.out.println("The greatest common divisor of " + p + " and " + q + " is: " + ra6.reduce(p, q));

        //use p and q and add a new rational number to create a new rational number
        Rational ra7 = new Rational(p, q);
        Rational ra8 = new Rational(3, 4);
        System.out.println("The sum of user input " + ra7 + " and " + ra8 + " is: " + ra7.add(ra8));

        //Testing out the random number generator 
        Rational ra9 = new Rational();
        System.out.println("Here's my rational with random numerator and denominator: " + ra9.toString());
        
    }


}
