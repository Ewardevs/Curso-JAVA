package interfaces;



public class ElectricCar extends Vehicle implements Electric,SelfDriving{
    private int batteryLevel;

    public ElectricCar(String brand, String model, Integer year, Color color, VehicleStatus vehicleStatus, int batteryLevel) {
        super(brand, model, year, color, vehicleStatus);
        this.batteryLevel = batteryLevel;
    }

    public ElectricCar(String model, Integer year, String brand, int batteryLevel) {
        super(model, year, brand);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void chargeBattery() {
        batteryLevel = MAX_BATTERY_CAPACITY;
        IO.println("la bateria se cargo");
    }

    @Override
    public void activateAutopilot() {
        IO.println("automatico activado");
    }

    @Override
    public void drive(){
        IO.println("se esta manejando");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}'+super.toString();
    }
}
