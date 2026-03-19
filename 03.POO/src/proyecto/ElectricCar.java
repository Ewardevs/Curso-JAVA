package proyecto;

public class ElectricCar extends Vehicle implements Electric{
    private int bateryLevel;

    public ElectricCar(String brand, String model, int year, int bateryLevel) {
        super(brand, model, year);
        this.bateryLevel = bateryLevel;
    }

    @Override
    public void start() {
        IO.println("el auto electrico arranco");
    }

    @Override
    public void chargeBatery() {
        bateryLevel = 100;
        IO.println("Bateria cargada");
    }

    @Override
    public String toString() {
        return super.toString()+" Batery "+ bateryLevel;
    }
}
