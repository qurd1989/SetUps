package vehicle;

public class Car implements Vehicle, CarVehicle {
    private String make;
    private String model;
    private int year;
    private int doors;
    private String fuelType;

    public Car(String make, String model, int year) {
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
        if (!fuelType.equalsIgnoreCase("petrol") &&
                !fuelType.equalsIgnoreCase("diesel") &&
                !fuelType.equalsIgnoreCase("electric")) {
            throw new IllegalArgumentException("Fuel type must be petrol, diesel, or electric.");
        }

        this.fuelType = fuelType;
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
