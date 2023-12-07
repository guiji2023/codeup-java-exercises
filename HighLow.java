import java.util.Random;
import java.util.Scanner;

public class HighLow {

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        playGame();

    }

    public static void playGame() {
        int ranNum = random.nextInt(101);
        int count = 0;
        int guess;
        do {
            System.out.println("====================================\nEnter a number between 0 and 100");
            guess = sc.nextInt();
            if (guess > ranNum) {
                System.out.println("LOWER");
            } else if (guess == ranNum) {
                System.out.println("GOOD GUESS!");
            } else {
                System.out.println("HIGHER");
            }
            count ++;
            System.out.println("You have played " + count + " guess(es)!");

        } while (guess != ranNum);

    }

}
