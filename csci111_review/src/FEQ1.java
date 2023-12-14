/*Given the following information, implement a full complete Java method.
Do not write a complete program, ONLY the method.

Write a method call sumArrays:

This method will have 2 input parameters:
    an integer array called intArr
    a double array called doubleArr
You may assume that intArr and doubleArr are the same length.
This method will find the sum of both arrays.
This method will return the sum of both arrays added together.


For example: if intArray is [1, 1, 1] and doubleArr is [2.0, 2.0, 2.0] then this method would return 9.0
 */
public class FEQ1 {
    public static void main(String[] args) {
        int[] intArr = {1,1,1};
        double[] doubleArr = {2.0,2.0,2.0};
        System.out.println(sumArrays(intArr, doubleArr));
    }

    //complete the program here
    public static double sumArrays(int[] intArr, double[] doubleArr) {
        double sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i] + doubleArr[i];
        }
        return sum;
    }
}
