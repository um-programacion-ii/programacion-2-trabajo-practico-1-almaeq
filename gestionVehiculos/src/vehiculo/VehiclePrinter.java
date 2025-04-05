package vehiculo;

public class VehiclePrinter {

    public static void mostrarInformacion(Vehicle vehiculo) {
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Anio: " + vehiculo.getAnio());
        System.out.println("Capacidad: " + vehiculo.getCapacidadCargaKg());
    }

    public static void mostrarInformacion(Camion camion) {
        System.out.println("Patente: " + camion.getPatente());
        System.out.println("Marca: " + camion.getMarca());
        System.out.println("Anio: " + camion.getAnio());
        System.out.println("Capacidad: " + camion.getCapacidadCargaKg());
        System.out.println("Tiene acoplado: " + camion.isTieneAcoplado());
    }

    public static void mostrarInformacion(Auto auto) {
        System.out.println("Patente: " + auto.getPatente());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Anio: " + auto.getAnio());
        System.out.println("Capacidad: " + auto.getCapacidadCargaKg());
        System.out.println("Cantidad de pasajeros: " + auto.getCantidadPasajeros());
    }
}
