/**
 * The Citizen class represents a basic citizen with a first and last name.
 *
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version 1.0
 * @since 12/14/2025
 */
public class Citizen {

    private String firstName;
    private String lastName;

    /**
     * No-arg constructor sets first and last name to "No Name".
     */
    public Citizen() {
        firstName = "No Name";
        lastName = "No Name";
    }

    /**
     * Constructor that sets first and last name.
     * @param firstName first name
     * @param lastName last name
     */
    public Citizen(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Sets the first name.
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the first name.
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the last name.
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the last name.
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns first and last name.
     * @return formatted name
     */
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
