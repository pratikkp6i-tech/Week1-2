package level3;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;

        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km%n", rounds);

        sc.close();
    }
}