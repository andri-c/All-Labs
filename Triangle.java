import java.util.Scanner;
/**
 * This is the body that uses the driver as an "internal" source
 * 1)At first, declare variables for name, base, and height.
 * 2)add constructor for the non-args and one for the args. default options/ data inputted
 * 3)set each variable with new(variable) -> this is for the reading input where it can take the data
 * 4)asks the user for the height and base of the triangle and which one it is
 * 5)adds return to the area equation to calculate for the area
 * 6)spews back the information on what the area is rounded to the nearest tenth and what was previously written
 * The setter methods are setBase, setName, and setHeight, this helps "set" up for the next part
 * There is also the instance methods like the reading and writing portion that takes in information and releases it witht he help of the private helper from the getArea
 *
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version 1.0
 * @since 10/12/2025
 */
public class Triangle
{
    // instance variables - replace the example below with your own
    private String name;
    private double base;
    private double height;
    

    /**
     * Constructor for objects of class triangle
     * This is the non-arg constructor so it represents the origin of what is being shown. No values were inputted yet.
     * */
    public Triangle()
    {
    name = "Unknown";
    base = 0.0;
    height = 0.0;
    }
    
     /**
      * Constructor for inputted infromation about the triangle. This helps define the variables for name, base, and height and their "inputted values"
      */
    public Triangle(String inName, double inBase, double inHeight)
    {
    name = inName;
    base = inBase;
    height = inHeight;
    }
    
    /**
     * sets up for the name
     */
    public void setName(String newName)
    {
    name = newName;
    }
    /**
     * sets up for the base
     */
    public void setBase(double newBase)
    {
        base = newBase;
    }
    /**
     * sets up for the height
     */
    public void setHeight(double newHeight)
    {
        height = newHeight;
    }
    
    /**
     * creates questions for user to input
     */
    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the triangle's name: ");
        String inputName = keyboard.nextLine();
        setName(inputName);
        System.out.println("What is the triangle's base: ");
        double inputBase = keyboard.nextDouble();
        setBase(inputBase);
        System.out.println("What is the triangle's height: ");
        double inputHeight = keyboard.nextDouble();
        setHeight(inputHeight);
    }
    
    private double getArea()
    {
        return (base * height) / 2;
    }
    /**
     * outputs the information and calculations done
     */
    public void writeOutput()
    {
        System.out.println("Triangle name is: " + name );
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        double area = getArea();
        System.out.printf("Triangle area is: %.1f%n%n", area);
    }
}