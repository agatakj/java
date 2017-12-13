package inputvalidationmethods;

import java.util.Scanner; // Scanner utility added for collecting user input
import java.io.*; //java.io called to handle exceptions (although, I use the try method and handle the exceptions directly as requested by the assignment, my system doesn't seem to think its needed).

/**
 * @author Agata Jelen CSD 141 Fall 2017 
 *
 * Algorithm Notes: 
 * Starting with the initial file, I added a loop within the methods 
 * outputing the String prompt from main, requesting an integer and a double value for each 
 * method and run a loop until the corresponding value is accepted and parsed. Values are returned 
 * to main and are output for the user like inputValidation.java.
 **/

public class InputValidationMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int a declared calling validateInt function with prompt
        int a = validateInt("Please enter an integer: ");
        //double b declared calling validateInt function with prompt
        double b = validateDouble("Please enter a real number: ");
        //output for integer number once correct value is obtained from method validateInt
        System.out.printf("\nThe integer number you entered is: %d", a);
        //output for real number once correct value is obtained from method validateDouble
        System.out.printf("\nThe real number you entered is: %f\n", b);
    }

    /**
     *
     * @param prompt
     * @return - n (int value for a)
     * @throws NumberFormatException
     */
    public static int validateInt(String prompt) throws NumberFormatException {
        //boolean runMethod declared to run the program until valid integer is obtained
        boolean runMethod = true;
        //scanner for collecting user feedback for var n
        Scanner input = new Scanner(System.in);
        //int n initialization
        int n = 0;
        //while loop started for validating the integer
        while (runMethod) {
            //system prompt output to user for input
            System.out.print(prompt);
            //userInput string declared for user input for integer, trimmed to remove excess whitespace
            String userInput = input.next().trim();
            //try statement added to format string to integer
            try {
                //Integer parsing to change userInput format from string to integer
                n = Integer.parseInt(userInput);
                //if no exception is caught, loop ends and returns the value for n
                runMethod=false;
            } //catch statement added for input that cannot be parsed to integer
            catch (NumberFormatException e) {
                //error message from inputValidation file
                System.out.println("INPUT ERROR: Please enter an integer number!!");
                //error message from exception displayed
                System.out.println(e.getMessage());
                //method loops for integer value
                runMethod = true;
            }
        }
        //once correct integer input is received, value for int n is returned to main
        return n;
    }
/**
 * 
 * @param prompt
 * @return - n (double value for b)
 * @throws NumberFormatException 
 */
    public static double validateDouble(String prompt) throws NumberFormatException {
        //double n declared with initialization
        double n = 0;
        //while loop started for running the Method
        boolean runMethod = true;
        //Scanner added for collecting user input
        Scanner input = new Scanner(System.in);
        
        // While loop started for validating the double 
        while (runMethod) {
            //prompt output to user for double value
            System.out.print(prompt);
            //userInput string declared for user input for double, trimmed to remove excess whitespace
            String userInput = input.next().trim();
            //try statement added for validating double
            try {
                //double n is parsed to convert string into double
                n = Double.parseDouble(userInput);
                //if no exceptions found, loop ends and value returned
                runMethod=false;
            } //catch statement added for NumberFormatExceptions 
            catch (NumberFormatException e) {
                //error message from inputValidation 
                System.out.println("INPUT ERROR: Please enter a real number!!");
                //output from NumberFormatException
                System.out.println(e.getMessage());
                //loop is repeated until double value is accepted
                runMethod = true;
            }
        }
        //double n is returned to b from main
        return n;
    }
}
