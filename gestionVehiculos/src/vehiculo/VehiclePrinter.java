package vehiculo;

public class VehiclePrinter {

    public static void mostrarInformacion(Vehicle vehiculo) {
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Anio: " + vehiculo.getAnio());
        System.out.println("Capacidad: " + vehiculo.getCapacidadCargaKg());
    }
}
