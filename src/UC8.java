package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UC8: Filter bogies using Stream API
 */
public class UC8 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Reuse Bogie objects (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Display original list
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);

        // Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display filtered result
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        // Verify original list unchanged
        System.out.println("\nOriginal list remains unchanged:");
        bogies.forEach(System.out::println);

        System.out.println("\nSystem ready for further operations.");
    }
}