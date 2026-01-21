package constantes;

public class PracticaConstante {
    static void main(String[] args) {
        final double TAX_RATE = 0.10;
        int salary = 3000;
        double netSalary = salary * (1-TAX_RATE);

        IO.println("netSalary = "+ netSalary);
    }
}
