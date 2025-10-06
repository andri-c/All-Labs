import java.util.Scanner;
//import Scanner

/**
 * Program Description
 * 1) Create the constant that acceleration = 9.8
 * 2) create the main, include the constant for distance and create variable for number of seconds
 * 3) print out questin asking how many seconds to compute and create a table that shows time and distance
 * 4) calculates distance and outputs the information
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 10/2/2025
 */

public class FallingDistance{ 
    //public constant for acceleration
    public static final double ACCELERATION = 9.8;  
    public static void main (String[] args) {
        //create Scanner object
        Scanner keyboard = new Scanner(System.in);
        //double var for distance
        double distance;
        int numOfSecs;
        //int var for numOfSecs
        //Display Please enter how many seconds to compute:
        System.out.print("Please enter how many seconds to compute: ");
        numOfSecs = keyboard.nextInt();
        //get input from user for numOfSecs
        System.out.println("Time(secs)\tDistance(m)");
        System.out.println("=========================");
        
        for (int sec = 1; sec <= numOfSecs; sec++) {
            distance = getDistance(sec);
            System.out.printf("%d\t%.1f\n", sec, distance);
        }
        //Display Time(secs) Distance(m) such that the output lines up nicely.  Think escape chars here (ie \t
        //Possibly add ========= under Time and Distance, see Lab5 output example
        //for loop that runs for each second
        //  distance is assigned by getDistance() that passes current second from for loop
        //  Display current second and distance with nice formatting (2 dec places for distance).  printf will work well here
    } //end main
    
    /**
     * This calculates and shows how far an object falls over time and uses the formula for distance. distance = 0.5 * g * t^2. This is done so by obtaining user input and putting it into a table.
     * @param time the number of seconds the object has been falling
     * @return the distance the object has fallen in meters
     * Put getDistance javadocs here.  Include description along with @param and @return tags
     */
    
    public static double getDistance(int time) {
        return 0.5 * ACCELERATION * Math.pow(time, 2);
    }
}//end class
    //Create getDistance header with correct return type and parameter.  Since static method is calling, must be static. Can be public or private
        //the body just needs to be a single statement, a return that calculates distance.  See Lab5 for the formula
//end class