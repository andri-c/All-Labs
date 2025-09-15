import java.util.Scanner;

/**
 * ProChall2 class does the following:
 * 1) imported the java scanner
 * 2) defines the variables for first, middle, and last name
 * 3) import the scanner keyboard
 * 4) gets the input by printing out each question regarding first, middle, and last name
 * 5) uses charAt(0) to get the first initial of first, middle, and last name
 * 6) prints out the results
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 09/14/2025
 */

public class ProChall2{  //Remove _Starter. The Ch2 Ref Guide will be a BIG help
    public static void main (String[] args){
        //string variables for firstName, middleName, and lastName
        String firstName = "Andrew";
        String middleName = "Zhiming";
        String lastName = "Chang";
        
        //Create a Scanner object to get keyboard input
        Scanner keyboard = new Scanner(System.in);
        ////Get input section
        System.out.print("Enter your first name: ");
        firstName = keyboard.next();
        System.out.print("Enter your middle name: ");
        middleName = keyboard.next();
        System.out.print("Enter your last name: ");
        lastName = keyboard.next();
        //char variables for firstName, middleName, and lastName
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);
        //display keyboard input 
        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + "" + firstInitial + middleInitial + lastInitial);
        keyboard.close();
    }
}
