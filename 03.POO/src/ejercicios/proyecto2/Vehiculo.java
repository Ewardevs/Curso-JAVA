package ejercicios.proyecto2;

public abstract class Vehiculo {
    private final String marca;
    private final String modelo;
    private final Propietario propietario;

    Vehiculo(String marca,String modelo , Propietario propietario){
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    abstract void arrancar();
    abstract void frenar();
}
