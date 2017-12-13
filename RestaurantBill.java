import java.util.Scanner; //required for Scanner keyboard below
/**
 * @author Agata Jelen CSD 141, Fall2017
 */
public class RestaurantBill {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
    //INPUT
        //mealCost variable declared for original meal total total
            double mealCost;

        //tipPercent variable declared for tip percentage (whole number)
            double tipPercent;
    
        //scanner keyboard added to collect input from user
            Scanner keyboard = new Scanner(System.in);
    
    //PROCESSING            
        //user is prompted for the meal total
          System.out.print("What is the original cost of the bill? ");

        //value for mealCost is stored in mealTotal variable
          mealCost=keyboard.nextDouble(); //echo print user input for var mealCost

        //user is prompted for the percentage for the tip
          System.out.print("What percent would you like to tip? ");
            
        //value for tip percent is stored in tipPercent variable
          tipPercent=keyboard.nextDouble();//echo print user input for var tipPercent
        
        //constant double variable declared for tax at 10%
          final double tax=.1;
      
        //variable taxAmount declared with calculation for total tax amount from the original meal
          double taxAmount=mealCost*tax;
      
        //variable tipAmount declared with calculation for total tip amount after tax is added to original meal
          double tipAmount=(mealCost+taxAmount)*(tipPercent*.01);//(tipPercent is multiplied by .01 to get the decimal of the percentage given
      
        //variable billTotal declared with calculation for grand total with tip and tax
          double billTotal=mealCost+taxAmount+(tipAmount);
    
    //OUTPUT
        //output for the final calculations
            System.out.printf("%s %.2f %n","Given the original total from the bill: $",+mealCost);//output for original cost
            System.out.printf("%s %.2f %s %n","with 10% tax ($",+taxAmount,")"); //output for the tax amount
            System.out.printf("%s %.2f %s %.2f %s %n","and a ",+tipPercent,"% tip ($",+tipAmount,"),");//output for the tip percent and tip amount
            System.out.printf("%s %.2f %n","your final total would be: $",+billTotal); //output for the total cost
    }
    
}
