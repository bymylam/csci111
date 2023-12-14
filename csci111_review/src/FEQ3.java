/*Given the following information, implement a full complete Java method.
Do not write a complete program, ONLY the method.

Write a method called averageArray:

This method will have 1 input parameter: an integer array called intArray
This method will read the values in the array, and return the average value as a double.


For example: if intArray is [1, 1, 4, 0] then this method would return 1.5
 */
public class FEQ3 {
    public static void main(String[] args) {
        int[] intArray = {1,1,4,0};
        System.out.println(averageArray(intArray));
    }

    //complete the program here
    public static double averageArray(int[] intArray) {
        double sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum/intArray.length;
    }
}
