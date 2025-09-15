import java.util.Scanner;

/**
 * ProChall12 class does the following:
 * 1) imported the java scanner
 * 2) defines the variable that the city is San Diego
 * 3) import the scanner keyboard
 * 4) gets the input by printing out each question regarding San Diego
 * 5) prints out San Diego by character length, then in uppercase, then in lowercase, and the first letter in San Diego
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 09/14/2025
 */

public class ProChall12{  //Remove _Starter. The Ch2 Ref Guide will be a BIG help
    public static void main (String[] args){
        //string variable cityName which is San Diego
        String cityName = "San Diego";
        
        //Create a Scanner object to get keyboard input
        Scanner keyboard = new Scanner(System.in);
        ////Get input section
        System.out.print("Enter a city: ");
        cityName = keyboard.nextLine();
        //display keyboard input 
        System.out.println("The number of characters in your city name is: " + cityName.length());
        System.out.println("The city name in uppercase is: " + cityName.toUpperCase());
        System.out.println("The city name in lowercase is: " + cityName.toLowerCase());
        System.out.println("The city name's first letter is: " + cityName.charAt(0));
        keyboard.close();
    }
}
