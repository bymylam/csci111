/*Given the following information, implement a full complete Java method.
Do not write a complete program, ONLY the method.

Write a method called sumArray:

This method will have 1 input parameter: an integer array called intArray
This method will read the values in the array, and return the sum of all values as an int.


For example: if intArray is [1, 1, 4, 0] then this method would return 6
 */
public class FEQ2 {
    public static void main(String[] args) {
        int[] intArray = {1,1,4,0};
        System.out.println(sumArray(intArray));
    }

    //complete the program here
    public static int sumArray(int[] intArray) {
        int sum = 0;
        for (int i = 0; i<intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }
}
