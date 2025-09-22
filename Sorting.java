import java.util.Scanner;

/**
 * Program Description
 * 1) defined integers for n1, n2, and n3
 * 2) defined integers for low, med, and high
 * 3) created the scanner keyboard
 * 4) using the scanner keyboard, create a question for the user to input
 * 5) use if statement for when n1 is the smallest (less or equal)
 * 6) use if statement for when n2 is the smallest (less or equal)
 * 7) use if statement for when n3 is the smallest (less or equal)
 * 8) uses system to output the sorted numbers in order
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 9/21/2025
 */

public class Sorting
{
    public static void main (String[] args){
        //int vars for each number (ie n1) and ints for low, med, high
        int n1, n2, n3;
        int low, med, high;
        //Create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        //create an input message and use Scanner object collect 3 numbers to be sorted
        System.out.print("Enter the first number: ");
        n1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        n2 = keyboard.nextInt();
        System.out.print("Enter the third number: ");
        n3 = keyboard.nextInt();
      
        ////Look for when n1 is smallest section
        if (n1 <= n2 && n1 <= n3) {
                low = n1; 
            if (n2 <= n3) {
                med = n2;
                high = n3;
        } else {
            med = n3;
            high = n2;
            }
        }
        ////Above n1 is smallest, now we need to figure out when n2 is smallest section
        else if (n2 <= n1 && n2 <= n3) {
                low = n2;
            if (n1 <= n3) {
                med = n1;
                high = n3;
        } else {
            med = n3;
            high = n1;
            }
        }
        ////Above are n1 and n2 smallest sections.  Therefore, by default (else) only n3 is left to be the smallest
        else {
                low = n3;
        if (n1 <= n2) {
            med = n1;
            high = n2;
        } else {
            med = n2;
            high = n1;
        }
    }
    //Message that says - The inputs sorted smallest to largest are: <low> <med> <high>
    System.out.printf("The inputs sorted smallest to largest are: %d %d %d%n", low, med, high);
    }////end main
}////end class
