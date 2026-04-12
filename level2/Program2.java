package level2;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, height;

        System.out.print("Enter base in cm: ");
        base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / 6.4516;

        System.out.printf("The Area of the triangle in sq cm is %.2f%n", areaCm);
        System.out.printf("The Area of the triangle in sq in is %.2f%n", areaInch);

        sc.close();
    }
}