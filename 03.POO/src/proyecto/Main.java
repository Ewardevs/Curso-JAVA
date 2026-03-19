package proyecto;

public class Main {
    static void main(String[] args) {
        Vehicle mycar = new Car("fier","asdf",2005,CarType.TRUCK);
        Vehicle electric = new ElectricCar("amazon","asdf",2020,0);

        IO.println(mycar.toString());
        IO.println(electric.toString());

        ((ElectricCar)electric).chargeBatery();

        IO.println(electric.toString());
    }
}
