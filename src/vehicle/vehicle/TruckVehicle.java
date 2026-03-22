package vehicle;

/**
 * Truck-specific capabilities and constraints.
 */
public interface TruckVehicle {
    /**
     * @param tons cargo capacity in tons
     * @throws IllegalArgumentException if not positive
     */
    void setCargoCapacity(double tons);

    /** @return configured cargo capacity in tons. */
    double getCargoCapacity();

    /**
     * @param transmission supported transmission (manual, automatic)
     * @throws IllegalArgumentException if null/blank/unsupported
     */
    void setTransmissionType(String transmission);

    /** @return normalized transmission type. */
    String getTransmissionType();
}
