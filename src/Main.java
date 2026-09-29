// Punto de entrada del programa
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Vendedor("Brayan", 1500.00);

        // Se mantiene la estrategia estándar (sin cambios)
        System.out.println("=== Reporte de comisión ===");
        empleado.mostrarDetalle();
    }
}
