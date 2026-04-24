package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UC13: Compare loop-based vs stream-based filtering performance
 */
public class UC13 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Prepare a larger dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            // alternate capacities to simulate realistic mix
            int capacity = (i % 3 == 0) ? 72 : (i % 3 == 1) ? 56 : 40;
            bogies.add(new Bogie("Bogie-" + i, capacity));
        }

        // ---------------------------
        // Loop-based filtering
        // ---------------------------
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // ---------------------------
        // Stream-based filtering
        // ---------------------------
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // ---------------------------
        // Results
        // ---------------------------
        System.out.println("\nLoop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nLoop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        // Consistency check
        System.out.println("\nResults Match: " + (loopResult.size() == streamResult.size()));

        System.out.println("\nSystem ready for further operations.");
    }
}