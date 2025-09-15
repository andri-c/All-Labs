import java.util.Scanner;

/**
 * ProChall15 class does the following:
 * 1) defined variables for pricePerShare, totatCostShares, commission, and total
 * 2) ask for integer for number of shares
 * 3) created constant for COMM_RATE of 2%
 * 4) Added scanner keyboard and provide questions to user about # of shares purchases and price per share
 * 5) added computations on totalCostShares, commission, and total
 * 6) displayed outputs
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 09/14/2025
 */

public class ProChall15{  //For Replit change ProChall5 to Main.  The Ch2 Ref Guide will be a BIG help
    public static void main (String[] args){
        ////variables
        //double vars for pricePerShare, totalCostShares, commission, total
        double pricePerShare, totalCostShares, commission, total;
        int numShares;
        //create a constant (final double) for COMM_RATE set to 2% 
        final double COMM_RATE = 0.02;
        ////get input for number of shares and cost per share using a Scanner object
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many shares purchased: ");
        numShares = keyboard.nextInt();
        System.out.print("What is the price per share: $ ");
        pricePerShare = keyboard.nextDouble();
        
        ////computations
        //assign totalCostShares with product of what and what?
        totalCostShares = numShares * pricePerShare;
        //assign commission with product of what (hint step above) and what?
        commission = totalCostShares * COMM_RATE;
        //assign total with addition of what and what (hint look at above two values)
        total = totalCostShares + commission; 
        
        ////display output
        System.out.printf("\nTotal cost of shares are: $%,.2f\nCommission cost is: $%,.2f\nTotal Cost is: $%,.2f",totalCostShares, commission, total);
        keyboard.close();
    }//// end main()
}//// end class