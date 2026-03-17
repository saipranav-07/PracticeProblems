import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long temp = number;

        // Count digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Edge case for number = 0
        if (number == 0) {
            count = 1;
        }

        int[] digits = new int[count];

        // Store digits in array
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Frequency array (0–9)
        int[] freq = new int[10];

        // Calculate frequency
        for (int i = 0; i < digits.length;