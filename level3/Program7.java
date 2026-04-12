package level3;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numberOfChocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter numberOfChildren: ");
        int numberOfChildren = sc.nextInt();

        int each = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + each +
                " and the number of remaining chocolates are " + remaining);

        sc.close();
    }
}