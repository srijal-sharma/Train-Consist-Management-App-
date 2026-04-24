package week1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * UC20: Prevent search on empty data using fail-fast validation
 */
public class UC20 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔁 Toggle between empty and non-empty to test both behaviors
        // String[] bogieIds = {}; // ❌ Empty case (should throw exception)
        String[] bogieIds = {"BG101", "BG205", "BG309"}; // ✅ Normal case

        try {
            // Perform search with validation
            boolean found = searchBogie(bogieIds);

            if (found) {
                System.out.println("Bogie ID FOUND in train consist.");
            } else {
                System.out.println("Bogie ID NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nSystem ready for further operations.");
    }

    /**
     * Validates state and performs binary search
     */
    public static boolean searchBogie(String[] bogieIds) {

        // 🔥 Fail-fast validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search. Please add bogies first.");
        }

        // Ensure sorted before binary search
        Arrays.sort(bogieIds);

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAvailable Bogie IDs: " + Arrays.toString(bogieIds));
        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        // Binary Search
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}