package Calculator;
import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input num1: ");
        float num1 = scanner.nextFloat();
        System.out.print("Input num2: ");
        float num2 = scanner.nextFloat();

        float result = DivNumber(num1, num2);

        System.out.println(num1 + " : " + num2 + " = " + result);
        
        scanner.close();
    }

    public static float DivNumber(float num1, float num2) {
        return num1/num2;
    }
}
