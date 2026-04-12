package level3;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        double kg = weight / 2.2;

        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f%n", weight, kg);

        sc.close();
    }
}