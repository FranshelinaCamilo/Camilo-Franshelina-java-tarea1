import java.util.*;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    private static ArrayList<Producto> productos = new ArrayList<>();

    // Constructores
    public Producto(String nombre, double precio, int cantidad) {
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
    }

    public Producto() {
        setNombre("");
        setPrecio(0.0);
        setCantidad(0);
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularValorTotal() {
        return precio * cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Valor Total: $" + calcularValorTotal());
    }

    public static void menuInventario(Scanner sc) {

        int opcion;

        do {
            System.out.println("\n=== MENU DE INVENTARIO ===");
            System.out.println("0. Volver al menú principal");
            System.out.println("1. Agregar producto al inventario");
            System.out.println("2. Ver productos en el inventario");

            System.out.print("\n|> Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto(sc);
                    break;
                case 2:
                    mostrarInventario();
                    break;
                case 0:
                    System.out.println("\nVolviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void agregarProducto(Scanner sc) {

        System.out.print("\nNombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Cantidad del producto: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Producto producto = new Producto(nombre, precio, cantidad);
        productos.add(producto);
        System.out.println("\nProducto agregado correctamente.");
    }

    public static void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("\nEl inventario está vacío.");
        } else {
            System.out.println("\n======================");
            System.out.println("    INVENTARIO ACTUAL");
            System.out.println("======================");
            for (Producto producto : productos) {
                producto.mostrarInformacion();
                System.out.println("-----------------------");
            }
        }
    }
}
