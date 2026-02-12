package ejercicios.proyecto;

public final class Cliente {
    private final int id;
    private final String nombre;
    private static int contador=0;

    public Cliente(String nombre) {
        this.id =contador ;
        this.nombre = nombre;
        contador++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre+
                '}';
    }
}
