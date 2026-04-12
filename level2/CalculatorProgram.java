package level2;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1, number2;

        System.out.print("Enter first number: ");
        number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        number2 = sc.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);

        if (number2 != 0) {
            double div = number1 / number2;
            System.out.println("Division = " + div);
        } else {
            System.out.println("Division not possible (cannot divide by zero)");
        }

        sc.close();
    }
}