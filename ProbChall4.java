import java.util.Scanner;

/**
 * ProbChall_4 asks the user to input...
 * 1) define variables for integers exam1, 2, and 3
 * 2) create double average and char grade (variables)
 * 3) import scanner keyboard
 * 4) request user input by asking questions
 * 5) define average by creating an expression
 * 6) using if and else if to create grade system based on average score
 * 7) prints it back to the user based on their inputs
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 9/20/2025
 */
public class ProbChall4
{
    public static void main (String[] args){
        int exam1, exam2, exam3;
        double average;
        char grade;
        //int vars for 3 exams (ie exam1)
        //double var for avg
        //char var for grade
        Scanner keyboard = new Scanner(System.in);

        //get user input for each exam via Scanner.
        System.out.print("Enter your score for exam 1: ");
        exam1 = keyboard.nextInt();
        System.out.print("Enter your score for exam 2: ");
        exam2 = keyboard.nextInt();
        System.out.print("Enter your score for exam 3: ");
        exam3 = keyboard.nextInt();
        //figure out average, make sure you generate a double by casting with (double) or using 3.0 in denominator
        average = (double)(exam1 + exam2 + exam3) / 3;
        //Create Multibrach if-else if based on scores that sets appropriate letter grade (char) for each branch
        if (average >= 90) {
            grade = 'A';
        }
            else if (average >= 80) {
            grade = 'B';
        }
            else if (average >= 70) {
            grade = 'C';
        }
            else if (average >= 60) {
            grade = 'D';
        }
            else {
            grade = 'F';
        }
        ////console output
        //Use printf along with %c and %.1f placeholders so that average is 1 decimal place and letter grade is on next line    
        System.out.printf("Average = %.1f%n", average);
        System.out.printf("Letter Grade = %c%n", grade);
    }////end main
}////end class
