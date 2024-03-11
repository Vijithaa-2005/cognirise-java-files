import java.util.Random;
import java.util.Scanner;

public class Numbergame {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
        // System.out.println("Random number is" + randomNumber);
        int tryCount = 0;

        while (true) {
            System.out.println("Enter the guess (1-100):");
            int guess = scanner.nextInt();
            tryCount++;
            if (guess == randomNumber) {
                System.out.println("Good job, you win!");
                System.out.println(" It took you" + tryCount + " tries");
                break;
            } else if (randomNumber > guess) {
                System.out.println("Nope! The Number is higher,guess again");
            } else {
                System.out.println("Nope! The Number is lower,guess again");
            }

        }
        scanner.close();

    }

}
