package week1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * UC7: Sort passenger bogies based on capacity using Comparator
 */
public class UC7 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Display before sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display after sorting
        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSystem ready for further operations.");
    }
}