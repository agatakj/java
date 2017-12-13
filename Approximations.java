package approximations;

import java.util.Scanner;

/**
 * @student Jenna Martin
 *
 * Algorithm Notes: to bypass x^0 (which will equal 1) divided by the factorial
 * of 0! (division by 0) I have set the sum to start at 1.0 as anything to the
 * power of 0 will equal one. The remainder of the equation is set to calculate
 * based on the x^i/f factorial keeping the factorial and the loop iteration
 * above 1. As the sum is an accumulator variable, 1 is added to the remainder
 * of the equations as they are looped.
 *
 * To start the program, I declared the variables accordingly and requested a
 * power of e to start with. Try/Catch statements are established for any input
 * other than an integer value. The program then takes the user's number and in
 * a for loop it uses the algorithm to calculate the first 10 approximations for
 * that power of e, with a nested for loop inside for generating the value of
 * the factorials. As it generates the first 10 numbers, the program accumulates
 * the totals (starting with 1 as x^0/0! will generate an exception with the
 * division of zero. Following this for loop a second for loop is created with
 * the same structure with output for the last two required approximation iterations for 50
 * and 100.
 *
 */
public class Approximations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int f (factorials) and i ( approximation iterations of 'n') declared for loop interations
        int i, f;
        //int approximations added to calculate the total # of approximations excluding 0. counter started at 1.
        int approximations = 1;
        //double sum declared and set to 1 because anything to the zero power will equal one.
        double sum = 1.0;
        //double factorial delcared and set to one so it can accumulate properly 
        double factorial = 1.0;
        //boolena runProgram declared for running the program
        boolean runProgram = true;
        //scanner added for user input
        Scanner keyboard = new Scanner(System.in);

        //output for requesting user's selected power of e
        System.out.print("Enter the power of e you would like to start with: ");
        //string userInput for storing the user's input
        String userInput = keyboard.next();
        //userInput trimmed to remove excess whitespace
        userInput = userInput.trim();

        //while loop started for the loop iteration cycle
        while (runProgram) {
            //try statement added for parsing the userInput to int format
            try {
                //integer n declared and userInput string is formatted to integer.
                int n = Integer.parseInt(userInput);

                System.out.printf("\n\nApproximation Values for e^%d:\n\n", n);
                //iteration loop started for how many factors of n to produce
                for (i = 1; i <= 10; i++) {
                    //for loop started for producing the factorial denomination
                    for (f = 1; f <= i; f++) {
                        //factorial accumulation with initialization at 1 so 1*1 =1, 1*2=2, 1*2*3=6, etc.
                        factorial *= f;
                    }
                    //sum accumulated for n^i/factorial total, adding each time i loops
                    sum += (Math.pow(n, i) / factorial);
                    //output for approximation iterations, the 'N' interation, factorial value and sum.
                    System.out.printf("Approximation #:%3d\t'n' iterations:%4d\tFactorial Total:\t%10.2f\tSum:\t%4.5f\n", approximations, i, factorial, sum);
                    //factorial reset to original value before next iteration of a
                    factorial = 1.0;
                    //approximation count increased by iterations of i
                    approximations++;
                }
                //sum variable reset to 1 for loop with approximations for 50 and 100 
                sum = 1.0;
                //external loop for approximation iterations 50 & 100
                //iteration loop started for how many factors of n to produce
                for (i = 1; i <= 100; i++) {
                    //for loop started for producing the factorial denomination
                    for (f = 1; f <= i; f++) {
                        //factorial accumulation with initialization at 1 so 1*1 =1, 1*2=2, 1*2*3=6, etc.
                        factorial *= f;
                    }
                    //sum accumulated for n^i/factorial total, adding each time i loops
                    sum += (Math.pow(n, i) / factorial);
                    
                    //if statement for the output when we reach the 50th and 100th approximation
                    if (i == 50 || i == 100) {//output for approximation iterations, the 'N' interation, factorial value and sum for 50th & 100th iteration.
                        
                        System.out.printf("Approximation #:%3d\t'n' iterations:%4d\tFactorial Total:\t%9.3E\tSum:\t%f\n", approximations, i, factorial, sum);
                        //approximations set to calculate for these final two approximations
                        approximations++;
                    }
                    //factorial reset to original value before next iteration of a
                    factorial = 1.0;
                    //approximation count increased by iterations of i
                }
            } //catch statement for if the user enters a non integer value.
            catch (NumberFormatException e) //output for error message
            {
                System.out.println("I'm sorry, that's not an integer, please try again!");
            }
            //program ends    
            runProgram = false;
        }
    }

}
