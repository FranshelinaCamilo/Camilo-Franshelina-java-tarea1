import java.util.*;

public class Main{

    //Se colocan fuera del metodo para que se mantenga la informacion 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        menu();
    }

    //Menú princpal
    public static void menu(){


        int servicio;

        do{
            System.out.println("\n\n============== MENU ==============");
            System.out.println("1. Calculadora básica");
            System.out.println("2. Número par o impar");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. Contador de vocales");
            System.out.println("5. Promedio de notas");
            System.out.println("6. Clase estudiante");
            System.out.println("7. Cuenta bancaria");
            System.out.println("8. Herencia de vehículos");
            System.out.println("9. Matriz 3x3");
            System.out.println("10. Sistema básico de inventario");
            System.out.println("11. Salir de la aplicación");

            System.out.print("\n|> Seleccione una opción: ");
            servicio = sc.nextInt();
            sc.nextLine();

            switch (servicio) {
                case 1:
                    Calculadora.calculadoraBasica(sc);
                    break;
                case 2:
                    ParOImpar.parImpar(sc);
                    pause(sc);
                    break;
                case 3: 
                    TablaMultiplicar.tabla(sc);
                    pause(sc);
                    break;
                case 4:
                    ContadorVocales.cantVocales(sc);
                    pause(sc);
                    break;
                case 5:
                    Promedio.promedioNotas(sc);
                    pause(sc);
                    break;
                case 6:
                    EstudianteMenu.registrarEstudiantes(sc);
                    pause(sc);
                    break;
                case 7:
                    CuentaBancariaMenu.obtenerYMostrarDatos(sc);
                    break;
                case 8:
                    VehiculosMenu.obtenerYMostrarDatos(sc);
                    break;
                case 9:
                    Matriz mat = new Matriz();
                    mat.mostrarMenuMatriz(sc); 
                    break;
                case 10:
                    Producto.menuInventario(sc);
                    break;
                case 11:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
            
        }while(servicio != 11);
    }

    //Metodo que simula una pausa en consola
    public static void pause(Scanner sc){
        System.out.print("\nPresione ENTER para continuar");
        sc.nextLine();
    }
}
