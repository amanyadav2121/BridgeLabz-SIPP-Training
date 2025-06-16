// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and 
//the selling price of INR 191. 
// Hint => Use a single print statement to display multiline text and variables.
// Profit = selling price - cost price
// Profit Percentage = profit / cost price * 100
// I/P => NONE
// O/P => 

public class profitLoss_4 {
    public static void main(String[] args) {
        int cp=129;
        int sp=191;
        double Profit = sp-cp;
        double Profit_Percentage = (Profit /cp )* 100;
        System.out.println("Cost Price = "+cp+ "\n Selling Price = "+ sp + "\nProfit = "+ Profit+"\nProfit Percentage = " +Profit_Percentage);

    }
}
