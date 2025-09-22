import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = reader.nextDouble();

        System.out.print("Enter second number: ");
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':

                if (second == 0) {
                    System.out.println("Error! Cannot divide by zero.");
                    return;
                }
                result = first / second;
                break;

            default:
                System.out.println("Error! Operator is not correct");
                return;
        }

        System.out.printf("Result: %.2f %c %.2f = %.2f%n", first, operator, second, result);
        reader.close();
    }
}