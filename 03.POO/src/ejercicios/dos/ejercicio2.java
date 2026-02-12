package ejercicios.dos;

import ejercicios.uno.Persona;

public class ejercicio2 {
    static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal cabra = new Cabra();

        cabra.hacerSonido();
        gato.hacerSonido();
        perro.hacerSonido();
    }
}
