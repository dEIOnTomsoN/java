import java.io.*;

public class SeparateOddEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter iWriter = new BufferedWriter(new FileWriter("integer.txt"));
        BufferedWriter evenWriter = new BufferedWriter(new FileWriter("even.txt"));
        BufferedWriter oddWriter = new BufferedWriter(new FileWriter("odd.txt"));

        System.out.print("Enter the number of integers: ");
        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            int number = Integer.parseInt(reader.readLine());
             
            if (number % 2 == 0) {
            iWriter.write(Integer.toString(number));
                iWriter.newLine();
                evenWriter.write(Integer.toString(number));
                evenWriter.newLine();
            } else {
            iWriter.write(Integer.toString(number));
                iWriter.newLine();
                oddWriter.write(Integer.toString(number));
                oddWriter.newLine();
            }
        }

        reader.close();
        evenWriter.close();
        oddWriter.close();
    }
}

