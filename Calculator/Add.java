package Calculator;
import java.util.Scanner;
// Calculator Testo

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Input num2: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);

        scanner.close();
    }
}