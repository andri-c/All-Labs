/**
 * Driver class for the Looney Tunes DMV registration system.
 *
 * @author Andrew Chang
 * @version 1.0
 * @since 12/14/2025
 */
public class RegistrationDemo {

    public static void main(String[] args) throws Exception {

        RegistrationMethods dmv = new RegistrationMethods();
        dmv.setFileNames();

        int size = dmv.getArraySize();
        CarOwner[] ltState = new CarOwner[size];

        dmv.processTextToArray(ltState);
        dmv.printArrayToFile("List of Car Owners", ltState);

        CarOwner[] overdue = dmv.flagOverdueOwners(ltState);
        dmv.printArrayToFile("Owners with Expired Registration", overdue);

        CarOwner[] almostDue = dmv.flagAlmostDueOwners(ltState);
        dmv.printArrayToFile(
            "Owners with registration expiring in three months or less",
            almostDue
        );

        System.out.println("Output file located at: " + dmv.getOutputFileName());
    }
}
