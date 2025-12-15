/**
 * The CarOwner class represents a citizen who owns a vehicle.
 * Inherits from Citizen.
 *
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version 1.0
 * @since 12/14/2025
 */
public class CarOwner extends Citizen {

    private String license;
    private int month;
    private int year;

    /**
     * No-arg constructor sets default values.
     */
    public CarOwner() {
        super();
        license = "Not Assigned";
        month = 0;
        year = 0;
    }

    /**
     * Constructor that sets all fields.
     * @param firstName first name
     * @param lastName last name
     * @param license license number
     * @param month registration month
     * @param year registration year
     */
    public CarOwner(String firstName, String lastName, String license, int month, int year) {
        super(firstName, lastName);
        this.license = license;
        this.month = month;
        this.year = year;
    }
    /**
     * Setter for license
     */
    public void setLicense(String license) {
        this.license = license;
    }
    /**
     * Getter for license
     */
    public String getLicense() {
        return license;
    }
    /**
     * Setter for month
     */
    public void setMonth(int month) {
        this.month = month;
    }
    /**
     * Getter for month
     */
    public int getMonth() {
        return month;
    }
    /**
     * Setter for year
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * Getter for year
     */
    public int getYear() {
        return year;
    }
    /**
     * Override for toString
     */
    @Override
    public String toString() {
        String output = super.toString() + "\t\t" + license + "\t\t" + month + "/" + year;
        return output;
    }
}
