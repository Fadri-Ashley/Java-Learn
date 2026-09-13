package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose Operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Exit menu");
            System.out.print("Input number: ");
            int numMenu = scanner.nextInt();

            if (numMenu < 5 && numMenu > 0) {
                System.out.print("Input num1: ");
                int num1 = scanner.nextInt();
                System.out.print("Input num2: ");
                int num2 = scanner.nextInt();

                switch (numMenu) {
                    case 1:
                        System.out.println("Result: " + AddNumber(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + SubNumber(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + MulNumber(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + DivNumber(num1, num2));
                        break;
                    default:
                        System.out.println("Banano");
                }
            } else if (numMenu == 5) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Invalid Number");
            }
        }
        ;

        scanner.close();
    }

    public static int AddNumber(int num1, int num2) {
        return num1 + num2;
    }

    public static int SubNumber(int num1, int num2) {
        return num1 - num2;
    }

    public static int MulNumber(int num1, int num2) {
        return num1 * num2;
    }

    public static float DivNumber(float num1, float num2) {
        return num1 / num2;
    }
}
