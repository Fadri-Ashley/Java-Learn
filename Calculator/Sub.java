package Calculator;
import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Input num2: ");
        int num2 = scanner.nextInt();

        int result = SubNumber(num1, num2);

        System.out.println(num1 + " - " + num2 + " = " + result);

        scanner.close();
    }

    public static int SubNumber(int num1, int num2) {
        return num1 - num2;
    }
}
