package week1;

import java.util.ArrayList;
import java.util.List;

/**
 * UC10: Calculate total seating capacity using Stream reduce()
 */
public class UC10 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Reuse Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Display bogies
        System.out.println("\nBogies in Train:");
        bogies.forEach(System.out::println);

        // Calculate total capacity using map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);    // aggregate

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        System.out.println("\nSystem ready for further operations.");
    }
}