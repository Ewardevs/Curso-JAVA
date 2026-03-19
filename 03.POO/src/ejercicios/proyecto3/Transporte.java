package ejercicios.proyecto3;

public abstract class Transporte {
    private final int capacidad;
    private final double velocidad;
    private final String nombre;

    protected Transporte(int capacidad,int velocidad,String nombre){
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public abstract void arrancar();
    public abstract void parar();
    public abstract void verVelocidad();

}
