// Interfaz Visitor: Define qué puede visitar
interface Visitor {
    double visit(Libro libro);
    double visit(Fruta fruta);
}