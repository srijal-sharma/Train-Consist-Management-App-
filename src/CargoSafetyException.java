package week1;

/**
 * Custom runtime exception for unsafe cargo assignments
 */
public class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}