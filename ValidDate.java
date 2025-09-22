import java.util.Scanner;

/**
 * Program Description => DISCLAIMER: I used a bit of profC Java tutor as I got confused on the bottom portions and splitting the else if statements and the brackets.
 * 1) declare integers for month, day, year, and max day
 * 2) include strings for temp, output, and displayDate   ===> basically define the variables
 * 3) include boolean isValid and isLeapYear
 * 4) create scanner keyboard (input scanner)
 * 5) print out the question to the user asking to input date in U.S. format.
 * 6) added temp and year => instructions provided from professor
 * 7) added displayDate that puts together month, day, and year
 * 8) added restrictions on having less than 1 day in a month and 31 days in a month
 * 9) included restrictions on having a leap year or not
 * 10) added restrictions depending on which month
 * 11) using isValid, output an answer whether it is valid or not.
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 9/21/2025
 */

public class ValidDate { 
    public static void main (String[] args){
        int month, day, year, maxDays;
        String temp, output, displayDate;
        boolean isValid, isLeapYear;
        
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("/");
        //create a blank output, output = "";
        output = "";
        //Message to have users enter date in mm/dd/yyyy format
        System.out.print("Please enter a date in mm/dd/yyyy format: ");
         month = keyboard.nextInt();
         day = keyboard.nextInt();
        //use Scanner object to assign month
        //use Scanner object to assign day
        temp = keyboard.nextLine().substring(1);  //ie, assigns "2022" to temp, if /2022 is in the buffer!
        //use Integer wrapper class to convert temp to int, year = Integer.parseInt(temp)
        year = Integer.parseInt(temp);
        displayDate = month + "/" + day + "/" + year;
        //create an isValid flag set to false;
        isValid = false; isLeapYear = false; output = "";
        ////Create if-else if to look for when:
        ////Section 1, day is less than 1
        if (day < 1) {
            output = "Cannot have less than 1 day in a month.";
            isValid = false;
        
            //Update output to something like - Can never have less than 1 day in a month.

        ////Section 2, day is larger than 31
    } else if (day > 31) {
            //Update output to something like - Can never have more than 31 days in a month.
            output = "Cannot have more than 31 days in a month.";
            isValid = false;
        ////Section 3, btw 1 and 31 days, can use a switch that evaluates months with intentional bleed through
    } else {
            switch (month) {
    // Months with 31 days
    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        maxDays = 31;
        break;

    // Months with 30 days
    case 4: case 6: case 9: case 11:
        maxDays = 30;
        break;

    // February, need leap year check
    case 2:
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            maxDays = 29;
            isLeapYear = true;
        } else {
            maxDays = 28;
            isLeapYear = false;
        }
        break;

    // Invalid month
    default:
        output = "Months must be 1 to 12.";
        isValid = false;
        maxDays = 0;
        break;
    }
    
    if (month >= 1 && month <= 12) {
        if (day >= 1 && day <= maxDays) {
            isValid = true;
        } else if (month == 2 && isLeapYear == false) {
            output= "Cannot have 29 or more days in a non-leap year.";
            isValid = false;
        } else if (month == 2 && isLeapYear == true) {
        output = "Cannot have 30 or more days in a leap year.";
        isValid = false;
        } else if ( month ==4 || month == 6 || month == 9|| month == 11) {
        output = "Cannot have 31 days in this month.";
        isValid = false;
        } else {
        output = "Cannot have more than 31 days in any month.";
        isValid = false;
        }
    }
}
  //// Output section using isValid flag
        if (isValid) {
    System.out.println(displayDate + " is a valid date.");
        }else{ 
    System.out.println(displayDate + " is not a valid date. " + output);
            }
    
        }
    }

