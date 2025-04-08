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
        listaVehiculos.add(new Vehicle("123ABC", "Mercedes", 2020, 100.0));
        listaVehiculos.add(new Vehicle("456DEF", "BMW", 2021, 200.0));
        listaVehiculos.add(new Vehicle("789GHI", "Ford", 2022, 150.0));
        listaVehiculos.add(new Camion("AA000AA", "Mercedes", 2020, 100.0, true));
        listaVehiculos.add(new Auto("AB101CD", "Mini", 2020, 100.0, 3));

        // Recorrer e imprimir tipo e info
        for (Vehicle vehiculo : listaVehiculos) {
            System.out.println("Info " + vehiculo.getTipo() + ":");
            VehiclePrinter.mostrarInformacion(vehiculo);
            System.out.println("----------------------");
        }

        Vehicle encontrado = getVehiculo(listaVehiculos, "123ABC");

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
