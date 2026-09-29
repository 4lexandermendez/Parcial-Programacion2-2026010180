// Punto de entrada del programa
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Vendedor("Brayan", 1500.00);

        // Se cambia a la estrategia personalizada
        empleado.cambiarEstrategia(new ComisionPersonalizada());
        empleado.mostrarDetalle();
    }
}
