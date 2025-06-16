//Celsius to Fahrenheit Conversion

import java.util.Scanner;
public class Celsius_to_Fahrenheit_Conversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the celsius: ");
        int  Celsius = sc.nextInt();
        
       int Fahrenheit = (Celsius * 9/5) + 32;
        
        System.out.println("temp is " + Fahrenheit);
        
        sc.close(); 
    }
}
