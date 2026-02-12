package ejercicios.proyecto2;

public class Auto extends Vehiculo{
    public Auto(String marca, String modelo, Propietario propietario) {
        super(marca, modelo, propietario);
    }

    @Override
    public void arrancar(){
        IO.println("Auto  de "+getPropietario().getNombre()+" Arrancando");
    }

    @Override
    void frenar() {
        IO.println("Auto de "+getPropietario().getNombre() +" frenando");
    }
}
