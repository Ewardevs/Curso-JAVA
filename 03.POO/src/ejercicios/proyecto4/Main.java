package ejercicios.proyecto4;

import ejercicios.proyecto4.espacios.CanchaFutbol;
import ejercicios.proyecto4.espacios.Piscina;
import ejercicios.proyecto4.espacios.Reservas;

public class Main {
    static void main(String[] args) {
        EspacioDeportivo cancha1 = new CanchaFutbol("Cancha la esperanza",50,25000);
        Reservas reservar = new Reservas();

        EspacioDeportivo piscina = new Piscina("piscina grande",150);

        reservar.reservar(piscina,5,5);
        IO.println("-------------");
        reservar.reservar(cancha1,25,1);


    }
}
