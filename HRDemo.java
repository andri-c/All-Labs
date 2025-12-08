/**
 * HRDemo driver that creates objects and prints out the output.
 *
 * This serves as the driver that allow sth other parts such as Person, Employee, FullTime, and Adjunct to work. 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version 1.0
 * @since 12/7/2025
 */
public class HRDemo {
    public static void main(String[] args) {
        FullTime fred = new FullTime("Flinstone, Fred", 2013, "BR-1", 75000.1234);

       
        Adjunct barney = new Adjunct("Rubble, Barney", 2014, "BR-2", 320, 60.55);

        FullTime wilma = new FullTime();
        wilma.setName("Flintstone, Wilma"); 
        wilma.setIdNum("BR-3");             
        wilma.setHireYear(2016);          
        wilma.setSalary(78123.2468);      

        
        Employee betty = new Employee("Rubble, Betty", 2020, "BR-4");


        FullTime wilma2 = new FullTime("Slate, Wilma", 2016, "BR-3", 78123.2468);

       
        Person[] staff = new Person[] { fred, barney, wilma, betty, wilma2 };

       
        System.out.println("=== Staff list (staff) ===");
        for (int i = 0; i < staff.length; i++) {
            System.out.println("Employee (" + (i+1) + "):");
            System.out.println(staff[i]);
            System.out.println(); // blank line between entries
        }

        
        System.out.println("wilma and wilma2 are the same person: " + wilma.equals(wilma2));

        
        if (wilma.equals(wilma2)) {
            wilma.setName("Slate, Wilma");
        }

        
        Person[] staff2 = new Person[] { fred, barney, wilma, betty };

        System.out.println("=== Staff list (staff2) ===");
        for (int i = 0; i < staff2.length; i++) {
            System.out.println("Employee (" + (i+1) + "):");
            System.out.println(staff2[i]);
            System.out.println();
        }
    }
}
