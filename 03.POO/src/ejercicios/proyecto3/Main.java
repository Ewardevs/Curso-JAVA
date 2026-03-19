package ejercicios.proyecto3;

import ejercicios.proyecto3.TranspotesTypes.Aereo;
import ejercicios.proyecto3.TranspotesTypes.Terrestre;

public class Main {
    static void main(String[] args) {
        Transporte bus = new Terrestre(50,120,"La santiana");
        Transporte avion = new Aereo(230,300,"arabia air");

        Agencia agencia = new Agencia();

        agencia.encenderTransporte(bus);
        agencia.encenderTransporte(avion);
    }
}
