class Libro implements Item {
    private double precio;
    private String isbn;

    public Libro(double precio, String isbn) {
        this.precio = precio;
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double accept(Visitor visitor) {
        // El libro se pasa a sí mismo al metodo específico del visitor
        return visitor.visit(this);
    }
}