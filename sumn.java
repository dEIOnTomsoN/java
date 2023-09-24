import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = (n * (n + 1)) / 2;
        System.out.println("The sum of the first " + n + " natural numbers is " + sum);
    }
}
