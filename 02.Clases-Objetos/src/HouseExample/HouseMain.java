package HouseExample;

public class HouseMain {
    static void main(String[] args) {
        House myHouse = new House();
        myHouse.setDoors(2);
        myHouse.setWindows(4);
        myHouse.setSize(18);

        House myHouse2 = new House(2,4,11);

        IO.println("La cantidad de puertas de la casa 1 es: "+myHouse.getDoors() );
        IO.println("La cantidad de puertas de la casa 2 es: "+myHouse2.getDoors() );

        double area1 = myHouse.calculateArea();
        double area2 = myHouse2.calculateArea();

        IO.println("el area de la casa 1 es de :"+area1);
        IO.println("el area de la casa 2 es de :"+area2);

    }

}
