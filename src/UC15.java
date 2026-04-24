package week1;

/**
 * UC15: Demonstrate safe cargo assignment with try-catch-finally
 */
public class UC15 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        GoodsBogie rectangular = new GoodsBogie("Rectangular");

        // Safe assignment
        cylindrical.assignCargo("Petroleum");

        // Unsafe assignment (handled gracefully)
        rectangular.assignCargo("Petroleum");

        // Another safe assignment to show program continues
        rectangular.assignCargo("Coal");

        // Final state
        System.out.println("\nFinal Bogie States:");
        System.out.println(cylindrical);
        System.out.println(rectangular);

        System.out.println("\nSystem continues safely.");
    }
}