package ejercicios.proyecto3.TranspotesTypes;

import ejercicios.proyecto3.Transporte;

public class Aereo extends Transporte {
    public Aereo(int capacidad,int velocidad,String nombre){
        super(capacidad,velocidad,nombre);
    }

    @Override
    public void arrancar(){
        IO.println("Transporte aereo encendido");
    }

    @Override
    public void parar(){
        IO.println("Transporte aereo Detenido");
    }

    @Override
    public void verVelocidad() {
        IO.println("la velocidad maxima de este vehiculo es "+getVelocidad());
    }
}
