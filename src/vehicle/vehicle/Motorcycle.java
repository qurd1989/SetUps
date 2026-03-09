package vehicle;

public class Motorcycle implements Vehicle, MotorVehicle {
    private String make;
    private String model;
    private int year;
    private int wheels;
    private String motorcycleType;

    public Motorcycle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
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
        if (!type.equalsIgnoreCase("sport") &&
                !type.equalsIgnoreCase("cruiser") &&
                !type.equalsIgnoreCase("off-road")) {
            throw new IllegalArgumentException("Type must be sport, cruiser, or off-road.");
        }
            this.motorcycleType = type;

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
