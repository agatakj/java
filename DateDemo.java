package datedemo;

import java.text.ParseException;

/**
 *
 * @author agata jelen csd 141 fall
 */
public class DateDemo {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        try {
            //try to catch exception
            // Create a Date object, passing arguments to the constructor
            Date box = new Date("december", 12, 1003);
            // Display the year, day, month.
            System.out.println("----------");
            System.out.println("Date: ");
            System.out.println("--------");
            System.out.println("Year  " + box.getYear());
            System.out.println("Day   " + box.getDay());
            System.out.println("Month " + box.getMonth());
            System.out.println("----------");
            System.out.println("New format: ");
            System.out.println("----------");
            // Display the date in 1st format.
            System.out.println("Date is " + box.format_1());
            // Display the date in 2st format.
            System.out.println("Date is " + box.format_2());
            // Display the date in 3st format.
            System.out.println("Date is " + box.format_3());;
        } catch (Exception e) // handle the exception below
        {
            System.out.print(e.getMessage());
            // throws the Exception
        }
    }

}