import java.util.Scanner;
import distanceconverter.Distance;
import timeconverter.Time;

public class ConverterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Distance d = new Distance();
        Time t = new Time();

        System.out.println("=== Converter Menu ===");
        System.out.println("1. Distance Converter");
        System.out.println("2. Time Converter");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\n-- Distance Converter --");
                System.out.println("1. Meter to Kilometer");
                System.out.println("2. Kilometer to Meter");
                System.out.println("3. Miles to Kilometer");
                System.out.println("4. Kilometer to Miles");
                System.out.print("Enter your choice: ");
                int dChoice = sc.nextInt();

                System.out.print("Enter value: ");
                double dValue = sc.nextDouble();

                switch (dChoice) {
                    case 1: System.out.println("Result: " + d.meterToKm(dValue) + " km"); break;
                    case 2: System.out.println("Result: " + d.kmToMeter(dValue) + " m"); break;
                    case 3: System.out.println("Result: " + d.milesToKm(dValue) + " km"); break;
                    case 4: System.out.println("Result: " + d.kmToMiles(dValue) + " miles"); break;
                    default: System.out.println("Invalid choice");
                }
                break;

            case 2:
                System.out.println("\n-- Time Converter --");
                System.out.println("1. Hours to Minutes");
                System.out.println("2. Minutes to Hours");
                System.out.println("3. Minutes to Seconds");
                System.out.println("4. Seconds to Minutes");
                System.out.print("Enter your choice: ");
                int tChoice = sc.nextInt();

                System.out.print("Enter value: ");
                int tValue = sc.nextInt();

                switch (tChoice) {
                    case 1: System.out.println("Result: " + t.hoursToMinutes(tValue) + " minutes"); break;
                    case 2: System.out.println("Result: " + t.minutesToHours(tValue) + " hours"); break;
                    case 3: System.out.println("Result: " + t.minutesToSeconds(tValue) + " seconds"); break;
                    case 4: System.out.println("Result: " + t.secondsToMinutes(tValue) + " minutes"); break;
                    default: System.out.println("Invalid choice");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
