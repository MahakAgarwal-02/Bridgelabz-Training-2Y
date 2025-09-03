package string;
import java.util.Scanner;
public class RockPaperScissor {
	    public static String getComputerChoice() {
	        double rand = Math.random();
	        if (rand < 1.0 / 3) return "rock";
	        else if (rand < 2.0 / 3) return "paper";
	        else return "scissors";
	    }

	    public static String findWinner(String userChoice, String compChoice) {
	        if (userChoice.equals(compChoice)) return "Draw";

	        switch (userChoice) {
	            case "rock":
	                return compChoice.equals("scissors") ? "User" : "Computer";
	            case "paper":
	                return compChoice.equals("rock") ? "User" : "Computer";
	            case "scissors":
	                return compChoice.equals("paper") ? "User" : "Computer";
	            default:
	                return "Invalid";
	        }
	    }

	    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
	        double userPercent = totalGames == 0 ? 0 : ((double) userWins / totalGames) * 100;
	        double compPercent = totalGames == 0 ? 0 : ((double) compWins / totalGames) * 100;

	        String[][] stats = new String[3][3];

	        stats[0][0] = "Player Wins";
	        stats[0][1] = String.valueOf(userWins);
	        stats[0][2] = String.format("%.2f%%", userPercent);

	        stats[1][0] = "Computer Wins";
	        stats[1][1] = String.valueOf(compWins);
	        stats[1][2] = String.format("%.2f%%", compPercent);

	        stats[2][0] = "Draws";
	        stats[2][1] = String.valueOf(totalGames - userWins - compWins);
	        stats[2][2] = String.format("%.2f%%", totalGames == 0 ? 0 : ((double)(totalGames - userWins - compWins) / totalGames) * 100);

	        return stats;
	    }

	    public static void displayResults(String[][] gameResults, String[][] stats) {
	        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
	        System.out.println("-----------------------------------------------------");
	        for (int i = 0; i < gameResults.length; i++) {
	            System.out.printf("%d\t%s\t\t%s\t\t%s\n", i + 1, gameResults[i][0], gameResults[i][1], gameResults[i][2]);
	        }
	        System.out.println("\nSummary:");
	        System.out.println("Category\tCount\tPercentage");
	        System.out.println("----------------------------------");
	        for (int i = 0; i < stats.length; i++) {
	            System.out.printf("%s\t%s\t%s\n", stats[i][0], stats[i][1], stats[i][2]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of games to play: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); 

	        String[][] gameResults = new String[n][3];
	        int userWins = 0, compWins = 0;

	        for (int i = 0; i < n; i++) {
	            System.out.print("Game " + (i + 1) + " - Enter your choice (rock, paper, scissors): ");
	            String userChoice = scanner.nextLine().toLowerCase();

	            String compChoice = getComputerChoice();

	            String winner = findWinner(userChoice, compChoice);

	            if (winner.equals("User")) userWins++;
	            else if (winner.equals("Computer")) compWins++;

	            gameResults[i][0] = userChoice;
	            gameResults[i][1] = compChoice;
	            gameResults[i][2] = winner;
	        }

	        String[][] stats = calculateStats(userWins, compWins, n);
	        displayResults(gameResults, stats);
	}

}
