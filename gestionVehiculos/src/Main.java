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

        // Recorrer e imprimir tipo e info
        for (Vehicle vehiculo : listaVehiculos) {
            System.out.println("Info " + vehiculo.getTipo() + ":");
            VehiclePrinter.mostrarInformacion(vehiculo);
            System.out.println("----------------------");
        }

        Vehicle encontrado = getVehiculo(listaVehiculos, "682890233");

        if (encontrado != null) {
            System.out.println("Vehículo encontrado - Info " + encontrado.getTipo() + ":");
            VehiclePrinter.mostrarInformacion(encontrado);
        } else {
            System.out.println("No se encontró vehículo con esa patente.");
        }
    }

    private static Vehicle getVehiculo(ArrayList<Vehicle> vehiculos, String patente) {
        for (Vehicle vehiculo : vehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                return vehiculo;
            }
        }
        return null;
    }
}
