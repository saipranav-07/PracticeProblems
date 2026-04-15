import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.println("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Assume first person is youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("\nYoungest friend: " + names[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest friend: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + ")");

        sc.close();
    }
}