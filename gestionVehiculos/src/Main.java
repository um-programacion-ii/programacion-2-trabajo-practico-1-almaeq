import vehiculo.Vehicle;
import vehiculo.VehiclePrinter;

public class Main {
    public static void main(String[] args) {
        Vehicle vehiculo1 = new Vehicle("123456789", "Mercedes", 2020, 100.0);
        System.out.println("Vehiculo 1");
        VehiclePrinter.mostrarInformacion(vehiculo1);

        Vehicle vehiculo2 = new Vehicle("987654321", "BMW", 2021, 200.0);
        System.out.println("Vehiculo 2");
        VehiclePrinter.mostrarInformacion(vehiculo2);

        Vehicle vehiculo3 = new Vehicle("84746435", "Ford", 2022, 150.0);
        System.out.println("Vehiculo 3");
        VehiclePrinter.mostrarInformacion(vehiculo3);
    }
}