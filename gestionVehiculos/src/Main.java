import vehiculo.Auto;
import vehiculo.Camion;
import vehiculo.Vehicle;
import vehiculo.VehiclePrinter;

public class Main {
    public static void main(String[] args) {
        Vehicle vehiculo1 = new Vehicle("123456789", "Mercedes", 2020, 100.0);
        System.out.println("Vehiculo 1:");
        VehiclePrinter.mostrarInformacion(vehiculo1);

        Vehicle vehiculo2 = new Vehicle("987654321", "BMW", 2021, 200.0);
        System.out.println("Vehiculo 2:");
        VehiclePrinter.mostrarInformacion(vehiculo2);

        Vehicle vehiculo3 = new Vehicle("84746435", "Ford", 2022, 150.0);
        System.out.println("Vehiculo 3:");
        VehiclePrinter.mostrarInformacion(vehiculo3);

        Camion camion1 = new Camion("123456789", "Mercedes", 2020, 100.0, true);
        System.out.println("Camion 1:");
        VehiclePrinter.mostrarInformacion(camion1);

        Auto auto1 = new Auto("123456789", "Mini", 2020, 100.0, 3);
        System.out.println("Auto 1:");
        VehiclePrinter.mostrarInformacion(auto1);

    }

}