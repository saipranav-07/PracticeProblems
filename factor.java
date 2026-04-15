import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors and return array
    public static int[] getFactors(int num) {
        int count = 0;

        // First loop: count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Initialize array
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Sum of factors
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Product of factors
    public static int product(int[] arr) {
        int prod = 1;
        for (int num : arr) {
            prod *= num;
        }
        return prod;
    }

    // Sum of squares of factors
    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}