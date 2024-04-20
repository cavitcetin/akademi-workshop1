import java.util.Scanner;
import java.util.Random;

public class guessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1; // 1 ile 10 arasında rastgele bir sayı üretir
        int guess;
        boolean correctGuess = false;

        System.out.println("Guess the number between 1 and 10");

        while (!correctGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + randomNumber);
                correctGuess = true;
            } else if (guess < randomNumber) {
                System.out.println("Try again! The number is greater than " + guess);
            } else {
                System.out.println("Try again! The number is smaller than " + guess);
            }
        }

        scanner.close();
    }
}