package triangledemo.java;

/**
 *
 * @author Agata Jelen CSD 141 Fall 2017
 */
public class TriangleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RightTriangle box = null;
        // Create a Rectangle object, passing Leg a and
        // leg b as arguments to the constructor.
        try {
            box = new RightTriangle(-8.00, 15.00);

        } catch (Exception e) // handle the exception below
        {
            System.out.print("Legs cannot be negative ");
            return;
            // System.out.println(e.getMessage());
        }

        // Display the length.
        System.out.println("The Leg A:         "
                + box.getLegA());

        // Display the width.
        System.out.println("The Leg B:         "
                + box.getLegB());

        // Display the area. 
        System.out.println("The Area is:       "
                + box.getArea());
        // Display the Hypotenuse.
        System.out.println("The Hypotenuse is: " + box.getHypotenuse());
        // Display the Perimeter.
        System.out.println("The Perimeter is:  " + box.getPerimeter());
    }

}