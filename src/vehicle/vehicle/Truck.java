package vehicle;

public class Truck implements Vehicle , TruckVehicle {
    private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private String transmissionType;

    public Truck(String make, String model, int year) {
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
        if (!transmission.equalsIgnoreCase("manual") &&
                !transmission.equalsIgnoreCase("automatic")) {
            throw new IllegalArgumentException("Transmission must be manual or automatic.");
        }
        this.transmissionType = transmission;
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
