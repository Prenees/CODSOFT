import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; 
            int attemptsLeft = 7; 
            boolean guessedCorrectly = false;

            System.out.println("\nI'm thinking of a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts to guess it!");

            while (attemptsLeft > 0 && !guessedCorrectly) {
                System.out.print("Enter your guess: ");

                // Validate input
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! The number was " + numberToGuess + ".");
                    guessedCorrectly = true;
                    score++;
                }

                attemptsLeft--;
                if (!guessedCorrectly && attemptsLeft > 0) {
                    System.out.println("Attempts left: " + attemptsLeft);
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The correct number was " + numberToGuess + ".");
            }

            System.out.print("\nDo you want to play another round? (y/n): ");
            playAgain = scanner.next().equalsIgnoreCase("y");
        }

        System.out.println("\nYour final score: " + score);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

