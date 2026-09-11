package Calculator;
import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Input num2: ");
        int num2 = scanner.nextInt();

        int result = MulNumber(num1, num2);

        System.out.println(num1 + " x " + num2 + " = " + result);

        scanner.close();
    }    

    public static int MulNumber(int num1, int num2) {
        return num1 * num2;
    }
}
