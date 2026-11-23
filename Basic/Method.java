package Basic;
public class Method {
    static int add(int a, int b) {
        return a + b;
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static void info() {
        System.out.println("This is method without parameter");
    }

    public static void main(String[] args) {
        int result = add(3, 5);

        System.out.println("Result: " + result);

        greet("Fadri");
        info();
    }
}
