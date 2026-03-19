package ejercicios.proyecto3.TranspotesTypes;

import ejercicios.proyecto3.Transporte;

public class Terrestre extends Transporte {

    public Terrestre(int capacidad,int velocidad ,String nombre){
        super(capacidad,velocidad,nombre);
    }

    @Override
    public void arrancar(){
        IO.println("Arrancando Transporte terrrestre");
    }

    @Override
    public void parar(){
        IO.println("Parando Transporte terrestre");
    }

    @Override
    public void verVelocidad(){
        IO.println("la velocidad maxima de este vehiculo es "+getVelocidad());
    }
}
