package ejercicios.proyecto4.espacios;

import ejercicios.proyecto4.EspacioDeportivo;

public class Piscina extends EspacioDeportivo {
    public Piscina(String nombre, int capacidadMax) {
        super(nombre, capacidadMax);
    }

    @Override
    public double calcularPrecio(int persona, int horas) {
        if (persona<0){
            IO.println("Personas no validas");
        }
        double precio = persona*50000;
        return precio;
    }

    @Override
    public boolean permitirReserva(int personas) {
        if(personas>getCapacidadMax()){
            return false;
        }
        return true;
    }

    @Override
    public void usar() {
        IO.println("Se esta usando La piscina");
    }
}
