public class Producto {
    // Datos del producto
    int id;
    String nombre;

    // Punteros al subárbol izquierdo y derecho
    Producto izq;
    Producto der;

    // Constructor del nodo
    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.izq = null;
        this.der = null;
    }
}