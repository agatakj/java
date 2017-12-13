package triangledemo.java;

import java.util.Scanner;

/**
 *
 * @author Agata Jelen CSD 141 Fall 2017
 */
public class RightTriangle {

    private double legA;
    private double legB;
    private double b;
    private double a;

    /**
     * Constructor- Accepts legs of the right triangle as arguments. Constructor
     * throws Illegal Argument Exception when one or both legs are set to 0 or
     * negative number(s)
     *
     * @param a
     * @param b
     */
    @SuppressWarnings("empty-statement")
    public RightTriangle(double a, double b) {
        legA = a;
        legB = b;

        if (a < 0.00 || b < 0.00) {
            throw new IllegalArgumentException("Legs "
                    + " cannot be negative");
        }

    }

    /**
     * The setLegA method stores a value in the legA field.
     *
     * @param a the value to store in legA
     */
    public void setLegA(double a) {
        legA = a;
    }

    /**
     * TThe setLegB method stores a value in the legB field.
     *
     * @param b the value to store in legB
     */
    public void setLegB(double b) {
        legB = b;
    }

    /**
     * The getLegA method returns a RightTriangle object's legA.
     *
     * @return The value in the legA field.
     */
    public double getLegA() {
        return legA;
    }

    /**
     * The getLegB method returns a RightTriangle object's legB.
     *
     * @return The value in the legB field.
     */
    public double getLegB() {
        return legB;
    }

    /**
     * The getArea method returns a RightTriangle object's area.
     *
     * @return The product of length times width.
     */
    public double getArea() {
        return (0.5) * (legA * legB);
    }

    /**
     * The getHypotenuse method returns a Hypotenuse object's area.
     * @return Hypotenuse
     */
    public double getHypotenuse() {
        return Math.sqrt(legA * legA + legB * legB);
    }

    /**
     * The getPerimeter method returns a Perimeter object's area.
     * @return Perimeter
     */
    public double getPerimeter() {
        return (legA + legB + Math.sqrt(legA * legA + legB * legB));
    }

}