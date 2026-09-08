package Calculator;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Input num1: ");
        int x = obj.nextInt();
        System.out.print("Input num2: ");
        int y = obj.nextInt();

        int sum = x + y;

        System.out.println(x + " + " + y + " = " + sum);

        obj.close();
    }
}