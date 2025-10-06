import java.util.Scanner; //import Scanner and/or JOptionPane

/**
 * Program Description
 * 1) include variables for integer number, string for playAgain, and a boolean isPrime
 * 2) creates a do while that includes that the number inputted by the user has to be greater than 2.
 * 3) if the nmber is prime it would tell the user that the number inputted was prime, and if not it would say the same but that the number is not prime
 * 4) it would then ask whether the user wants to enter another number by typing in yes to continue or no to stop
 * 5) at the bottom, already explained, it shows that it determines whether it is prime if it is divisible rather than itself and 1.
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 10/3/2025
 */
public class Prime{ 
    public static void main (String[] args) {
        //boolean var isPrime
        boolean isPrime;
        int number;
        String playAgain;
        //int var number            //original number to test
        //String var playAgain      //string to test to calc another number
        //do{ //get program working first and then incorporate do while to play again
        do{
           System.out.print("Enter a whole number that is > 2: ");
           Scanner keyboard = new Scanner(System.in);
           number = keyboard.nextInt();
           isPrime = testForPrime(number);
        if (isPrime == true)
            System.out.println(number + " is prime.");
            else
            System.out.println(number + " is not prime.");
            System.out.println("Enter yes to test another number, no to quit.");
        playAgain = keyboard.next();
        } while (playAgain.equalsIgnoreCase("yes"));
        
            //Display message to user, something like Enter a whole number>2 (ie 19) to test if prime
            //Create a Scanner object or JOptionPane to get user input and assign to number 
            //set isPrime to the result of testForPrime(number)
            //if else to test if isPrime.  Display number and whether prime.
            
            //Display message to test another number, something like Enter yes to test another number, no to quit
            //set playAgain to user choice    
        //}//while to see if playAgain is String yes (recommend method that ignores case
    }//end main

    /**
     * Insert javadocs here - description, @param, @return
     * This determines whether the number is prime or not by testing whether it is only divisible by itself or 1.
     * @param is the number that is tested on if it is prime or not.
     * @return if it is true that the number is prime, say it is true. If not, return and show it is false.
     */
    //write header here for testForPrime.  Can be public or private, but needs to be static.  Return type? Needs 1 param
        //int var inNumberSqRt   //gets input from user and takes square root.  this shortens the testing and makes more efficient
        //set inNumberSqRt to (int)Math.sqrt(param var).  NOTE:We need to cast as an int.
        //boolean var isPrimeMeth set to true, assumes number is prime
        public static boolean testForPrime(int inNumber) {
            int inNumberSqRt = (int) Math.sqrt(inNumber); // check only up to sqrt for efficiency
            boolean isPrimeMeth = true; // assume it's prime initially

            for (int i = 2; isPrimeMeth && i <= inNumberSqRt; i++) { //declare and set int var to 2  //Can start here vs 1 for one less run
        if (inNumber % i == 0)
            isPrimeMeth = false; // found a divisor → not prime
           //create an if to see if inNumber is divisible by i
                //if true set isPrimeMeth=?
        }
        //return ?
        return isPrimeMeth;
    }//end testForPrime
}//end Prime