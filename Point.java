/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agata Jelen CSD 141 Fall 2017
 */
public class Point {

    /**
     *
     */
    private double x;
    private double y;

    /**
     * non-default constructor that takes x and y coordinate of the point and
     * sets member variables
     *
     * @param x is the x of our point
     * @param y is the y of our point
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * default constructor that sets the point coordinates to (0,0)
     */
    public Point() {
        this(0, 0);
    }

    /**
     * Method setXY sets the private data after an object of this class is
     * created
     *
     * @param x The value to store in x
     * @param y The value to store in y
     */
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The getX method returns a point object's x.
     *
     * @return the value in the x field
     */
    public double getX() {
        return x;
        //return yy;
    }

    /**
     * The getY method returns a point object's y.
     *
     * @return the value in the y field
     */
    public double getY() {
        return y;

    }

    /**
     * The move method moves the point by an amount along the vertical and
     * horizontal directions specified by the first and second arguments:
     * move(double dx, double dy)
     *
     * @param dx - the distance to move this point along the x axis.
     * @param dy - the distance to move this point along the y axis.
     */
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    /**
     * The rotate method rotate the point by 90 degrees clockwise around the
     * origin. 
     * Rotating a point 90 degrees clockwise around the origin means
     * that if x and y are positive , you are in the 1st quadrant, 90 degrees
     * will rotate the point into a positive x and a negative y.
     *
     * Rotating a point 90 degrees clockwise around the origin means that if x
     * is positive and y is negative , you are in the 2st quadrant, 90 degrees
     * will rotate the point into a negative x and a negative y. 
     * 
     * Rotating a point 90 degrees clockwise around the origin means that if x is negative
     * and y is negative , you are in the 3rd quadrant, 90 degrees will rotate
     * the point into a negative x and a positive y. 
     * 
     * Rotating a point 90 degrees clockwise around the origin means that if x 
     * is negative and y is positive
     * , you are in the 4th quadrant, 90 degrees will rotate the point into a
     * positive x and a positive y.
     *
     */
    public void rotate() {
        x = x - y;
        y = x;
    }
}