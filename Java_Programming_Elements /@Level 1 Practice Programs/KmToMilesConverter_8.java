// Create a program to convert distance in kilometers to miles.
// Hint => 
// Create a variable km and assign type as double as in double km;
// Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
// Use Scanner Object to take user input for km as in km = input.nextInt();
// Use 1 mile = 1.6 km formulae to calculate miles and show the output
// I/P => km
// O/P => The total miles is ___ mile for the given ___ km


import java.util.*;
public class KmToMilesConverter_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km= sc.nextDouble();
        double miles=1.6;
        double ans=km/miles;
        System.out.println("The total miles is " +ans+ " mile for the given "+km+" km");
        sc.close();

    }
}