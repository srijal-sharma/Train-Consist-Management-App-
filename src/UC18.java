package week1;

import java.util.Scanner;

/**
 * UC18: Linear Search for Bogie ID in an unsorted array
 */
public class UC18 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Display list
        System.out.println("\nAvailable Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Linear Search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // early termination
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie ID FOUND in train consist.");
        } else {
            System.out.println("Bogie ID NOT FOUND.");
        }

        System.out.println("\nSystem ready for further operations.");

        scanner.close();
    }
}