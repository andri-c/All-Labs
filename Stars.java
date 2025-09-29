import java.util.Scanner;

/**
 * Program Description
 * 1) define variables integers for width, line, spaces, and stars
 * 2) added scanner keyboard to ask questions
 * 3) ask user to input max width for stars
 * 4) added if to make the nmbers always be odd
 * 5) divides the diamond between the top half and bottom half and creates the diamond
 * 6) after each input, outputs the portion (inputs for top half and outputs it, then inputs for bottom half and outputs it)
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 9/29/2025
 */

public class Stars{ 
    public static void main (String args[]){
        ////vars section
        //int for width (largest width of stars), line, spaces, and stars
        int width, line, spaces, stars;
        //Scanner to get user input, something like "Enter max width for stars"
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter max width for stars: ");
        width = keyboard.nextInt();
        //test to see if width is even (width%2==0).  If true increment width by 1.  Ensures width is an odd number
        if (width % 2 == 0) {
            width = width + 1;
        }

        ////top half section
        for (line = 1; line <= width; line += 2) {   // 1, 3, 5, ...
            spaces = (width - line) / 2;
            for (int i = 1; i <= spaces; i++) {     // print spaces
                System.out.print(" ");
            }
            for (stars = 1; stars <= line; stars++) { // print stars
                System.out.print("*");
            }
            System.out.println("");  // move to next line
        }

        ////bottom half
        for (line = width - 2; line >= 1; line -= 2) { 
            spaces = (width - line) / 2;
            for (int i = 1; i <= spaces; i++) {       // print spaces
                System.out.print(" ");
            }
            for (stars = 1; stars <= line; stars++) { // print stars
                System.out.print("*");
            }
            System.out.println("");  // move to next line
        }
    }  ////end main()
} ////end class