/**
 * Adjunct employee extends Employee and stores hours and hourly rate.
 *
 * toString prints hours, hourly rate as currency, and salary (hours * hrRate) as currency.
 *
 * getSalary returns hours * hrRate.
 *
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version 1.0
 * @since 12/7/2025
 */
public class Adjunct extends Employee {
    private double hours;
    private double hrRate;

    /**
     * No-arg constructor: calls super(), sets hours and hrRate to 0.
     */
    public Adjunct() {
        super();
        this.hours = 0.0;
        this.hrRate = 0.0;
    }

    /**
     * Constructor with name, hireYear, idNum, hours, hrRate.
     *
     * @param name employee name
     * @param hireYear year hired
     * @param idNum id number
     * @param hours total hours
     * @param hrRate hourly rate
     */
    public Adjunct(String name, int hireYear, String idNum, double hours, double hrRate) {
        super(name, hireYear, idNum);
        this.hours = hours;
        this.hrRate = hrRate;
    }

    /**
     * Set hours.
     *
     * @param hours hours
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * Get hours.
     *
     * @return hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * Set hourly rate.
     *
     * @param hrRate hourly rate
     */
    public void setHrRate(double hrRate) {
        this.hrRate = hrRate;
    }

    /**
     * Get hourly rate.
     *
     * @return hourly rate
     */
    public double getHrRate() {
        return hrRate;
    }

    /**
     * Returns salary as hours * hrRate.
     *
     * @return computed salary
     */
    public double getSalary() {
        return hours * hrRate;
    }

    /**
     * toString formatted as hours. hourly rate, salary.
     * @return string builder toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append("Hours: ").append(hours)
          .append(", Hourly Rate: ").append(String.format("$%,.2f", hrRate))
          .append(", Salary: ").append(String.format("$%,.2f", getSalary()));
        return sb.toString();
    }
}
