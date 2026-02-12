package ejercicios.proyecto2;

public final class Propietario {
    private final int id;
    private final String nombre;
    private static int contador=0;

    public Propietario(String nombre) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
