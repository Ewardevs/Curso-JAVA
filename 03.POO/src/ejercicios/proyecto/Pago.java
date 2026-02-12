package ejercicios.proyecto;

public abstract class Pago {
    protected double monto;
    protected Cliente cliente;

    public Pago(double monto,Cliente cliente) {
        if (monto<0){
            throw new IllegalArgumentException("el monto no puede ser negativo");
        }
        this.monto = monto;
        this.cliente = cliente;
    }

    public abstract void procesarPago();
}
