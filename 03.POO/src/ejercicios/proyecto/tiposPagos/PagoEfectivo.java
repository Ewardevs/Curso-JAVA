package ejercicios.proyecto.tiposPagos;

import ejercicios.proyecto.Cliente;
import ejercicios.proyecto.Pago;

public class PagoEfectivo extends Pago {

    public PagoEfectivo(double monto, Cliente cliente) {
        super(monto,cliente);
    }

    @Override
    public void procesarPago() {
        IO.println("cliente "+cliente.getNombre()+" Pago en efectivo "+monto);
    }
}
