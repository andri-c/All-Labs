import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Driver class that prompts user for a file path, ensures file exists, then runs SalesAnalysis.
 * 
 * @author Andrew Chang, andrewchang290@gmail.com
 * @version v1.0
 * @since 11/23/2025
 */
public class SalesAnalysisDemo {
    /**
     * This is the main method that executes the Sales Analysis class. This is the driver.
     */
    public static void main(String[] args) throws IOException {

        Scanner kb = new Scanner(System.in);

        File file;
        String fileName;

        do {
            System.out.print("Enter the path to the SalesData.txt file: ");
            fileName = kb.nextLine();
            file = new File(fileName);

            if (!file.exists()) {
                System.out.println("File not found. Try again.\n");
            }
        } while (!file.exists());

        SalesAnalysis sa = new SalesAnalysis(fileName);
        sa.processFile();
        sa.writeOutput();

        kb.close();
    }
}
