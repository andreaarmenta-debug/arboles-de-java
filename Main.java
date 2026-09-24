import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolInventario inventario = new ArbolInventario();
        int opcion = -1;

        do {
            System.out.println("\n=================================");
            System.out.println("   SISTEMA DE INVENTARIO TREE-STOCK");
            System.out.println("=================================");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Buscar Producto por ID");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el ID del producto (numero): ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = sc.nextLine();
                        inventario.insertar(id, nombre);
                        System.out.println("-> Producto registrado con exito.");
                        break;

                    case 2:
                        inventario.mostrarInorden();
                        break;

                    case 3:
                        System.out.print("Ingrese el ID a buscar: ");
                        int idBuscar = Integer.parseInt(sc.nextLine());
                        if (inventario.buscar(idBuscar)) {
                            System.out.println("-> El producto con ID " + idBuscar + " SI existe.");
                        } else {
                            System.out.println("-> El producto con ID " + idBuscar + " NO existe.");
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no valida. Intente de nuevo.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un numero entero valido.");
            }

        } while (opcion != 0);

        sc.close();
    }
}