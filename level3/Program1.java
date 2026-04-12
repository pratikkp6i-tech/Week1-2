package level3;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter celsius: ");
        double celsius = sc.nextDouble();

        double farenheitResult = (celsius * 9 / 5) + 32;

        System.out.printf("The %.2f celsius is %.2f fahrenheit%n", celsius, farenheitResult);

        sc.close();
    }
}