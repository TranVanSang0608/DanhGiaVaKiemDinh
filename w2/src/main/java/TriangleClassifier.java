import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side 1:");
        int side1 = scanner.nextInt();

        System.out.println("Enter the length of side 2:");
        int side2 = scanner.nextInt();

        System.out.println("Enter the length of side 3:");
        int side3 = scanner.nextInt();

        String triangleType = classifyTriangle(side1, side2, side3);

        System.out.println("The triangle is " + triangleType);
    }

    public static String classifyTriangle(int side1, int side2, int side3) {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "NotATriangle";
        } else if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}