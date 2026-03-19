package ejercicios.proyecto4;

public abstract class EspacioDeportivo {
    private final int id;
    private final String nombre;
    private final int capacidadMax;
    private int contador = 0;

    public EspacioDeportivo(String nombre,int capacidadMax){
        this.nombre = nombre;
        this.capacidadMax = capacidadMax;
        this.id = contador;
        contador++;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public abstract double calcularPrecio(int precio,int horas);
    public abstract boolean permitirReserva(int personas);
    public abstract void usar();

}
