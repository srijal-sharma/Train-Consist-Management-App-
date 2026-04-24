package week1;

import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs using HashSet
 */
public class UC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display final set (duplicates automatically removed)
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nSystem ready for further operations.");
    }
}