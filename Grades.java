import java.util.Scanner; //import Scanner
import java.io.*;  //Note - Since we are using multiple classes from java.io, we can use the * wildcard vs listing each individually.  Any 2+, it is best to use *

/**
 * Program Description - This files grades and calculates letter grades, the averages, and the low and high scores
 * 1) creates the strings for the main frame- putting in string for inFile and outFile + combining them for the processFile
 * 2) We can break down this code into three major parts, starting with inFile
 * 3) Within this, we have another string name and a scanner keyboard for each section. Allow the user to input their file (by name).
 * 4) the process section is a little different as we create variables for numbers, the average, and letter grades.
 * 5) Uses if and else statements to sort the letter grades depending on grade number
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 10/5/2025
 */
public class Grades{ 
    public static void main (String[] args) throws IOException{  //look how small main() is when we divide and conquer into (resusable) methods!  Only 4 lines!!!
        //String vars inFile, outFile for the file names
        String inFile, outFile;
        //set inFile using getInFile()
        inFile = getInFile();
        //set outFile using getOutFile()
        outFile = getOutFile();
        //call processFile() with inFile and outFile as arguments
        processFile(inFile, outFile);
    }//end main

    /**
     * Uses Scanner to get and return input file name
     * @return name of file from Scanner  //NOTE - Description only for return
     */
    public static String getInFile(){
        //create String var
        String infileName;
        //Create Scanner object tied to System.in (ie keyboard) and message to user like-Enter the name of the input file (ie input.txt).
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name of the input file: ");
        //Assign to String var from above via keyboard.nextLine()
        infileName = keyboard.nextLine();
        //create File var
        File inFileObj;
        //create a new File object with String var from above as argument and assign to File var from above
        inFileObj = new File(infileName);
        //create a while loop pit to ensure that file .exists (remember if it exists, you don't need to be in the pit.  Think ! here
            //repeat message to user like-Enter the name of the input file (ie input.txt).  Assign to String var from above via .nextLine()
            //repeat create a new File object with temp as argument and assign to File var from above
            while (!inFileObj.exists()) { // check if file really exists
                System.out.println("File not found. Please enter a valid file name: ");
                infileName = keyboard.nextLine();
                inFileObj = new File(infileName);
        }
        return infileName; //return String var from above
    }
    /**
     * Using Scanner, we can return the output file
     * @return - name of output file
     */
    public static String getOutFile() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the name of the output file: ");
    String outFileName = keyboard.nextLine();
    return outFileName;
}
    //create a method to generate and return a String for the output file name. 
    //Create a Scanner object tied to System.in (ie keyboard)
    //Message to user
    //return keyboard.nextLine() 
        
    /**
     * <Put description in here for processFile method.  NOTE can be several lines if necessary
     * <Need to create two @param entry lines>
     * @param inFileName name of input file
     * @param outFileName name of output file
     * @throws IOException
     */    

    public static void processFile(String inFileName, String outFileName) throws IOException {
    //create a void processFile method with 2 String parameters.  Since working with File, will need throws IOException
        ////vars section
        //int var number to assign from Scanner input
        //int var accumulators for As,Bs,Cs,Ds,Fs,min,max
        //int vars for total,count
        //double var for avg     
        //int var set for each line of grades with 1 assigned
        int number;
        int As, Bs, Cs, Ds, Fs;
        int min, max, total, count;
        double avg;
        int set = 1;

        ////Scanner and PrintWriter streams section
        //create File object to create a file from inFileName param
        //create Scanner object with File object from above.  NOTE-You know this will work based on while pit in getInFile()
        //create PrintWriter object with inOutFile from method param.  NOTE-PrintWriter creates a new file or overwrites an 
        //    existing file if using FileWriter.
        
        File inFile = new File(inFileName);
        Scanner inStream = new Scanner(inFile);
        PrintWriter outStream = new PrintWriter(outFileName);

        //outer while loop to test if Scanner object .hasNextLine()
            //set As=Bs=Cs=Ds=Fs=count=0 since new line of scores to average
            //set average to 0.0 since new line of scores to average
            //set number var to Scanner object using nextInt()
            //set min=max=number
            //set total=count=0
            //inner while loop looking for sentinel (-1).  -1 will cause while loop to stop reading.  Think how you will use ! here
                //if(number<min)
                    //set min to number
                //repeat the same except for max this time 
                //increment count since you will use this as the denominator to calculate average
                //add number to the total accumulator.  Think += here
                 while (inStream.hasNextLine()) {
            String line = inStream.nextLine().trim();
            if (line.isEmpty()) continue; 

            Scanner lineScan = new Scanner(line);

            As = Bs = Cs = Ds = Fs = 0;
            total = count = 0;
            avg = 0.0;

            if (!lineScan.hasNextInt()) {
                outStream.println("Set " + set + ": No grades to average");
                set++;
                continue;
            }

            number = lineScan.nextInt();

            if (number == -1) {
                outStream.println("Set " + set + ": No grades to average");
                set++;
                continue;
            }

            min = max = number;

            // Process all grades until -1 sentinel
            while (number != -1) {
                // Track min and max
                if (number < min) min = number;
                if (number > max) max = number;

                total += number;
                count++;

                // Count letter grades
                if (number >= 90)
                    As++;
                else if (number >= 80)
                    Bs++;
                else if (number >= 70)
                    Cs++;
                else if (number >= 60)
                    Ds++;
                else
                    Fs++;

                if (lineScan.hasNextInt())
                    number = lineScan.nextInt();
                else
                    break; // no more numbers
            } // end while

                //if-else if section to set increment the proper letter grade accumulators
                //else if (number>=?)
                    //increment Bs
                //account for all letter grades
                //need to read in the next number using Scanner object with .nextInt().  You are in a while pit to process each grade for each line
            outStream.println("Set " + set + " of grades calculated:");
            if (count == 0) {
                outStream.println("  No grades to average.\n");
            } else {
                avg = (double) total / count;
                outStream.println("  Number of As: " + As);
                outStream.println("  Number of Bs: " + Bs);
                outStream.println("  Number of Cs: " + Cs);
                outStream.println("  Number of Ds: " + Ds);
                outStream.println("  Number of Fs: " + Fs);
                outStream.println("  High score: " + max);
                outStream.println("  Low score: " + min);
                outStream.printf("  Average score: %.1f%n%n", avg);
            }
            set++;
            lineScan.close();
        } // end outer while
            //Write to the PrintWriter object (ie outStream) like you would to the screen (ie .println("Set " + set + " of grades calculated")
            //set++;
            //if to determine whether a line with -1 only, if so, count is still 0
                //print to PrintWriter object, No grades to average
            //else{
                //print to PrintWriter object, Number of As: along with the value in the As accumulator
                //repeat above for Bs, Cs,Ds, and Fs
                //print to PrintWriter object, The high score was: along with the value in max
                //repeat above but for min
                //compute avg. NOTE-Both total and count are integers.  You will need to cast here (double).
                //print to PrintWriter object, The avg score is: nicely formatted to 1 decimal place

        //message out to the console screen (System.out.println("Grade processing is completed");
        //Perhaps a message out to console screen, You can retrieve the output file at, <output file location>
        //close the inStream and outStream using the .close() for each
                System.out.println("Grade processing is completed.");
                System.out.println("You can retrieve the output file at: " + outFileName);

                inStream.close();
                outStream.close();
    }//end processFile()
}//end Grades class