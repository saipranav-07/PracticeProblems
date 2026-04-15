import java.util.Random;

public class FootballTeamHeights {

    // Method to generate random heights
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }
        return heights;
    }

    // Method to calculate sum
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    // Method to calculate mean
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Method to find shortest height
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        // Display heights
        System.out.print("Player Heights (cm): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        // Results
        System.out.println("\nSum of heights: " + sum(heights));
        System.out.println("Mean height: " + mean(heights));
        System.out.println("Shortest height: " + shortest(heights));
        System.out.println("Tallest height: " + tallest(heights));
    }
}