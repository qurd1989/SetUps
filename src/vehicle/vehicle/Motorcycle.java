package vehicle;

import java.util.Set;

/**
 * Motorcycle model with validated mutable attributes used by the rental demo.
 */
public class Motorcycle implements Vehicle, MotorcycleVehicle {
    private static final Set<String> ALLOWED_TYPES = Set.of("sport", "cruiser", "off-road");

    private final String make;
    private final String model;
    private final int year;
    private int wheels;
    private String motorcycleType;

    public Motorcycle(String make, String model, int year) {
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
    public void setWheels(int wheels) {
        if (wheels < 2 || wheels > 4) {
            throw new IllegalArgumentException("Wheels must be between 2 and 4.");
        }
        this.wheels = wheels;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public void setMotorcycleType(String type) {
        this.motorcycleType = VehicleValidation.normalizeOption(type, "Motorcycle type", ALLOWED_TYPES);
    }

    @Override
    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void displayInfo() {
        System.out.println("\n--- Motorcycle Details ---");
        System.out.println("Make            : " + make);
        System.out.println("Model           : " + model);
        System.out.println("Year            : " + year);
        System.out.println("Wheels          : " + wheels);
        System.out.println("Motorcycle Type : " + motorcycleType);
    }
}
