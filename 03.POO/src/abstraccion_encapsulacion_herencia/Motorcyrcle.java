package abstraccion_encapsulacion_herencia;

public class Motorcyrcle extends Vehicle {
    private boolean hasSideCar;

    public Motorcyrcle(String model, Integer year, String brand, boolean hasSideCar) {
        super(model, year, brand);
        this.hasSideCar = hasSideCar;
    }

    public void hacerweelee(){
        IO.println("esta en una sola rueda");
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public String toString() {
        return "Motorcyrcle{" +
                "hasSideCar=" + hasSideCar +
                '}' + super.toString();
    }
}
