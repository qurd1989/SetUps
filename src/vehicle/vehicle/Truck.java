package vehicle;

import java.util.Set;

/**
 * Truck model with validated mutable attributes used by the rental demo.
 */
public class Truck implements Vehicle, TruckVehicle {
    private static final Set<String> ALLOWED_TRANSMISSION_TYPES = Set.of("manual", "automatic");

    private final String make;
    private final String model;
    private final int year;
    private double cargoCapacity;
    private String transmissionType;

    public Truck(String make, String model, int year) {
        this.make = VehicleValidation.requireNonBlank(make, "Make");
        this.model = VehicleValidation.requireNonBlank(model, "Model");
        this.year = VehicleValidation.requireYearInRange(year);
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setCargoCapacity(double tons) {
        if (tons <= 0) {
            throw new IllegalArgumentException("Cargo capacity must be greater than 0.");
        }
        this.cargoCapacity = tons;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void setTransmissionType(String transmission) {
        this.transmissionType = VehicleValidation.normalizeOption(
                transmission,
                "Transmission type",
                ALLOWED_TRANSMISSION_TYPES
        );
    }

    @Override
    public String getTransmissionType() {
        return transmissionType;
    }

    public void displayInfo() {
        System.out.println("\n--- Truck Details ---");
        System.out.println("Make             : " + make);
        System.out.println("Model            : " + model);
        System.out.println("Year             : " + year);
        System.out.println("Cargo Capacity   : " + cargoCapacity + " tons");
        System.out.println("Transmission     : " + transmissionType);
    }
}
