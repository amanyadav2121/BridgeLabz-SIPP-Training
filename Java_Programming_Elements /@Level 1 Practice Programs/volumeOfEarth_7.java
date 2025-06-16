// Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

public class volumeOfEarth_7 {
    public static void main(String[] args) {
        int rad=6378;
        double volumeeOfEarth=(4.0/3.0)*3.1416*rad*rad*rad;
        double radInMiles= rad * 0.621371;
        double volumeInMiles=(4.0/3.0)*3.1416*radInMiles*radInMiles*radInMiles;

        System.out.println("The volume of earth in cubic kilometers is "+volumeeOfEarth +" km^3 " + "and \n cubic miles is "+ volumeInMiles+" miles^3");

    }
    
}
