# Sistema de Inventario "Tree-Stock"

## Descripción del Proyecto
Este proyecto implementa un sistema de gestión de inventario en consola utilizando la estructura de datos de **Árbol Binario de Búsqueda (ABB)** en Java. Permite almacenar productos ordenados dinámicamente mediante nodos y punteros.

## Estructura de Clases
- **`Producto.java`**: Representa el nodo del árbol con sus atributos (`id`, `nombre`) y los punteros a los subárboles hijo izquierdo (`izq`) y derecho (`der`).
- **`ArbolInventario.java`**: Contiene la lógica recursiva para insertar productos por ID, buscar productos y realizar el recorrido *Inorden* (para listar los productos ordenados de menor a mayor ID).
- **`Main.java`**: Despliega la interfaz de usuario en consola mediante un menú interactivo (`switch-case`).

## Instrucciones de Compilación y Ejecución

1. Abrir una terminal en la carpeta raíz del proyecto.
2. Compilar los archivos `.java`:
   ```bash
   javac *.java