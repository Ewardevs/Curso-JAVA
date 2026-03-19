package Inmutabilidad;

import abstraccion_encapsulacion_herencia.Car;
import abstraccion_encapsulacion_herencia.Motorcyrcle;
import abstraccion_encapsulacion_herencia.Vehicle;

import java.util.Date;

public class Main {
    static void main(String[] args) {
        Vehicle myCar = new Car("si",2000,"ASD",2);
        Vehicle moto = new Motorcyrcle("ASDAF",2001,"ASDF",true);

        ((Car)myCar).start();
        ((Motorcyrcle)moto).start();

        printVehicle(myCar);
    }

    public static void printVehicle(Vehicle vehicle){
        IO.println(vehicle.toString());
    }
}
