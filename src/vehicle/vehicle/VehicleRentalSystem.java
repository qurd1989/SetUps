package vehicle;

import java.util.Scanner;

public class VehicleRentalSystem {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Car Rental Vehicle System!");
        System.out.println("==========================================");

        // Create a car
        Car car = createCar();
        car.displayInfo();

        // Create a motorcycle
        Motorcycle moto = createMotorcycle();
        moto.displayInfo();

        // Create a truck
        Truck truck = createTruck();
        truck.displayInfo();

        System.out.println("\nAll vehicles registered successfully!");
        scanner.close();
    }

    // ----- Helper to get a car from user input ----
    static Car createCar() {
        System.out.println("\n[Enter Car Details]");
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        int year = getValidYear("Year: ");

        Car car = new Car(make, model, year);

        // Doors with error handling
        while (true) {
            try {
                System.out.print("Number of Doors (1-6): ");
                int doors = Integer.parseInt(scanner.nextLine());
                car.setDoors(doors);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        // Fuel type with error handling
        while (true) {
            try {
                System.out.print("Fuel Type (petrol/diesel/electric): ");
                String fuel = scanner.nextLine();
                car.setFuelType(fuel);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        return car;
    }

    // ---- Helper to get a motorcycle from user input ----
    static Motorcycle createMotorcycle() {
        System.out.println("\n[Enter Motorcycle Details]");
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        int year = getValidYear("Year: ");

        Motorcycle moto = new Motorcycle(make, model, year);

        while (true) {
            try {
                System.out.print("Number of Wheels (2-4): ");
                int wheels = Integer.parseInt(scanner.nextLine());
                moto.setWheels(wheels);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Motorcycle Type (sport/cruiser/off-road): ");
                String type = scanner.nextLine();
                moto.setMotorcycleType(type);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        return moto;
    }

    // ─── Helper to get a truck from user input ───
    static Truck createTruck() {
        System.out.println("\n[Enter Truck Details]");
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        int year = getValidYear("Year: ");

        Truck truck = new Truck(make, model, year);

        while (true) {
            try {
                System.out.print("Cargo Capacity (in tons): ");
                double cargo = Double.parseDouble(scanner.nextLine());
                truck.setCargoCapacity(cargo);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Transmission Type (manual/automatic): ");
                String trans = scanner.nextLine();
                truck.setTransmissionType(trans);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        return truck;
    }

    // ─── Helper to validate year input ───
    static int getValidYear(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int year = Integer.parseInt(scanner.nextLine());
                if (year < 1886 || year > 2100) {
                    throw new IllegalArgumentException("Please enter a realistic year.");
                }
                return year;
            } catch (NumberFormatException e) {
                System.out.println("That is not a valid year. Try again.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

