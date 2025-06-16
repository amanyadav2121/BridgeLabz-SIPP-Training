import java.util.Scanner;

public class AverageOfnumbers {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        int a= sc.nextInt();

        System.out.println("enter second number");
        int b= sc.nextInt();

        System.out.println("enter third number");
        int c= sc.nextInt();

        double avg=(a+b+c)/3;
        
        System.out.println( "average is "+ avg);
        sc.close();
    }
   
}
