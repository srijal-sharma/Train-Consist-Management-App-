package week1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * UC19: Binary Search for Bogie ID (works on sorted data)
 */
public class UC19 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // You can switch this to test unsorted input handling
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        // String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"}; // already sorted

        // Handle empty array safely
        if (bogieIds.length == 0) {
            System.out.println("\nNo bogies available.");
            System.out.println("Bogie ID NOT FOUND.");
            System.out.println("\nSystem ready for further operations.");
            return;
        }

        // Ensure sorted order (precondition)
        Arrays.sort(bogieIds);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        // Binary Search
        boolean found = binarySearch(bogieIds, key);

        // Result
        if (found) {
            System.out.println("Bogie ID FOUND in train consist.");
        } else {
            System.out.println("Bogie ID NOT FOUND.");
        }

        System.out.println("\nSystem ready for further operations.");
        scanner.close();
    }

    /**
     * Binary search on a sorted String array using compareTo()
     */
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                high = mid - 1; // search left half
            } else {
                low = mid + 1;  // search right half
            }
        }

        return false; // not found
    }
}