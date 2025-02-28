import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    private int playerScore;
    private int computerScore;
    private Random random;
    private Scanner scanner;

    public DiceGame() {
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public void play() {
        playerScore = 0;
        computerScore = 0;
        System.out.println("\n🎲 Best of 5 Rounds! 🎲");

        for (int round = 1; round <= 5; round++) {
            System.out.println("\n🔹 Round " + round + " 🔹");
            rollDice();
        }

        showFinalResult();
        askForReplay();
    }

    private void rollDice() {
        System.out.println("Press Enter to roll the dice...");
        scanner.nextLine();

        int playerRoll = random.nextInt(6) + 1;
        int computerRoll = random.nextInt(6) + 1;

        System.out.println("🎲 You rolled: " + playerRoll);
        System.out.println("🤖 Computer rolled: " + computerRoll);

        if (playerRoll > computerRoll) {
            playerScore++;
            System.out.println("✅ You win this round!");
        } else if (playerRoll < computerRoll) {
            computerScore++;
            System.out.println("❌ Computer wins this round!");
        } else {
            System.out.println("⚖ It's a tie!");
        }
    }

    private void showFinalResult() {
        System.out.println("\n📊 Final Score:");
        System.out.println("🧑 Player: " + playerScore);
        System.out.println("🤖 Computer: " + computerScore);

        if (playerScore > computerScore) {
            System.out.println("🎉 Congratulations! You won the game! 🎉");
        } else if (playerScore < computerScore) {
            System.out.println("😔 You lost! Better luck next time.");
        } else {
            System.out.println("⚖ It's a tie! Play again?");
        }
    }

    private void askForReplay() {
        System.out.print("\nDo you want to play again? (yes/no): ");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("yes")) {
            play();
        } else {
            System.out.println("Thanks for playing! 🎲");
        }
    }
}
