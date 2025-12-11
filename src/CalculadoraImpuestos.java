class CalculadoraImpuestos implements Visitor {

    // Lógica para Libros: Sin impuestos
    @Override
    public double visit(Libro libro) {
        System.out.println("Calculando impuesto para libro (exento)...");
        return libro.getPrecio();
    }

    // Lógica para Fruta: Con 10% de impuestos
    @Override
    public double visit(Fruta fruta) {
        System.out.println("Calculando impuesto para " + fruta.getClass().getSimpleName() + "...");
        double costo = fruta.getPrecioPorKilo() * fruta.getPeso();
        return costo * 1.10; // Añadimos 10%
    }
}