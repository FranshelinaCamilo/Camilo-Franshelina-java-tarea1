import java.util.*;

public class Matriz {
    private final int FILAS = 3;
    private final int COLUMNAS = 3;
    private int[][] matriz = new int[FILAS][COLUMNAS];
    

    public void mostrarMenuMatriz(Scanner sc) {
        int servicio;

        do{
            System.out.println("\n=== MENU MATRIZ 3X3 ===\n");
            
            System.out.println("0. Volver al menu principal");
            System.out.println("1. Crear y llenar la matriz");
            System.out.println("2. Sumar los elementos de la matriz");
            System.out.println("3. Mostrar la matriz transpuesta");
            System.out.println("4. Mostrar el orden de la matriz");
            System.out.println("5. Mostrar la matriz");


            System.out.print("\nSeleccione una opcion (0-5): ");
            servicio = sc.nextInt();
            sc.nextLine();

            switch (servicio) {
                case 1:
                    llenarMatriz(sc);
                    break;
                case 2:
                    sumarMatriz();
                    break;
                case 3:
                    matrizTranspuesta();
                    break;
                case 4:
                    ordenMatriz();
                    break;
                case 5:
                    mostrarMatriz();
                    break;
                case 0:
                    System.out.println("\nVolviendo al menu principal...");
                    break;
                default:
                    System.out.println("\nOpcion invalida."); 
            }
        }while(servicio != 0);
    }

    public void llenarMatriz(Scanner sc) {
        System.out.println("\nIngrese los elementos de la matriz:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void sumarMatriz() {
        int suma = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

    public void matrizTranspuesta() {
        int[][] transpuesta = new int[COLUMNAS][FILAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("\nMatriz Transpuesta:");
        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void ordenMatriz() {
        System.out.println("El orden de la matriz es: " + FILAS + "x" + COLUMNAS);
    }

    public void mostrarMatriz() {
        System.out.println("\nMatriz:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
