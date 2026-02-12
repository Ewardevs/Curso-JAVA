package ejercicios.uno;

public class Persona {
    private String nombre;
    private Integer edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<0){
            IO.println("la edad no debe ser menor a 0");
            return;
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
