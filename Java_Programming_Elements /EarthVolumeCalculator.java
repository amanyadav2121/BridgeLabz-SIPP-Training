public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radius = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + String.format("%.2f", volumeKm) + " and cubic miles is " + String.format("%.2f", volumeMiles));
    }
}