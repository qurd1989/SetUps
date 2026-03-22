package vehicle;

/**
 * Common contract for all vehicles in the rental system.
 */
public interface Vehicle {

    /** @return vehicle manufacturer name (non-blank). */
    String getMake();

    /** @return vehicle model name (non-blank). */
    String getModel();

    /** @return production year in the supported range. */
    int getYear();
}
