import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // Take user input for number of games
        System.out.print("Enter number of games you want to play: ");
        int games = sc.nextInt();
        sc.nextLine(); // Clear newline

        // 2D array to store round results: [round][0]=player, [1]=computer, [2]=winner
        String[][] gameResults = new String[games][3];

        // Counters
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        // Loop through all games
        for (int i = 0; i < games; i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String playerChoice = sc.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = determineWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }

            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        // Generate stats summary
        String[][] summary = generateSummary(playerWins, computerWins, draws, games);

        // Display result
        System.out.println("\n--- Game Results ---");
        displayResults(gameResults);

        System.out.println("\n--- Final Stats ---");
        displayResults(summary);

        sc.close(); // Close Scanner
    }

    // Method to get random computer choice
    public static String getComputerChoice() {
        double rand = Math.random();

        if (rand < 0.34) return "rock";
        else if (rand < 0.67) return "paper";
        else return "scissors";
    }

    // Method to determine winner
    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        }

        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    // Method to generate summary stats
    public static String[][] generateSummary(int playerWins, int computerWins, int draws, int totalGames) {
        String[][] summary = new String[3][3];

        // Row 1: Player
        summary[0][0] = "Player";
        summary[0][1] = String.valueOf(playerWins);
        summary[0][2] = String.format("%.2f%%", (playerWins * 100.0) / totalGames);

        // Row 2: Computer
        summary[1][0] = "Computer";
        summary[1][1] = String.valueOf(computerWins);
        summary[1][2] = String.format("%.2f%%", (computerWins * 100.0) / totalGames);

        // Row 3: Draws
        summary[2][0] = "Draws";
        summary[2][1] = String.valueOf(draws);
        summary[2][2] = String.format("%.2f%%", (draws * 100.0) / totalGames);

        return summary;
    }

    // Method to display 2D String array in tabular format
    public static void displayResults(String[][] data) {
        if (data[0].length == 3 && data[0][0].equalsIgnoreCase("Player") || data[0][0].equalsIgnoreCase("Computer")) {
            System.out.println("Name\tWins\tWinning %");
        } else {
            System.out.println("Game\tPlayer\tComputer\tWinner");
        }

        for (int i = 0; i < data.length; i++) {
            if (data[0].length == 3 && data[0][0].equalsIgnoreCase("Player") || data[0][0].equalsIgnoreCase("Computer")) {
                System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2]);
            } else {
                System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1] + "\t\t" + data[i][2]);
            }
        }
    }
}
