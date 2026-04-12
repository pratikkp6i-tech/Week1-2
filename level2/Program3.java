package level2;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter;

        System.out.print("Enter perimeter: ");
        perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);

        sc.close();
    }
}