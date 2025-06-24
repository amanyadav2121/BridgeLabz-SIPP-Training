import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (Physics Chemistry Maths): ");
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();
        
        double avg = (phy + chem + math) / 3.0;
        String grade, remarks;
        
        if (avg >= 80) { grade = "A"; remarks = "Above standards"; }
        else if (avg >= 70) { grade = "B"; remarks = "At standards"; }
        else if (avg >= 60) { grade = "C"; remarks = "Below standards"; }
        else if (avg >= 50) { grade = "D"; remarks = "Well below standards"; }
        else if (avg >= 40) { grade = "E"; remarks = "Too below standards"; }
        else { grade = "R"; remarks = "Remedial"; }
        
        System.out.printf("Average: %.2f%nGrade: %s%nRemarks: %s%n", avg, grade, remarks);
        sc.close();
    }
}