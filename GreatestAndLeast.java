package greatestandleast;

import java.util.Scanner;

/**
 * @student Agata Jelen CSD 141 Fall 2017
 * 
 * Algorithm Notes: variables are declared with greatest being set to the absolute lowest 
 * int value (to ensure that any user number will be stored as the greatest as it will 
 * be greater than the lowest possible value), and smallest with the absolute 
 * greatest int. value to ensure user numbers will be smaller. 
 * Output for program instructions are displayed prior to 
 * requesting input from user. The user is prompted for 
 * integers with a try/catch statement in case they 
 * enter anything other than an integer. 
 * As the user enters integers, the numbers are converted and placed 
 * within a for loop for evaluation. A temporary variable stores the numbers 
 * that are neither the greatest and smallest and will compare the values of n(formatted user input) 
 * to decide which number provided was greatest or smallest. 
 * The calculation and evaluation does not include the sentinel value as the example
 * also did not use the value as part of the evaluation process.
 * 
 */
public class GreatestAndLeast 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Scanner input added to gather user integer input    
    Scanner input=new Scanner(System.in);
    //String number declared to hold values of integer input
    String number;
    //int greatest declared with the lowest possible int value to ensure the user's number becomes greatest for comparison
    int greatest=Integer.MIN_VALUE;
    //int smallest declared with the highest possible int value to ensure that the user's number becomes the smallest number for comparison
    int smallest=Integer.MAX_VALUE;
    //int temp added to reassign values for comparison
    int temp;
    //int n is for the input conversion from string to int
    int n=0;
    //sentinel value declared for exiting program
    int sentinel=-99;

    
    //initial output instruction for exiting the program
    System.out.println("To finish entering integers, enter -99 when finished.");
    //output for request for user integers
    System.out.println("Enter your integers here:");

    //for loop added to evaluate the user's integer input
    for(int i=0; n!=sentinel; i++)
    {  //String number to collect the user's input
        number=input.next();
       //number trimmed to remove white space prior to converting to int
        number=number.trim();
        
         //exception try statement to ensure only integers are input
         try
           {//int n converts string to number format
            n=Integer.parseInt(number);
           }
        //exception catch statement for NumberFormatExceptions if input is anything other than int
         catch (NumberFormatException e)
           {//output for error if user enters the wrong format
            System.out.println("Oops! That's not an integer, please try again.");
            //continue statement to continue the remainder of the code once input is received (this ensures if the user enters an incorrect integer then quits it does not output 'No numbers were entered' followed by 'the largest number is: 0 the smallest number is: 0'. As recommended by Tom in tutoring.
            continue;
           }
        
        //int temp holds the value of n for comparison 
        temp=n;
        
         //if statement for if the temp var is greater than greatest (excluding the sentinel value) 
         if(temp>=greatest && temp!=sentinel)
            //int greatest is assigned the value of n
            {greatest=n;}
         //if statement for if the temp var is less than or equal to the smallest (excluding sentinel value)
         if(temp<=smallest && temp!=sentinel)
        { //temp becomes the smallest
          smallest=temp;}
    }
 //if statement for if the smallest number remains unchanged, (no int values received) user stopped program without providing integers       
 if(smallest==2147483647)
 {// prompting for no input
  System.out.print("No numbers were entered!");}
 //else statemenf for if user input was received
 else{
    //output for largest and smallest number
    System.out.printf("\nThe largest number: %d The smallest number: %d!",greatest,smallest);
 }}  
    }