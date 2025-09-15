import java.util.Scanner;

/**
 * ProChall13 class does the following:
 * 1) defines the varaibles for meal, taxAmount, tipAmount, and totalBill
 * 2) defines the constants which is the tip and tax
 * 3) Adds the scanner object for the keyboard input
 * 4) Gives question to the user
 * 5) Assigns meal variable with scanner
 * 6) calculates both tax and tip as well as the total bill
 * 7) prints/outputs the answers
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 09/14/2025
 */

public class ProChall13{  //Remove _Starter. The Ch2 Ref Guide will be a BIG help
    public static void main (String[] args){
        //double vars for meal, totalBill, taxAmount, tipAmount
        double meal, taxAmount, tipAmount, totalBill;
        //create a double constant for TIP as well that is 20%
        final double TAX = 0.0675;
        final double TIP = 0.20;
        //Create a Scanner object to get keyboard input
        Scanner keyboard = new Scanner(System.in);
        ////Get input section
        System.out.print("Enter meal amount: $");
        //assign meal var with a double from the Scanner object
        meal = keyboard.nextDouble();
        
        //assign taxAmount var with a double from meal * ???
        taxAmount = meal * TAX;
        //assign tipAmount var with a double from meal * ???
        tipAmount = (meal + taxAmount) * TIP;
        //assign total var with the sum of ???
        totalBill = meal + taxAmount + tipAmount;
        //outputs the mee, tax, tip, and total bill
        System.out.printf("\nThe meal charge is: $%,.2f", meal);
        System.out.printf("\nThe tax is: $%,.2f", taxAmount);  
        System.out.printf("\nThe tip amount is: $%,.2f", tipAmount);  
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", totalBill);
        keyboard.close();
    }
}