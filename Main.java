import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num = myObj.nextInt();
        System.out.println("Number is: " + num);
    }
}