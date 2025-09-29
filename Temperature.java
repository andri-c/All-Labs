import java.util.Scanner;
/**
 * Program Description- Please let me know if the '//' are too much of a clutter, I like keeping them to ensure I have everything down.
 * 1) defined variables for double inputTemp and output
 * 2) defined char for inputUnit and string value for continuing the loop, thats why I named it continueLoop
 * 3) put in the scanner keyboard so the user can input text
 * 4) ask the user to input a whole number and the degrees in C or F and automatically makes it uppercased
 * 5) added an if else statment that ensures the user uses C or F and not another letter
 * 6) after the conversion, it makes the temp values rounded to the nearest 0.1
 * 7) lastly, print out and ask the user if they want to input another value, put in continueLoop to make them repeat the previous
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 9/28/2025
 */

public class Temperature{ 
    public static void main (String[] args){
        ////vars section
        double inputTemp, output;
        char inputUnit;
        String continueLoop;
        //create vars for inputTemp, output (num with decimal), and char inputUnit

        //create Scanner object to read in keyboard
        Scanner keyboard = new Scanner(System.in);
        do{  ////create working program and then put in do-while
            //Enter msg to user something like, Enter a whole number, a space, 
            //  and C or F (ie 100 F converts to Cels");
            System.out.print("Enter a whole number and either C or F: ");
            //get inputTemp
            inputTemp = keyboard.nextDouble();
            //get inputUnit, recommend forcing toUpperCase or toLowerCase
            //  before getting char.  This will make the while pit easier :-)
            inputUnit = keyboard.next().toUpperCase().charAt(0);
            ////while loop pit.  You want a 'C' OR 'F', if a user enters this
            ////you want to keep them out.  So how do you do the opposite?
            ////How about using !
            ////If a user is in the while pit, tell them want you want to get
            ////them out by entering 'C' OR 'F'.  Grab the char, just like above
            ////before the while pit.
            while (inputUnit != 'C' && inputUnit != 'F') {
                System.out.print("Invalid unit! Please enter C or F: ");
                inputUnit = keyboard.next().toUpperCase().charAt(0);
            }
            // After the while pit:
            //if inputUnit is 'F'  ////remember a primitive type therefore use ==
            ////compute output (F->C).  Assuming you collected an int from the user, you will need
            ////to cast part of the equation as a double or using a double in the equation (ie 5.0).
            ////then nicely format (think printf here) the output to one decimal place.  
            ////%d is for int, %c is for char, %f along with precision for double

            // else
            //  compute output (C->F).  You know at this point the only other possible char is 'C'
            ////You will need to cast part of the equation as a double or use a double (ie 5.0).
            ////then nicely format (think printf here) the output to one decimal place.  
            ////%d is for int, %c is for char, %f along with precision for double
            if (inputUnit == 'F') {
                output = (inputTemp - 32) * 5.0 / 9.0;
                System.out.printf("%.1f C%n", output);
                }
            else {
                output = (inputTemp * 9.0 / 5.0) + 32;
                System.out.printf("%.1f F%n", output);
            }

            System.out.print("Do you want to calculate another temperature? (yes or no): ");
            continueLoop = keyboard.next();
            //Now you can will need to collect input for the do-while part
            //Message to user to enter yes to calculate another temp.
        }while (continueLoop.toUpperCase().charAt(0) == 'Y');
        //      toUpperCase/toLowerCase and then grab charAt(0) and have the while evaluate to == 'Y' (or 'y')
    }//// end main ()
}//// end class