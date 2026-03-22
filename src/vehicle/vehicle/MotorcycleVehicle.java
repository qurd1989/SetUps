package vehicle;

/**
 * Motorcycle-specific capabilities and constraints.
 */
public interface MotorcycleVehicle {
    /**
     * @param wheels wheel count
     * @throws IllegalArgumentException if outside 2..4
     */
    void setWheels(int wheels);

    /** @return configured wheel count. */
    int getWheels();

    /**
     * @param type supported type (sport, cruiser, off-road)
     * @throws IllegalArgumentException if null/blank/unsupported
     */
    void setMotorcycleType(String type);

    /** @return normalized motorcycle type. */
    String getMotorcycleType();
}
