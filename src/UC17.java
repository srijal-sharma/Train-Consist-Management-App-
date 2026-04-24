package week1;

import java.util.Arrays;

/**
 * UC17: Sort bogie names alphabetically using Arrays.sort()
 */
public class UC17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original array
        System.out.println("\nOriginal Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using built-in method
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nSystem ready for further operations.");
    }
}