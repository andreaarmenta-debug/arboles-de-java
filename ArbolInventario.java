public class ArbolInventario {
    Producto raiz;

    public ArbolInventario() {
        raiz = null;
    }

    // Método para insertar un producto (recursivo)
    public void insertar(int id, String nombre) {
        raiz = agregarRecursivo(raiz, id, nombre);
    }

    private Producto agregarRecursivo(Producto aux, int id, String nombre) {
        if (aux == null) {
            return new Producto(id, nombre);
        }

        if (id < aux.id) {
            aux.izq = agregarRecursivo(aux.izq, id, nombre);
        } else if (id > aux.id) {
            aux.der = agregarRecursivo(aux.der, id, nombre);
        } else {
            System.out.println("-> Error: El ID " + id + " ya existe en el inventario.");
        }

        return aux;
    }

    // Recorrido Inorden para listar el inventario ordenado por ID
    public void mostrarInorden() {
        if (raiz == null) {
            System.out.println("-> El inventario esta vacio.");
        } else {
            System.out.println("\n=== INVENTARIO DE PRODUCTOS (ORDENADO POR ID) ===");
            inorden(raiz);
        }
    }

    private void inorden(Producto aux) {
        if (aux != null) {
            inorden(aux.izq);
            System.out.println("ID: " + aux.id + " | Nombre: " + aux.nombre);
            inorden(aux.der);
        }
    }

    // Método para buscar un producto por ID
    public boolean buscar(int id) {
        return buscarID(raiz, id);
    }

    private boolean buscarID(Producto aux, int id) {
        if (aux == null) {
            return false;
        }

        if (id == aux.id) {
            return true;
        }

        if (id < aux.id) {
            return buscarID(aux.izq, id);
        } else {
            return buscarID(aux.der, id);
        }
    }
}