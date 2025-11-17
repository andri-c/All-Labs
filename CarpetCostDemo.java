import java.util.Scanner;

/**
 * This is the demo class that is for both the room size and carpet cost class.
 * 1.) add the scanner
 * 2.) prompt the user to input the room name, length, width, and cost
 * 3.) create variables for them
 * 4.) print out the result
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 11/16/2025
 */
public class CarpetCostDemo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // room 1
        System.out.print("Enter Room Name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter room length: ");
        double length = keyboard.nextDouble();

        System.out.print("Enter room width: ");
        double width = keyboard.nextDouble();

        System.out.print("Enter cost per square foot: ");
        double cost = keyboard.nextDouble();

        RoomSize temp = new RoomSize(name, length, width);
        CarpetCost masterRoom = new CarpetCost(temp, cost);

        System.out.println(masterRoom);

        keyboard.nextLine(); 


        // room 2
        System.out.print("Enter Room Name: ");
        name = keyboard.nextLine();

        System.out.print("Enter room length: ");
        length = keyboard.nextDouble();

        System.out.print("Enter room width: ");
        width = keyboard.nextDouble();

        System.out.print("Enter cost per square foot: ");
        cost = keyboard.nextDouble();

        CarpetCost livingRoom = new CarpetCost(new RoomSize(name, length, width), cost);

        System.out.println(livingRoom);

        keyboard.close();
    }
}
