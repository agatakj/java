package mathtutor;

import java.util.Random;//utility for generating random numbers
import java.util.Scanner;//utility for collecting user input


public class MathTutor {
/**
 * @author Agata Jelen CSD 141 Fall 2017 
 * Algorithm comments:
 * Switch statement used to output based on user selection. 
 * Case 1 generates addition equations with min length formatting (requirement 3), 
 * Case 2 generates subtraction equations with min length formatting (requirement 3), 
 * Case 3 quits the program and the default is set for an invalid selection (requirement 1). 
 * 
 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         //Boolean variable runProgram declared to run menu
          Boolean runProgram=true;
         //string var declaration loopRunner
          String loopRunner;
         //int variable declarations for choice (for switch), userNumber (for input) and finalNumber
          int choice,userNumber,finalNumber;
         //Random number method added
          Random rand=new Random();

    
          
       //while loop started to run the program   
        while(runProgram)
        {  //int declarations for generating the var number1 between 0-999
            int number1=rand.nextInt(999);
           //int declarations for generating the var number2 between 0-999
            int number2=rand.nextInt(999);
            
            //while loop to insure that the larger number is always on top
            while(number2>number1)
            {//a random number will be generated until number2 <= number 1}
                number2=rand.nextInt(999);}

            //Output for the menu for the program
            System.out.println("Welcome to the math tutor program! \nPlease select from the following:\nFor Addition, press 1\nFor Subtraction, press 2\nTo quit this program, press 3.");
              //Scanner keyboard added to collect user input
                Scanner keyboard= new Scanner(System.in);
              //loopRunner variable added to store user input
                loopRunner = keyboard.nextLine(); 
              //.trim method added to remove any whitespace from user input
                loopRunner = loopRunner.trim();
              //var choice used to convert user string to Integer format
                choice = Integer.parseInt(loopRunner); 

                //switch statement declared to select an option from the menu based on user input
                switch(choice)
                {//First case is the addition problems from the menu
                case 1:
                //Output to user selecting the addition option    
                System.out.println("You chose addition, here is the first problem:");
                
                //Output for equation to user with randomly generated numbers
                System.out.printf("\t%5d\n\t+%4d\n\t------\n",number1,number2);
                
                //Output requesting answer from user with spacing to align to the equation
                System.out.print("Answer?:  ");
                
                 //user input stored for var userNumber
                 userNumber=keyboard.nextInt();
                
                 //finalNumber (correct solution) is calculated
                 finalNumber=number1+number2;
                   //if statement added for if userNumber is equal to finalNumber (correct answer)
                    if(userNumber==finalNumber)
                      {//output for user getting the correct answer:
                          System.out.printf("You are correct! %d + %d = %d\n",number1,number2,finalNumber);}
                       //else statement added for if userNumber does not equal finalNumber (wrong answer)
                    else
                      {//output for user getting the incorrect answer
                            System.out.printf("I'm sorry, the correct answer is: %d - %d = %d. Please try again!\n",number1,number2,finalNumber);}
                break;

             //second case declared for if the user selects subtraction from menu
                 case 2:
                   //Output to user selecting the subtraction option
                   System.out.println("You chose subtraction, here is the first problem:");
                   
                   //Output of subtraction equation to user using random number generation.
                   System.out.printf("%5d\n-%4d\n------\n",number1,number2);
                   
                   //User request for solution for var userNumber
                   System.out.printf("Answer?:  ");
                   
                   //user input stored in var userNumber
                   userNumber=keyboard.nextInt();
                   
                   //finalNumber calculated for correct solution to equation
                   finalNumber=number1-number2;
                     
                     //if statement added for if userNumber is equal to finalNumber (correct answer)
                      if(userNumber==finalNumber)
                      {//output for the correct solution
                          System.out.printf("You are correct! %d - %d = %d\n",number1,number2,finalNumber);
                      }
                      //else statement added for if userNumber isn't equal to finalNumber (wrong answer)
                      else
                       {//output for the incorrect solution
                           System.out.printf("I'm sorry, the correct answer is: %d - %d = %d. Please try again!\n",number1,number2,finalNumber);}
                 break;

                 //Third Case declared for if the user chooses to quit from the menu
                 case 3:
                  //output for ending the program
                  System.out.println("Good-bye!");
                   //var runProgram declared false to end while loop
                  runProgram=false;
                 break;

                  //default statment for if the user picks an invalid option from the menu
                 default:
                  //output for invalid input received for var loopRunner
                   System.out.println("Invalid Selection! Please try again!");
                }
        }
  }
}
    