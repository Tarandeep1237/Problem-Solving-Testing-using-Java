import java.util.Scanner;

public class PrintAllPairs {

    // Method to print all possible pairs
    public static void printPairs(int[] arr, int n) {

        System.out.println("All possible pairs are:");

        // Outer loop for first element
        for (int i = 0; i < n; i++) {

            // Inner loop for second element
            for (int j = i + 1; j < n; j++) {

                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Pairs cannot be formed");
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call method
        printPairs(arr, n);

        sc.close();
    }
}
