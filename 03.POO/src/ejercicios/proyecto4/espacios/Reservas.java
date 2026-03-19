package ejercicios.proyecto4.espacios;

import ejercicios.proyecto4.EspacioDeportivo;

public class Reservas {
    public void reservar(EspacioDeportivo espacioDeportivo,int personas,int horas){
        boolean isPermitidos = espacioDeportivo.permitirReserva(personas);

        if (!isPermitidos){
            IO.println("No estan permitidos");
            return;
        }
        double precio = espacioDeportivo.calcularPrecio(personas,horas);
        IO.println("El precio es "+ precio);
        espacioDeportivo.usar();
    }
}