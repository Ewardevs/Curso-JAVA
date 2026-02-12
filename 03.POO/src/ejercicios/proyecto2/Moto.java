package ejercicios.proyecto2;

public class Moto extends Vehiculo{
    Moto(String marca,String modelo , Propietario propietario){
        super(marca,modelo,propietario);
    }

    @Override
    void arrancar(){
        IO.println("Moto de "+getPropietario().getNombre() +" Arrancando");
    }

    @Override
    void frenar(){
        IO.println("Moto de "+getPropietario().getNombre() +" "+ getMarca()+" frendando");
    }
}
