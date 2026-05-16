import java.util.*;

public class matriz {
    private int filas = 3;
    private int columnas = 3;
    private int[][] matriz = new int [filas][columnas];

    Scanner sc = new Scanner(System.in);

    public void mostrarMenuMatriz() {
        System.out.println("\n--- Operaciones con Matrices ---");
        System.out.println("1. crear y llenar la matriz");
        System.out.println("2. Sumar los elementos de la matriz");
        System.out.println("3. Mostrar la matriz transpuesta");
        System.out.println("4. Calcular la cardinalidad de la matriz");
        System.out.println("5. Mostrar la matriz");

        int servicio;

        System.out.print("Seleccione una opcion (1-5): ");
        servicio = sc.nextInt();

        switch (servicio) {
            case 1:
                llenarMatriz();
                break;
            case 2:
                sumarMatriz();
                break;
            case 3:
                matrizTranspuesta();
                break;
            case 4:
                cardinalidadMatriz();
                break;
            case 5:
                mostrarMatriz();
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }

    public void llenarMatriz() {
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void sumarMatriz() {
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

    public void matrizTranspuesta() {
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void cardinalidadMatriz() {
        System.out.println("La cardinalidad de la matriz es: " + (filas * columnas));
    }

    public void mostrarMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }



}
