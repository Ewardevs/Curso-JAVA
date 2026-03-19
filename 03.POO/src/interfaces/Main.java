package interfaces;

public class Main {
    static void main(String[] args) {
        Vehicle electric = new ElectricCar("FIAT","DUNA",2025,Color.RED,VehicleStatus.AVAILABLE,80);

        IO.println(electric.toString());
    }
}
