package week1;

/**
 * UC16: Manual sorting using Bubble Sort (no Collections.sort)
 */
public class UC16 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original array
        System.out.print("\nOriginal Capacities: ");
        printArray(capacities);

        // Bubble Sort
        bubbleSort(capacities);

        // Display sorted array
        System.out.print("\nSorted Capacities: ");
        printArray(capacities);

        System.out.println("\nSystem ready for further operations.");
    }

    // Bubble Sort implementation
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false; // optimization

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if (!swapped) break;
        }
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}