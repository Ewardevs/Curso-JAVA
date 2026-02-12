package ejercicios.uno;

/*
    Creá una clase Persona
    Atributos:
    nombre (String) → private
    edad (int) → private
    Creá:
    setEdad(int edad) → no permitir valores negativos
    getEdad()
    setNombre(String nombre)
    getNombre()
    Desde main, creá un objeto y mostrá sus datos.
 */
public class ejercicio1 {
    static void main(String[] args) {
        Persona p1 = new Persona();

        p1.setEdad(50);
        p1.setNombre("Edgar");

        IO.println(p1.toString());
    }
}