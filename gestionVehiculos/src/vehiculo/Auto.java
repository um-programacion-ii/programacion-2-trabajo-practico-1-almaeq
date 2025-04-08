package vehiculo;

public class Auto extends Vehicle {
    private int cantidadPasajeros;

    public Auto(String patente, String marca, Integer anio, double capacidadCargaKg,int cantidadPasajeros) {
        super(patente, marca, anio, capacidadCargaKg);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String getTipo() {
        return "Auto";
    }
}
