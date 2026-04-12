package level3;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter fromCity: ");
        String fromCity = sc.next();

        System.out.print("Enter viaCity: ");
        String viaCity = sc.next();

        System.out.print("Enter toCity: ");
        String toCity = sc.next();

        System.out.print("Enter distance fromCity to viaCity (miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance viaCity to toCity (miles): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time from fromCity to viaCity (minutes): ");
        double timeFromToVia = sc.nextDouble();

        System.out.print("Enter time from viaCity to toCity (minutes): ");
        double timeViaToFinalCity = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.printf("The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %.2f minutes%n",
                name, fromCity, toCity, viaCity, totalDistance, totalTime);

        sc.close();
    }
}