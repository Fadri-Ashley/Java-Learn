package GuessNumber;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 101);

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int K = 4;

        while (true) {
            System.out.print("Input number: ");

            int guessNum = scanner.nextInt();

            if (guessNum == randomNum) {
                System.out.println("You win!!!");
                System.out.println(count + " attempts");
                break;
            } else if (count == K) {
                System.out.println("You exhausted 5 chances, the correct number was " + randomNum);
                break;
            } else if (guessNum < randomNum) {
                System.out.println("To Low");
            } else if (guessNum > randomNum) {
                System.out.println("To High");
            } else {
                System.out.println("Error");
            }

            count++;
        }

        scanner.close();
    }
}
