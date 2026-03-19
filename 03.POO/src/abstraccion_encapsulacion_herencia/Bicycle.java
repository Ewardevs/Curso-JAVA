package abstraccion_encapsulacion_herencia;

public class Bicycle extends Vehicle{
    private boolean hasBell;

    public Bicycle(String model, Integer year, String brand, boolean hasBell) {
        super(model, year, brand);
        this.hasBell = hasBell;
    }
}
