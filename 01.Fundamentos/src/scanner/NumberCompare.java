package scanner;

import java.util.Scanner;

public class NumberCompare {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IO.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();

        IO.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        int suma = num1+num2;

        IO.println("La suma es "+suma);

        IO.println("Fin de la aplicacion");
        scanner.close();
    }
}
