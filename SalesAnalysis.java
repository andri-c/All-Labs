import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * The SalesAnalysis class reads weekly sales data from a file, it then stores the totals for every week in a month (so four). then it computes the statistics for it.
 *
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 11/23/2025
 */
public class SalesAnalysis {

    public static final int WEEKS_IN_MONTH = 4;

    private double[] weeklyNumber;
    private String inputFile;
    private int lineNumber = 0;

    /**
     * Constructor that accepts the file path and starts the weeklyNumber array.
     * 
     *
     * @param inputFile path to sales data file
     */
    public SalesAnalysis(String inputFile) {
        this.inputFile = inputFile;
        weeklyNumber = new double[WEEKS_IN_MONTH];
    }

    /**
     * Processes the file by reading each line, splitting values, and sending the array to setArrayElement().
     * 
     *
     * @throws IOException if file cannot be read
     */
    public void processFile() throws IOException {
        File file = new File(inputFile);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            setArrayElement(parts);
        }

        sc.close();
    }

    /**
     * Private helper method that converts each element of the weekly line into doubles, totals them, and stores the total in the weeklyNumber array.
     * 
     * @param inArray String array of the 7 daily values
     */
    private void setArrayElement(String[] inArray) {
        double total = 0;

        for (String num : inArray) {
            total += Double.parseDouble(num);
        }

        weeklyNumber[lineNumber] = total;
        lineNumber++;
    }

    /**
     * Outputs the weekly totals, weekly averages, highest/lowest weeks. (summary stats)
     */
    public void writeOutput() {
        double totalSales = 0;

        double min = weeklyNumber[0];
        double max = weeklyNumber[0];
        int minWeek = 0;
        int maxWeek = 0;

        for (int i = 0; i < weeklyNumber.length; i++) {
            double weekTotal = weeklyNumber[i];
            double avgDaily = weekTotal / 7.0;

            System.out.printf("Week%d Info\n", i + 1);
            System.out.printf("Total Sales: $%,.2f\n", weekTotal);
            System.out.printf("Avg Daily Sales for Week: $%,.2f\n", avgDaily);

            totalSales += weekTotal;

            if (weekTotal < min) {
                min = weekTotal;
                minWeek = i;
            }

            if (weekTotal > max) {
                max = weekTotal;
                maxWeek = i;
            }
        }

        double avgWeekly = totalSales / WEEKS_IN_MONTH;

        System.out.printf("Total Sales for all Weeks: $%,.2f\n", totalSales);
        System.out.printf("Avg Weekly Sales: $%,.2f\n", avgWeekly);

        System.out.printf("Week%d had the highest amount of sales\n", maxWeek + 1);
        System.out.printf("Week%d had the lowest amount of sales\n", minWeek + 1);
    }
}
