package ejercicios.proyecto;

import ejercicios.proyecto.tiposPagos.PagoEfectivo;
import ejercicios.proyecto.tiposPagos.PagoTargeta;

public class Main {
    static void main(String[] args) {
        Cliente c1 = new Cliente("edgar");
        Pago cash = new PagoEfectivo(0,c1);
        Pago tarjeta = new PagoTargeta(2000,c1);

        ProcesadorPago pp = new ProcesadorPago();

        pp.ejecutar(cash);
        pp.ejecutar(tarjeta);
    }
}
