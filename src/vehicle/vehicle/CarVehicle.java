package vehicle;

/**
 * Car-specific capabilities and constraints.
 */
public interface CarVehicle {
    /**
     * @param doors number of doors
     * @throws IllegalArgumentException if outside 1..6
     */
    void setDoors(int doors);

    /** @return configured number of doors. */
    int getDoors();

    /**
     * @param fuelType supported fuel type (petrol, diesel, electric)
     * @throws IllegalArgumentException if null/blank/unsupported
     */
    void setFuelType(String fuelType);

    /** @return normalized fuel type. */
    String getFuelType();
}
