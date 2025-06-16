// The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
// Hint => 
// Create a variable named fee and assign 125000 to it.
// Create another variable discountPercent and assign 10 to it.
// Compute discount and assign it to the discount variable.
// Compute and print the fee you have to pay by subtracting the discount from the fee.
// O/P => The discount amount is INR ___ and final discounted fee is INR ___


public class universityFees_6 {
    public static void main(String[] args) {
        int fees=125000;
        double discountPercent=10;
        double discountAmount=(fees*discountPercent)/100;
        double finalfees= fees - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + "and \nfinal discounted fee is INR " + finalfees);
    }
    
}
