import java.util.Scanner;

/**
 * Program Description
 * 1) declared variables String for remaining, combined, flipped, and continue loop
 * 2) declared char for firstLetter
 * 3) input the scanner keyboard
 * 4) created a do while that asks to input words seperated with spaces and ending with quit
 * 5) while the word quit appears, it would seperate the first letter and flip the remaining and put it back together
 * 6) if it spells out exactly how it was originally, it would say it works, but if not it would say it doesn't work
 * 7) closing out the while, we can ask if the user wants to try again with a different set of words
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 9/28/2025
 */

public class ReverseWord{
    public static void main (String[] args){
        ////vars section
        //String for word, remaining, combined, and flipped
        String word, remaining, combined, flipped, continueLoop;
        //char for firstLetter
        char firstLetter;
        //Create Scanner object to get input
        Scanner keyboard = new Scanner(System.in);
        do{  ////optional do while.  Get main program up and running and then the do while
            ////this program allows for adding all words with quit as last word
            System.out.print("Enter words separated by spaces, ending with 'quit': ");
            ////you can get the first word using .next() and forcing .toLowerCase();
            word = keyboard.next().toLowerCase();
            ////Since we don't know how many words, best to use a while. Create while loop (pit) looking
            while (!word.equals("quit")) {
                combined = "";
                flipped = "";
                
                firstLetter = word.charAt(0);
                remaining = word.substring(1);
                combined = remaining + firstLetter;

                for (int i = combined.length() - 1; i >= 0; i--) {
                    flipped += combined.charAt(i);
                }

                
                if (flipped.equals(word)) {
                    System.out.println(word + " works");
                } else {
                    System.out.println(word + " does not work");
                }
                word = keyboard.next().toLowerCase();
            }
            ////for the word quit, since we don't want "quit' to work, think ! here
                //on each pass through the while loop, clear combined and flipped 
                //(ie combined = "";)  NOTE-This is 2 "s without a space.
                //get firstLetter
                //get remaining, think substring here
                //set combined to remaining + firstLetter
                
                //for loop to reverse combined and set to flipped.  Start with right most letter (char)
                //  in combined and add char to flipped, decrement for loop, and stop when no more 
                //  chars left (when you reach 0)
                //  use something like this in the for loop, flipped+=combined.charAt(i);
                //Test to see if flipped is same as word.  HINT-Since strings, must use equals()
                    ////Print out <word> works
                //else
                    ////Print out <word> does not work
                //get next word that while boolean will test (HINT-use same statement just before while loop)
                System.out.print("Do you want to process another line? (yes or no): ");
                continueLoop = keyboard.next();
            }while(continueLoop.equalsIgnoreCase("yes"));
            ////Optional do while, print msg to process another line (ie type yes)
        }//while to see if desired input was word to repeat, .use equalsIgnoreCase());
    }