package vehiculo;

public class Camion extends Vehicle {
    private boolean tieneAcoplado;

    public Camion(String patente, String marca, Integer anio, double capacidadCargaKg,boolean tieneAcoplado) {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    @Override
    public String getTipo() {
        return "Camión";
    }
}
