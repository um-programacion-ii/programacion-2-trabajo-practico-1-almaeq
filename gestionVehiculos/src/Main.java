import vehiculo.Auto;
import vehiculo.Camion;
import vehiculo.Vehicle;
import vehiculo.VehiclePrinter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear lista
        ArrayList<Vehicle> listaVehiculos = new ArrayList<>();

        // Crear y agregar objetos
        listaVehiculos.add(new Vehicle("123456789", "Mercedes", 2020, 100.0));
        listaVehiculos.add(new Vehicle("987654321", "BMW", 2021, 200.0));
        listaVehiculos.add(new Vehicle("84746435", "Ford", 2022, 150.0));
        listaVehiculos.add(new Camion("847587490", "Mercedes", 2020, 100.0, true));
        listaVehiculos.add(new Auto("682890233", "Mini", 2020, 100.0, 3));

        // Recorrer e identificar tipo
        for (Vehicle vehiculo : listaVehiculos) {
            if (vehiculo instanceof Auto) {
                System.out.println("Info Auto:");
            } else if (vehiculo instanceof Camion) {
                System.out.println("Info Camion:");
            } else {
                System.out.println("Info Vehiculo:");
            }

            VehiclePrinter.mostrarInformacion(vehiculo);
            System.out.println("----------------------");
        }
    }
}