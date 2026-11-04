package GuessNumber;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 101);

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            int guessNum = scanner.nextInt();

            if (guessNum == randomNum) {
                System.out.println("You win!!!");
                System.out.println(count + " attempts");
                break;
            } else if (guessNum < randomNum) {
                System.out.println("To Low");
            } else if (guessNum > randomNum) {
                System.out.println("To High");
            } else {
                System.out.println("Error");
            }

            count ++;
        }

        scanner.close();
    }
}
