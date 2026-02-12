package ejercicios.proyecto2;

public class Main {
    static void main(String[] args) {
        Propietario p1 = new Propietario("edgar");
        Propietario p2 = new Propietario("hadasa");

        Vehiculo auto = new Auto("ferrari","sugija",p1);
        Vehiculo moto = new Moto("supra","aña",p1);

        Vehiculo moto2 = new Moto("cachina","yula",p2);

        Taller taller = new Taller();
        taller.probarVehiculo(auto);
        taller.probarVehiculo(moto);
        taller.probarVehiculo(moto2);
    }

}
