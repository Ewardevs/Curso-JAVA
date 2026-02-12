package abstraccion_encapsulacion_herencia;

public class Vehicle {
    private String brand;
    private String model;
    private Integer year;

    public Vehicle(String model, Integer year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    public  void start(){
        IO.println("Encendido");
    }

    public void stop(){
        IO.println("parado");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        Integer currentYear = java.time.Year.now().getValue();
        if (year<1886 || year>currentYear+2) {
            throw new IllegalArgumentException("Año invalido!!!");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
