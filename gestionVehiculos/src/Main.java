import vehiculo.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("123456789", "Mercedes", 2020, 100.0);
        System.out.println("Vehiculo 1");
        vehiculo1.mostrarInformacion();

        Vehiculo vehiculo2 = new Vehiculo("987654321", "BMW", 2021, 200.0);
        System.out.println("Vehiculo 2");
        vehiculo2.mostrarInformacion();

        Vehiculo vehiculo3 = new Vehiculo("84746435", "Ford", 2022, 150.0);
        System.out.println("Vehiculo 3");
        vehiculo3.mostrarInformacion();
    }
}