/**
 * Employee class extends Person.
 *
 * Contains hireYear and idNum. Provides equals(Object) and getServiceYears().
 *
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version 1.0
 * @since 12/7/2025
 */
public class Employee extends Person {
    private int hireYear;
    private String idNum;

    /**
     * No-arg constructor: calls super(), sets hireYear to 0 and idNum to "Onboarding".
     */
    public Employee() {
        super();
        this.hireYear = 0;
        this.idNum = "Onboarding";
    }

    /**
     * Constructor that accepts name, hireYear, idNum.
     *
     * @param name the employee's name
     * @param hireYear year hired
     * @param idNum employee ID number
     */
    public Employee(String name, int hireYear, String idNum) {
        super(name);
        this.hireYear = hireYear;
        this.idNum = idNum;
    }

    /**
     * Set hire year.
     *
     * @param hireYear year hired
     */
    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    /**
     * Get hire year.
     *
     * @return hireYear
     */
    public int getHireYear() {
        return hireYear;
    }

    /**
     * Set ID number.
     *
     * @param idNum id number
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * Get ID number.
     *
     * @return idNum
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * Returns years of service: CURRENT_YEAR - hireYear.
     *
     * @return years of service
     */
    public int getServiceYears() {
        return CURRENT_YEAR - hireYear;
    }

    /**
     * equals based on idNum.
     *
     * @param makes boolean equal to an o other object
     * @return true if same idNum (ignoring case)
     */
    @Override
    public boolean equals(Object o) {
        boolean isEqual = false;
        if (o != null && getClass() == o.getClass()) {
            Employee copy = (Employee) o;
            if (idNum != null && idNum.equalsIgnoreCase(copy.idNum)) {
                isEqual = true;
            }
        }
        return isEqual;
    }

    /**
     * toString that uses super.toString() and adds ID Number, Year Hired, Years of Service.
     *
     * @return formatted string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator());
        sb.append("ID Number: ").append(idNum).append(System.lineSeparator());
        sb.append("Year Hired: ").append(hireYear)
          .append(" Years of Service: ").append(getServiceYears());
        return sb.toString();
    }
}
