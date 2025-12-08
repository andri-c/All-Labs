/**
 * This Person class contains the constructors for both the no-args, one with the name, sets, gets, and turns person to be a toString().
 *
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version 1.0
 * @since 12/7/2025
 */
public class Person {
    private String name;
    public static final int CURRENT_YEAR = 2025;

    /**
     * This is the No-arg constructor. It sets name to "No name yet".
     */
    public Person() {
        this.name = "No name yet";
    }

    /**
     * Constructor with the name.
     *
     * @param name the person's name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * This sets the person's name.
     *
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This gets the person's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the Person to become toString()
     */
    @Override
    public String toString() {
        String output = "Name: " + name;
        return name;
    }
}
