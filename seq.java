import java.util.Scanner;

public class LargestNumberInSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the sequence: ");
        int size = scanner.nextInt();
        int largest = Integer.MIN_VALUE;
        System.out.println("Enter the numbers in the sequence:");
        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();
            if (number > largest) {
                largest = number;
            }
        }
        scanner.close();

        System.out.println("The largest number in the sequence is: " + largest);
    }
}
