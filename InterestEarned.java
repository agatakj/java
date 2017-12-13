package interestearned;
import java.util.Scanner;  //required for Scanner keyboard below

/**@author Agata Jelen, CSD 141 Fall 2017**/

public class InterestEarned {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    //INPUT
        //double variable pricipal declared
            double principal;
            
        //double variable rate declared
            double rate;

        //double variable timesCompounded declared
            double timesCompounded;
        
      //scanner tool added for user input
        Scanner keyboard=new Scanner(System.in);
    
    //PROCESSING    
      //User is prompted for the prinicpal balance
        System.out.println("What is the principal balance? ");
      //User input is stored in var principal
        principal=keyboard.nextDouble();//echo print user input for var principal
      
      //User is prompted for interest rate
        System.out.println("What is the interest rate percent? ");
      //User input is stored in var rate
        rate=keyboard.nextDouble(); //echo print user input for var rate
      
      //User is prompted for compound frequency
        System.out.println("How frequently is interest compounded per year? ");
      //User input is stored in var timesCompounded
        timesCompounded=keyboard.nextDouble();//echo print user input for var timesCompounded
      
         //double variable totalBalance declared with Compound Interest formula 
           double totalBalance=principal*Math.pow(1+((rate*0.01)/timesCompounded),timesCompounded);
           
         //double var interst declared with calculation subtracting principal from totalBalance
           double interest=totalBalance-principal;
        
      //OUTPUT
      System.out.println("Interest Rate: "+rate+"%");//output for Interest rate
      System.out.println("Times Compounded per year: "+timesCompounded);//output for compound frequency
      System.out.printf("%s %.2f %n","Principal Balance: $",+principal);//output for principal balance w/hundredth place decimal 
      System.out.printf("%s %.2f %n","Interest Accumulated: $",+interest);//output for interest accumulated w/hundredths place decimal
      System.out.printf("%s %.2f %n","Amount in Savings: $",+totalBalance);//output for total balance w/hundredths place decimal 
    }
    
}
