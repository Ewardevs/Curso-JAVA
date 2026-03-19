package abstraccion_encapsulacion_herencia;

public class Car extends Vehicle{
    private int doors;
    private Engine engine;

    public Car(String model, Integer year, String brand, int doors) {
        super(model, year, brand);
        this.engine = new Engine();
        this.doors = doors;
    }

    public void start(){
        this.engine.start();
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                '}'+ super.toString();
    }
}
