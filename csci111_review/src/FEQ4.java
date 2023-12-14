/*Given the following information, implement a full complete Java method.
Do not write a complete program, ONLY the method.

Write a method called perimeterOfRectangle.

- This method will take two input values, height and width , that represent the height and width of a rectangle.
- This method will return the perimeter of the rectangle.
    You can calculate the perimeter of a rectangle by multiplying the height and width by 2, and adding together:
    perimeter = 2 * height + 2 * width
- Both height and width should be double data types, and this method should return a double data type.
 */
public class FEQ4 {
    public static void main(String[] args) {
        System.out.println(perimeterOfRectangle(1.0,1.0));
    }

    //complete the program here
    public static double perimeterOfRectangle(double height, double width) {
        return 2*(height + width);
    }
}
