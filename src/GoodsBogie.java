package week1;

/**
 * Represents a Goods Bogie with type and cargo
 */
public class GoodsBogie {

    private final String type;   // Cylindrical, Open, Box
    private final String cargo;  // Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}