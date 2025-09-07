/**
*  @author Andrew Chang
 * @version 1.0
 * @since 09/06/2025
 */
//
public class Imprecision
 {
     public static void main(String[] args) {
         double x= 12345.6789e200;
         double y= 1/x;
         double z= x*y;
        System.out.println("the value of x is: " + x);
        System.out.println("the value of y is: " + y);
        System.out.println("the value of z is: " + z);
        System.out.println("the value of 1-z is: "+ (1-z));
    }
}