/**
 *
 * @author Agata Jelen CSD 141 Fall 2017
 */
public class PointDemo {

    public static void main(String[] args) {
     // Create a Point object, passing 5 and
      // 1 as arguments to the constructor.
        Point box = new Point(5, 1);
        // Display the coordinate x
        System.out.println("The coordinate X is: "
                + box.getX());
        // Display the coordinate y
        System.out.println("The coordinate Y is: "
                + box.getY());
        // call the method move
        box.move(3, 7);
        // Display the coordinates after moving 
        System.out.println("The coordinates after moving are "
                + "(" + box.getX() + "," + box.getY() + ")");
        // call the method rotate
        box.rotate();
        // Display the coordinates after rotation 
        System.out.println("The coordinates after rotation are "
                + "(" + box.getX() + "," + box.getY() + ")");
    }
}