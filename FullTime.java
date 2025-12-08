/**
 * FullTime employee extends Employee and stores salary.
 *
 * toString prints salary as currency with 2 decimals, $ and commas as necessary.
 * getSalary returns salary.
 *
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version 1.0
 * @since 12/7/2025
 */
public class FullTime extends Employee {
    private double salary;

    /**
     * No-arg constructor: calls super() and sets salary to 0.0
     */
    public FullTime() {
        super();
        this.salary = 0.0;
    }

    /**
     * Constructor with name, hireYear, idNum, salary.
     *
     * @param name employee name
     * @param hireYear year hired
     * @param idNum id number
     * @param salary annual salary
     */
    public FullTime(String name, int hireYear, String idNum, double salary) {
        super(name, hireYear, idNum);
        this.salary = salary;
    }

    /**
     * Set salary.
     *
     * @param salary new salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Get salary.
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Formats the toString and also shows the salaries.
     *
     * @return formatted string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // reuse Employee toString for the first three lines
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append("Salary: ").append(String.format("$%,.2f", salary));
        return sb.toString();
    }
}
