import java.util.Arrays;

/**
 * This ArrayMethods class helps give the foundation about arrays and how we can manipulate them with the aspects stated below.
 * This counts the number of elements in myArray, the sum, the average, the maximum, and the index of maximum.
 * Part 2 also dives deeper into manipulating arrays such as copying them and returning them.
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
     * This prints the array by taking all the information above and printing it out. (Thanks for giving this)
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
    
     /**
     * Finds the last (rightmost) index of a key in myArray.
     * 
     * @param key value to search for
     * @return index of last occurrence, or -1 if not found
     */
    public int findLast(int key) {
        for (int i = myArray.length - 1; i >= 0; i--) {
            if (myArray[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds all indices where a given key appears in myArray.
     * 
     * @param key value to search for
     * @return array of indices where key occurs
     */
    public int[] findAll(int key) {
        int count = 0;
        for (int num : myArray) {
            if (num == key)
                count++;
        }

        int[] indices = new int[count];
        int pos = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                indices[pos++] = i;
            }
        }
        return indices;
    }

    /**
     * Returns a "getArray" back to myArray.
     * 
     * @return the original myArray
     */
    public int[] getArray() {
        return myArray;
    }

    /**
     * Returns a copy of myArray using Arrays.copyOf().
     * 
     * @return a copied version of myArray
     */
    public int[] copyArray() {
        return Arrays.copyOf(myArray, myArray.length);
    }

    /**
     * Reverses the elements of the given array (in place).
     * (Modifies the passed array directly.)
     * 
     * @param inArray array to reverse
     */
    public void reverseArray(int[] inArray) {
        for (int i = 0; i < inArray.length / 2; i++) {
            int temp = inArray[i];
            inArray[i] = inArray[inArray.length - 1 - i];
            inArray[inArray.length - 1 - i] = temp;
        }
    }
}