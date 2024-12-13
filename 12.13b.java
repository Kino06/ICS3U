import java.util.Random;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(50) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 50:");
        while (true) {
            System.out.print("Enter your guess: ");
            guess = a.nextInt();

            if (guess > target) {
                System.out.println("Too high! Try again.");
            } else if (guess < target) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! You guessed the number " + target);
                break;
            }
        }
    }
}
