import java.util.Scanner; //required for Scanner keyboard below
/**  
 * @author Agata Jelen CSD 141 Fall 2017  */ 


/*Algorithm Notes: Template provided for this problem.*/
public class Vars_Consts_Calculations {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
            //******** Logic Problem code area ********************    
            // TODO This program has a logical error. Your goal is to fix it.
        
//INPUT
    //double var declaration for first number
        double firstNumber; // to hold the first number     
    //double var declaration for second number
        double secondNumber; // to hold the second number
    //double var declaration for temporary number
        double tmpNumber; // to hold the first number temp.
//PROCESSING            
    // create scanner object to read input     
       Scanner keyboard = new Scanner(System.in);

       // Prompt user to enter the first number.     
          System.out.print("Enter the first number: ");// input the first number     
          firstNumber = keyboard.nextDouble();//echo print the input.     
       // Prompt user to enter the second number.
          System.out.print("Enter the second number:");     // input the second number     
          secondNumber = keyboard.nextDouble();               // Echo print the input.  
    //Initial OUTPUT of User's Input
    System.out.println("You input the numbers as "+ firstNumber+" and " + secondNumber );  
    
    // Now we will swap the values.     
       tmpNumber = firstNumber; // assigning value of firstNumber to tmpNumber
       firstNumber = secondNumber; // assigning value of secondNumber to firstNumber    
       secondNumber = tmpNumber; // assigning value of tmpNumber (original value of firstNumber) to secondNumber
    
//OUTPUT
    // Output the swapped values.     
    System.out.println("After swapping, the values of the two numbers are "+ firstNumber+" and " + secondNumber+".");
            
            // ********* End of Logic Problem code area  ********** 

//********* Circle Area Problem code area ***********
  // Implement the following step-by-step plan
  
  //INPUT
    // 1. Declare double constant PI to hold 3.14   
          final double pi=3.14;  //double constant declared for PI
    // 2. Declare a double variable to store radius   
          double radius;  //double var radius declared
    // 3. Declare a double variable to store area
          double area; //double var area declared      

  //PROCESSING        
    // 4. Prompt the user to enter radius.  
          System.out.print("What is the circle's radius? ");  // Prompt for user to input radius
    // 5. Input radius and store it in variable     
          radius = keyboard.nextDouble(); //echo print user input
    // 6. Calculate circle area. Find the formula on the web if you don't remember it
          area=pi*(Math.pow(radius,2)); // area formula calculated PI*R^2 using Math.pow method
          
 //OUTPUT
    // 7. Output the circle's radius and area values in user-friendly fashion
          System.out.println("With a radius of "+radius+", the circle would have an area of "+area+"."); //Solution output
}
// ********* End of Circle Area Problem code area ***********       
}
