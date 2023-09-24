import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = scanner.nextInt();
        scanner.close();

        if (number1 > number2) {
            System.out.println("The largest number is " + number1);
        } else if (number2 > number1) {
            System.out.println("The largest number is " + number2);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
