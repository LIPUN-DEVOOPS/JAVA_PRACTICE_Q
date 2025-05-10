import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter your operator (+, -, *, /, %, p for power): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            case '%':
                System.out.println("Result: " + (a % b));
                break;
            case 'p':
                System.out.println("Result: " + Math.pow(a, b));
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }

        sc.close();
    }
}
