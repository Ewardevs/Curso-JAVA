package proyecto;

import java.util.Scanner;

public class proyecto {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repeat;

        do{
            IO.println("Ingrese la edad : ");
            int age = scanner.nextInt();

            IO.println("Ingrese 3 calificaciones");
            int grade1 = scanner.nextInt();
            int grade2 = scanner.nextInt();
            int grade3 = scanner.nextInt();

            int sum = grade1+grade2+grade3;
            double average = sum/3.0;

            if(average>=6){
                IO.println("Aprobado");
            }else{
                IO.println("Desaprobado");
            }

            IO.println("¿Quiere continuar? Ingrese 1 para si y 0 para no");
            int option = scanner.nextInt();
            repeat = option==1;
        }while(repeat);

        IO.println("Programa finalizado");
        scanner.close();
    }
}
