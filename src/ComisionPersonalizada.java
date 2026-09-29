// Comisión personalizada: (5 + N)% de la venta, N = letras de "Brayan"
public class ComisionPersonalizada implements EstrategiaComision {
    private static final int N = "Brayan".length();
    private static final double PORCENTAJE = 5.0 + N;

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * PORCENTAJE / 100;
    }
}
