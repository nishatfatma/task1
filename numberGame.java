//Task 1
package codesoft_task;
import java.util.Scanner;
import java.util.Random;
public class numberGame {
static int maxNumber = 100;
static int maxAttempts = 5;
	public static void main(String[] args) {
        Random random = new Random();
        int generatedNumber = random.nextInt(maxNumber) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100: ");
        int userGuess = scanner.nextInt();

        int numberOfAttempts = 1;
        while (userGuess != generatedNumber && numberOfAttempts < maxAttempts) {
            if (userGuess > generatedNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }
            System.out.println("Try again: ");
            userGuess = scanner.nextInt();

            numberOfAttempts++;
        }

        if (userGuess == generatedNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Sorry, the correct number was " + generatedNumber + ".");
        }
        int score = maxAttempts - numberOfAttempts;
        System.out.println("Your score is " + score + ".");
        System.out.println("Do you want to play again? (y/n)");
        char playAgain = scanner.next().charAt(0);

        if (playAgain == 'y') {
            main(args);
        } else {
            System.out.println("Goodbye!");
        }

	}

}
