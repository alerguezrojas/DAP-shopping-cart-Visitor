import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Crear los productos
        List<Item> carrito = new ArrayList<>();
        carrito.add(new Libro(20.0, "12345"));
        carrito.add(new Fruta(3.0, 2.0, "Plátanos")); // 3 * 2 = 6 base

        // 2. Crear al visitante (la lógica)
        Visitor taxCalculator = new CalculadoraImpuestos();

        double total = 0;

        // 3. Iterar y visitar
        for (Item item : carrito) {
            // Aquí ocurre la magia. No necesitamos saber si es Fruta o Libro.
            // El metodo accept se encarga de dirigirlo.
            total += item.accept(taxCalculator);
        }

        System.out.println("-----------------------------");
        System.out.println("Precio total con impuestos: " + total);
    }
}