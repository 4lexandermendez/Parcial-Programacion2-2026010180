// Vendedor: usa la comisión estándar por defecto
public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    @Override
    public void mostrarDetalle() {
        // Llamada polimórfica a la estrategia actual
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("Empleado: " + nombre);
        System.out.printf("Venta total: $%.2f%n", ventasMes);
        System.out.println("Estrategia: " + estrategia.getClass().getSimpleName());
        System.out.printf("Comisión: $%.2f%n", comision);
    }
}
