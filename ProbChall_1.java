import java.util.Scanner;

/**
 * ProbChall_1 asks...(fill in)
 * 1) defined that the user's "int" is used for the switch
 * 2) created a scanner keyboard
 * 3) created question for the user
 * 4) created a switch for the userNumber and asked for 3 cases
 * 5) if the 3 cases were not met (not putting a number from 1-3) gave them an error
 * 6) this error states the user's inputted number is not from 1-3 and asked them to input one in that range.
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 9/17/2025
 */
public class ProbChall_1 { 
    public static void main (String[] args){
        //create an int to be used for the switch
        int userNumber;
        //Create a Scanner object tied to the keyboard
        Scanner keyboard = new Scanner(System.in);
        //Message to the user, what do you want them to enter
        System.out.print("Enter a number from 1 to 3 in Roman Numerals: ");
        //Use Scanner object to assign value to int created above
        userNumber = keyboard.nextInt();
        
        switch(userNumber){
            case 1:
        System.out.println("The number 1 converted to Roman Numerals is I.");
        // print Roman numeral for 1
        break;
            case 2:
        System.out.println("The number 2 converted to Roman Numerals is II.");
        // print Roman numeral for 2
        break;
            case 3:
        System.out.println("The number 3 converted to Roman Numerals is III.");
        // print Roman numeral for 3
        break;
            default:
                System.out.println(userNumber + " is not a valid number. Please enter a number from 1-3. ");
        // print "invalid input"
            //Message to user saying # converted to Roman Numeral is ?
            //If you don't have this, you will bleed through to other cases
            ////Repeat for cases 2&3
            
            ////What can you use as a catch all if the user does not enter a number from 1->3
            //Message to user indicating <input-what was entered> + was not not a valid number, must be btw 1->3
            //Not that you need this here since you will not be able to bleed thru, but it is considered proper
        }
    }
}
