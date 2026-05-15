import java.util.Scanner;

public class main{
    public static void main(String[] args){
        menu();
    }

    //Menú princpal
    public static void menu(){

        Scanner sc = new Scanner(System.in);

        int servicio;

        do{
            System.out.println("\n\n============== MENU ==============");
            System.out.println("1. Calculadora básica");
            System.out.println("2. Número par o impar");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. Contador de vocales");
            System.out.println("5. Promedio de notas");
            System.out.println("6. clase estudiante");
            System.out.println("7. Cuenta bancaria");
            System.out.println("8. Herencia de vehículos");
            System.out.println("9. Matriz 3x3");
            System.out.println("10. Sistema básico de inventario");
            System.out.println("11. Salir de la aplicación");

            System.out.print("\n|> Seleccione una opción:");
            servicio = sc.nextInt();

            switch (servicio) {
                case 1:
                    Calculadora.CalculadoraBasica();
                    sc.nextLine();
                    pause(sc);
                    break;
                case 2:
                    ParOImpar.ParImpar();
                    sc.nextLine();
                    pause(sc);
                    break;
                case 3: 
                    TablaMultiplicar.tabla();
                    sc.nextLine();
                    pause(sc);
                    break;
                case 4:
                    ContadorVocales.cantVocales();
                    sc.nextLine();
                    pause(sc);
                    break;
                case 5:
                    Promedio.promedioNotas();
                    sc.nextLine();
                    pause(sc);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
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
        System.out.printf("\nPresione una ENTER para continuar");
        sc.nextLine();
    }

}