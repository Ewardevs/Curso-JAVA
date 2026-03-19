package ejercicios.proyecto4.espacios;

import ejercicios.proyecto4.EspacioDeportivo;

public class CanchaFutbol extends EspacioDeportivo {
    private final int precioXhora;
    public CanchaFutbol(String nombre,int capacidadMax,int precioXhora){
        this.precioXhora = precioXhora;
        super(nombre,capacidadMax);
    }

    @Override
    public double calcularPrecio(int personas ,int horas) {
        double precio = horas * precioXhora;
        return precio;
    }

    @Override
    public boolean permitirReserva(int personas) {
        if (personas > getCapacidadMax()){
            return false;
        }
        return true;
    }

    @Override
    public void usar() {
        IO.println("Usando la cancha de futbol");
    }
}
