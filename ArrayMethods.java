import java.util.Arrays;

/**
 * This ArrayMethods class helps give the foundation about arrays and how we can manipulate them with the aspects stated below.
 * This counts the number of elements in myArray, the sum, the average, the maximum, and the index of maximum.
 * 
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 11/02/2025
 */
public class ArrayMethods {

    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * This counts the number of "elements" in myArray.
     * 
     * @return number of elements in myArray
     */
    public int count() {
        int counter = 0;
        for (int num : myArray) {
            counter++;
        }
        return counter;
    }

    /**
     * This calculates the sum of all elements in myArray.
     * 
     * @return sum of elements
     */
    public int sum() {
        int total = 0;
        for (int num : myArray) {
            total += num;
        }
        return total;
    }

    /**
     * Calculates the average of all elements in myArray.
     * 
     * @return average of elements as a double
     */
    public double average() {
        return (double) sum() / count();
    }

    /**
     * This finds the maximum value in myArray.
     * 
     * @return the maximum value
     */
    public int findMax() {
        int max = myArray[0];
        for (int num : myArray) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * This finds the index of the maximum value in myArray.
     * 
     * @return the index of the maximum value
     */
    public int findIndexOfMax() {
        int max = myArray[0];
        int indexOfMax = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    /**
     * This prints the array by taking all the information above and printing it out.
     * 
     * @param inArray int array to print
     */
    public void print(int[] inArray) {
        System.out.print("{");
        int i;
        for (i = 0; i < inArray.length - 1; i++) {
            System.out.print(inArray[i] + ", ");
        }
        if (inArray.length > 0) {
            System.out.print(inArray[i]);
        }
        System.out.println("}");
    }
}