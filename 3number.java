import java.util.Scanner;

public class LargestNumberExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        sc.close();

        int largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("The largest number is: " + largest);
    }
}
