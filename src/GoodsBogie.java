package week1;

public class GoodsBogie {

    private final String type;
    private String cargo;

    // Constructor for UC12
    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // Constructor for UC15
    public GoodsBogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    // 🔥 THIS METHOD IS MISSING IN YOUR CODE
    public void assignCargo(String cargo) {
        try {
            if (type.equalsIgnoreCase("Rectangular")
                    && cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe assignment: Rectangular bogie cannot carry Petroleum"
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo + " → " + type);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt finished.\n");
        }
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + (cargo != null ? cargo : "No Cargo");
    }
}