class Fruta implements Item {
    private double precioPorKilo;
    private double peso;
    private String nombre;

    public Fruta(double precioPorKilo, double peso, String nombre) {
        this.precioPorKilo = precioPorKilo;
        this.peso = peso;
        this.nombre = nombre;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double accept(Visitor visitor) {
        // La fruta se pasa a sí misma al metodo específico del visitor
        return visitor.visit(this);
    }
}