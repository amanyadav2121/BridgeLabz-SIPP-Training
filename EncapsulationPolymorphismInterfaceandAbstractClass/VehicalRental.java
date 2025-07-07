abstract class Vehicle {
    private String vehicleNumber, type;
    private double rentalRate;

    public Vehicle(String num, String type, double rate) {
        this.vehicleNumber = num;
        this.type = type;
        this.rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);

    public double getRate() {
        return rentalRate;
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, String type, double rate) {
        super(num, type, rate);
    }

    public double calculateRentalCost(int days) {
        return days * getRate();
    }

    public double calculateInsurance() {
        return 500.0;
    }

    public String getInsuranceDetails() {
        return "Comprehensive";
    }
}
