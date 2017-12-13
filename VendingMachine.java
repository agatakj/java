import java.util.Scanner; //required for Scanner keyboard below

/**
 * @author Agata Jelen, CSD 141, Fall 2017
 */
public class VendingMachine {

    /**
     * Algorithm Comments: Added vendng machine info about change so user was aware that they 
     * will not be able to enter an amount like 68 cents (that is just an example).
     * 
     * Added 
     * @param args */
     
    public static void main(String[] args) {
    //Initial OUTPUT (for advising the user on the vending machine limitations, see the algorithm note for more information)
      System.out.println("Welcome to the vending machine! This machine only accepts dollar bills "
              + "The price of each item in this machine is between 25 cents to 1 dollar. "
              + "Price varies by 5 cent increments This machine does not dispense pennies. "
              + "Insert a dollar , what is the cost of the item below:");

    //INPUT
        //int variable declared for itemPrice (I used int to avoid decimals w/double)
          int itemPrice;
    
        //Scanner added to collect input from user
          Scanner keyboard= new Scanner(System.in);
          
    //PROCESSING
        //User prompted for cost of item using whole numbers
          System.out.println("Enter price of item. From 25 cents to a dollar, in 5-cent increments ");
        //User input stored in itemPrice
          itemPrice=keyboard.nextInt(); //echo print user input for var itemPrice
          
        //int variable declared for changeDue (100 representing a dollar minus the change amount with no decimals)
          int changeDue=100-itemPrice;
    
        //int quarters with calculation dividing changeDue by 25 value of quarters (with no decimals)
          int quarters=(changeDue)/25;
          
        //int dimes with calculation dividing changeDue (after quarters have been dispensed) by 10
          int dimes=(changeDue-quarters*25)/10;
          
        //int nickels with calculation dividing changeDue (after quarters and dimes have been dispensed) by 5
          int nickels=(changeDue-quarters*25-dimes*10)/5;
    
    //OUTPUT
        //output for initial value of item
          System.out.println("You bought an item for $0."+itemPrice+" cents and gave me a dollar,");
        //output for change returned
          System.out.println("Your change is: ");
        //output quarters returned
          System.out.println(quarters+" quarters,");
        //output for dimes returned
          System.out.println(dimes+" dimes, and");
        //output for nickles returned
          System.out.println(nickels+" nickels.");
        }
    
}
