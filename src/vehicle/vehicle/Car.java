package vehicle;

import java.util.Set;

/**
 * Car model with validated mutable attributes used by the rental demo.
 */
public class Car implements Vehicle, CarVehicle {
    private static final Set<String> ALLOWED_FUEL_TYPES = Set.of("petrol", "diesel", "electric");

    private final String make;
    private final String model;
    private final int year;
    private int doors;
    private String fuelType;

    public Car(String make, String model, int year) {
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
    public void setDoors(int doors) {
        if (doors < 1 || doors > 6) {
            throw new IllegalArgumentException("Doors must be between 1 and 6.");
        }
        this.doors = doors;
    }

    @Override
    public int getDoors() {
        return doors;
    }

    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = VehicleValidation.normalizeOption(fuelType, "Fuel type", ALLOWED_FUEL_TYPES);
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Make       : " + make);
        System.out.println("Model      : " + model);
        System.out.println("Year       : " + year);
        System.out.println("Doors      : " + doors);
        System.out.println("Fuel Type  : " + fuelType);
    }
}
