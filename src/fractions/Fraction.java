/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fractions;

/**
 *
 * @author mac
 */
public class Fraction {
    
    /** The numerator of the fraction */
    private final int numerator;
    /** The denominator of the fraction */
    private final int denominator;
    
    /**
     * The fraction constructor. The fraction produced is expressed in simplified form.
     * @param numerator the numerator of the new fraction
     * @param denominator the denominator of the new fraction
     */
    public Fraction(int numerator, int denominator) {

	int gcd = gcd(numerator, denominator);
	this.numerator = numerator / gcd;
	this.denominator = denominator / gcd;

    }

    /**
     * Adds two fractions. The resulting fraction is expressed in simplified form.
     * @param otherFraction the other fraction to add
     * @return the sum of the two fractions
     */
    public Fraction add(Fraction otherFraction) {
	
	int numerator = this.numerator * otherFraction.denominator;
	numerator += this.denominator * otherFraction.numerator;

	int denominator = this.denominator * otherFraction.denominator;
    	return new Fraction(numerator, denominator);
    }

    /**
     * String representation of the fraction. Expressed as numerator/denominator.
     * @return the string representation of the fraction.
     */
    public String toString() {
    	return this.numerator + "/"  + this.denominator;
    }

    /**
     * Greatest Common Denominator using Euclid's algorithm.
     * @param a one of the numbers to find the gcd of
     * @param b the other number to find the gcd of
     * @return the greatest common divisor of a and b
     */
    private int gcd(int a, int b) {
    	if ( b == 0) {
            return a;
	} else {
	    return gcd(b, a % b);
	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Test constructors	    
	Fraction a = new Fraction (12, 20);
	Fraction b = new Fraction(6, 20);
	Fraction c = new Fraction(1, 4);
	Fraction d = new Fraction(3, 5);
        Fraction e = new Fraction(6, 2);

	// Test toString
	System.out.println("Fraction a: " + a);
	System.out.println("Fraction b: " + b);
	System.out.println("Fraction c: " + c);
	System.out.println("Fraction d: " + d);
	System.out.println("Fraction e: " + e);

        // Test addition
	Fraction newA = a.add(b);
	Fraction newB = b.add(c);
	Fraction newC = c.add(d);
	Fraction newD = d.add(e);
	Fraction newE = e.add(a);

	// Print results
	System.out.println(a + " + " + b + " = " + newA );
	System.out.println(b + " + " + c + " = " + newB );
	System.out.println(c + " + " + d + " = " + newC );
	System.out.println(d + " + " + e + " = " + newD );
	System.out.println(e + " + " + a + " = " + newE );

    }
    
}
