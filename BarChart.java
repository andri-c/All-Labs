import java.util.Random;

/**
 * Program Description
 * 1) define integeres for first, second, and third
 * 2) change the java.util.Scanner to java.util.Random
 * 3) create random generator between 0-999
 * 4) print out numbers and sorts
 * 5) create a header that states NUMBER BAR CHART
 * 6) for all the three numbers, if they are above 100, they get stars based on their hundreds
 * 7) example, if the number was 342 there would be 3 stars to signal that there is 300 hundreds
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 9/28/2025
 */
public class BarChart{
    public static void main (String[] args) {
        ////vars section
        //int vars for first, second, third
        int first, second, third;

        ////generate and assign random numbers section
        //Create a Random object (ie generator)
        Random generator = new Random();
        //Use generator to create a random number btw 0 and 999 and assign to first.  Do the same for second and third
        first = generator.nextInt(1000);
        second = generator.nextInt(1000);
        third = generator.nextInt(1000);

        ////Print out numbers
        //Message to print out something like, Number 1 is: XXX. Do the same for Number 2 and 3
        //Print blank line
        System.out.println("Number 1 is: " + first);
        System.out.println("Number 2 is: " + second);
        System.out.println("Number 3 is: " + third);
        System.out.println(); // Print blank line

        ////Bar Chart Section
        //Print out NUMBER BAR CHART as a header
        System.out.println("NUMBER BAR CHART");
        
        ////first stars
        //Print out "Number 1: " without a line break
        //if (first<100)
            //Print out "<100 no stars"
        //else
            //for loop that prints out stars for each 100 (ie 356 prints out 3 stars).  Take advantage of integer division here (first/100)
                //Print a *, HINT-The stars should be horizontal (on 1 line) for each number.
        //Print line to get to a new line
        System.out.print("Number 1: ");
            if (first < 100) {
            System.out.println("<100 no stars");
        } else {
            for (int i = 0; i < first / 100; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        ////second stars
        //Print out "Number 2: " without a line break
        //if (second<100)
            //Print out "<100 no stars"
        //else
            //for loop that prints out stars for each 100 (ie 356 prints out 3 stars).  Take advantage of integer division here (second/100)
                //Print a *, HINT-The stars should be horizontal (on 1 line) for each number.
        //Print line to get to a new line
        System.out.print("Number 2: ");
            if (second < 100) {
            System.out.println("<100 no stars");
        } else {
            for (int i = 0; i < second / 100; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        ////third stars
        //Print out "Number 3: " without a line break
        //if (third<100)
            //Print out "<100 no stars"
        //else
            //for loop that prints out stars for each 100 (ie 356 prints out 3 stars).  Take advantage of integer division here (third/100)
                //Print a *, HINT-The stars should be horizontal (on 1 line) for each number.
        //Print line to get to a new line
        System.out.print("Number 3: ");
            if (third < 100) {
            System.out.println("<100 no stars");
        } else {
            for (int i = 0; i < third / 100; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }////end main ()
}////end class