package ejercicios.proyecto.tiposPagos;

import ejercicios.proyecto.Cliente;
import ejercicios.proyecto.Pago;

public class PagoTargeta extends Pago {

    public PagoTargeta(double monto, Cliente cliente) {
        super(monto,cliente);
    }

    @Override
    public void procesarPago() {
        IO.println("cliente "+cliente.getNombre()+ " Pago contarjeta "+ monto);
    }
}
