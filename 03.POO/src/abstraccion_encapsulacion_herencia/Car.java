package abstraccion_encapsulacion_herencia;

public class Car extends Vehicle{
    private int doors;

    public Car(String model, Integer year, String brand, int doors) {
        super(model, year, brand);
        this.doors = doors;
    }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
