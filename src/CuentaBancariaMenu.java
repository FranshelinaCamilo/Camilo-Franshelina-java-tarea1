import java.util.Scanner;

public class CuentaBancariaMenu {

    static CuentaBancaria cb = null;

    //Metodo para adquirir las informaciones pertinentes e imprimirlas sobre cuentas bancarias
    public static void obtenerYMostrarDatos(Scanner sc){

        int servicio;

        do{
            System.out.println("\n====== MENU CUENTA BANCARIA =====");
            System.out.println("0. Volver al menu principal");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Ver informacion");

            System.out.print("\nSeleccione una opción: ");
            servicio = sc.nextInt();
            sc.nextLine();

            switch(servicio){
                case 1:
                    //Verifica si ya existe una cuenta
                    if(cb != null){
                        System.out.println("\nYa existe una cuenta registrada.");
                        break;
                    }

                    System.out.print("\n|> Digite el nombre del titular: ");
                    String titular = sc.nextLine();

                    System.out.print("|> Digite el saldo inicial: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();

                    cb = new CuentaBancaria(titular, saldo);

                    System.out.println("\nCuenta creada correctamente.");
                    break;
                case 2:
                    if(cb == null){
                        System.out.println("\nPrimero debe crear una cuenta.");
                    }
                    else{
                        cb.depositar(sc);
                    }
                    break;
                case 3:
                    if(cb == null){
                        System.out.println("\nPrimero debe crear una cuenta.");
                    }
                    else{
                        cb.retirar(sc);
                    }
                    break;
                case 4:
                    if(cb == null){
                        System.out.println("\nPrimero debe crear una cuenta.");
                    }
                    else{
                        cb.mostrarDatos();
                    }
                    break;
                case 0:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion invalida."); 
                }
        }while(servicio != 0);
    }
}
