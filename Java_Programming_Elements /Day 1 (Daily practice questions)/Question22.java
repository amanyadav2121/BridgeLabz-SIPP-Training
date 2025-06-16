import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter to city: ");
        String toCity = scanner.nextLine();
        
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinal = scanner.nextDouble();
        
        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = scanner.nextInt();
        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinal = scanner.nextInt();
        
        double totalDistance = (fromToVia + viaToFinal) * 1.60934;
        int totalTime = timeFromToVia + timeViaToFinal;
        
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + 
                         " to " + toCity + " via " + viaCity + " is " + totalDistance + 
                         " km and the Total Time taken is " + totalTime + " minutes");
        scanner.close();
    }
}