import java.util.Scanner;

interface Vehicle {
    void rent();
}

class Car implements Vehicle {
    public void rent() {
        System.out.println("Car is rented");
    }
}

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike is rented");
    }
}

class Truck implements Vehicle {
    public void rent() {
        System.out.println("Truck is rented");
    }
}

class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type == null) return null;

        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        } else {
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vehicle type (car / bike / truck): ");
        String type = sc.nextLine();

        Vehicle vehicle = VehicleFactory.getVehicle(type);

        if (vehicle != null) {
            vehicle.rent();
        } else {
            System.out.println("Invalid vehicle type");
        }

        sc.close();
    }
}
