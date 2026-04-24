package week1;

import java.util.ArrayList;
import java.util.List;

/**
 * UC12: Validate safety compliance of goods bogies using Streams
 */
public class UC12 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        // Uncomment to test unsafe case
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Safety validation using allMatch
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Status: " +
                (isSafe ? "SAFE ✅" : "UNSAFE ❌"));

        System.out.println("\nSystem ready for further operations.");
    }
}