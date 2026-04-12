package level3;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.printf("The %.2f fahrenheit is %.2f celsius%n", fahrenheit, celsiusResult);

        sc.close();
    }
}