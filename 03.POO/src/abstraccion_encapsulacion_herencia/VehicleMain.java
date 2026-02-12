package abstraccion_encapsulacion_herencia;

class VehicleMain {
    static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Fiat",2000,"Duna");

        Motorcyrcle car = new Motorcyrcle("leopard",2001,"tokio",true);

        IO.println(car.toString());

        //vehicle.setYear(2001);
        //IO.println(vehicle.toString());
    }
}