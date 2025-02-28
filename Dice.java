import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiceGame game = new DiceGame();

        System.out.println("🎲 Welcome to the Dice Rolling Game! 🎲");

        while (true) {
            System.out.println("\n1. Play Game");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    game.play();
                    break;
                case 2:
                    System.out.println("Exiting... Thanks for playing! 🎉");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
