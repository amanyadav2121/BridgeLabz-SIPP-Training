package Strings;

import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many games would you like to play? ");
        int games = scanner.nextInt();
        
        int playerWins = 0;
        int computerWins = 0;
        
        for (int i = 1; i <= games; i++) {
            System.out.println("\nGame " + i + ":");
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String playerChoice = scanner.next().toLowerCase();
            
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);
            
            String result = determineWinner(playerChoice, computerChoice);
            
            if (result.equals("player")) {
                playerWins++;
                System.out.println("You win this round!");
            } else if (result.equals("computer")) {
                computerWins++;
                System.out.println("Computer wins this round!");
            } else {
                System.out.println("It's a tie!");
            }
        }
        
        displayStats(games, playerWins, computerWins);
        scanner.close();
    }

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";
        }
    }

    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) return "tie";
        
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "player";
        } else {
            return "computer";
        }
    }

    public static void displayStats(int totalGames, int playerWins, int computerWins) {
        double playerPercent = (double)playerWins / totalGames * 100;
        double computerPercent = (double)computerWins / totalGames * 100;
        
        System.out.println("\n+------------------+-------+-------+");
        System.out.println("| Stat             | Count | %     |");
        System.out.println("+------------------+-------+-------+");
        System.out.printf("| Player Wins      | %5d | %5.1f |\n", playerWins, playerPercent);
        System.out.printf("| Computer Wins    | %5d | %5.1f |\n", computerWins, computerPercent);
        System.out.printf("| Ties             | %5d | %5.1f |\n", 
                         (totalGames - playerWins - computerWins), 
                         100 - playerPercent - computerPercent);
        System.out.println("+------------------+-------+-------+");
    }
}