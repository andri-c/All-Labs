import java.io.*;
import java.util.*;

/**
 * Contains DMV processing logic for Looney Tunes vehicle registration.
 *
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version 1.0
 * @since 12/14/2025
 */
public class RegistrationMethods {

    private String inputFileName;
    private String outputFileName;

    public static final int REG_MONTH = 4;
    public static final int REG_YEAR = 2025;

    public void setFileNames() throws IOException {
        Scanner kb = new Scanner(System.in);
        File file;

        do {
            System.out.print("Enter path to registration.csv: ");
            inputFileName = kb.nextLine();
            file = new File(inputFileName);
        } while (!file.exists());

        System.out.print("Enter path for output.txt: ");
        outputFileName = kb.nextLine();
    }

    public int getArraySize() throws IOException {
        Scanner input = new Scanner(new File(inputFileName));
        int count = 0;

        input.nextLine(); // skip header
        while (input.hasNextLine()) {
            input.nextLine();
            count++;
        }
        input.close();
        return count;
    }

    public void processTextToArray(CarOwner[] inArray) throws IOException {
        Scanner input = new Scanner(new File(inputFileName));
        input.nextLine(); // skip header
        int element = 0;

        while (input.hasNextLine()) {
            String[] parts = input.nextLine().split(",");

            String lastName = parts[0];
            String firstName = parts[1];
            String license = parts[2];
            int month = Integer.parseInt(parts[3]);
            int year = Integer.parseInt(parts[4]);

            inArray[element++] =
                new CarOwner(firstName, lastName, license, month, year);
        }
        input.close();
    }

    public void printArrayToFile(String header, CarOwner[] inArray) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(outputFileName, true));

        out.println(header);
        for (CarOwner owner : inArray) {
            out.println(owner);
        }
        out.println();
        out.close();
    }

    public CarOwner[] flagOverdueOwners(CarOwner[] inArray) {
        int totalMonths = REG_YEAR * 12 + REG_MONTH;
        int count = 0;

        for (CarOwner o : inArray) {
            int ownerMonths = o.getYear() * 12 + o.getMonth();
            if (totalMonths - ownerMonths > 12) {
                count++;
            }
        }

        CarOwner[] overdue = new CarOwner[count];
        int index = 0;

        for (CarOwner o : inArray) {
            int ownerMonths = o.getYear() * 12 + o.getMonth();
            if (totalMonths - ownerMonths > 12) {
                overdue[index++] = o;
            }
        }
        return overdue;
    }

    public CarOwner[] flagAlmostDueOwners(CarOwner[] inArray) {
        int totalMonths = REG_YEAR * 12 + REG_MONTH;
        int count = 0;

        for (CarOwner o : inArray) {
            int diff = totalMonths - (o.getYear() * 12 + o.getMonth());
            if (diff > 9 && diff <= 12) {
                count++;
            }
        }

        CarOwner[] almost = new CarOwner[count];
        int index = 0;

        for (CarOwner o : inArray) {
            int diff = totalMonths - (o.getYear() * 12 + o.getMonth());
            if (diff > 9 && diff <= 12) {
                almost[index++] = o;
            }
        }
        return almost;
    }

    public String getOutputFileName() {
        return outputFileName;
    }
}
