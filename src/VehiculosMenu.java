import java.util.ArrayList;
import java.util.Scanner;

public class VehiculosMenu {

    static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    //Metodo para adquirir las informaciones pertinentes e imprimirlas sobre la herencia de vehículos
    public static void obtenerYMostrarDatos(Scanner sc){

        int servicio;

        do{

            System.out.println("\n====== MENU HERENCIA DE VEHÍCULOS =====");
            System.out.println("0. Volver al menu principal");
            System.out.println("1. Carro");
            System.out.println("2. Motocicleta");
            System.out.println("3. Autobús");
            System.out.println("4. Mostrar vehículos registrados");

            System.out.print("\n¿Qué desea hacer?: ");
            servicio = sc.nextInt();
            sc.nextLine();

            switch(servicio){
                case 1:
                    System.out.print("\n|> Digite la marca del carro: ");
                    String marcaCarro = sc.nextLine();

                    System.out.print("|> Digite el modelo del carro: ");
                    String modeloCarro = sc.nextLine();

                    System.out.print("|> Digite el año del carro: ");
                    int añoCarro = sc.nextInt();
                    sc.nextLine();

                    System.out.print("|> Digite el número de puertas del carro: ");
                    int puertasCarro = sc.nextInt();
                    sc.nextLine();

                    System.out.print("|> Digite el tipo de combustible del carro: ");
                    String combustibleCarro = sc.nextLine();

                    Carro carro = new Carro(marcaCarro, modeloCarro, añoCarro, puertasCarro, combustibleCarro);

                    vehiculos.add(carro);
                    break;
                case 2:
                    System.out.print("\n|> Digite la marca de la motocicleta: ");
                    String marcaMoto = sc.nextLine();

                    System.out.print("|> Digite el modelo de la motocicleta: ");
                    String modeloMoto = sc.nextLine();

                    System.out.print("|> Digite el año de la motocicleta: ");
                    int añoMoto = sc.nextInt();

                    sc.nextLine();
                    System.out.print("|> Digite la cilindrada de la motocicleta: ");
                    String cilindradaMoto = sc.nextLine();

                    System.out.print("|> La motocicleta es deportiva? (true/false): ");
                    boolean deportivaMoto = sc.nextBoolean();
                    sc.nextLine();

                    Motocicleta moto = new Motocicleta(marcaMoto, modeloMoto, añoMoto, cilindradaMoto, deportivaMoto);
                    
                    vehiculos.add(moto);
                    break;
                case 3:
                    System.out.print("\n|> Digite la marca del autobús: ");
                    String marcaBus = sc.nextLine();

                    System.out.print("|> Digite el modelo del autobús: ");
                    String modeloBus = sc.nextLine();

                    System.out.print("|> Digite el año del autobús: ");
                    int añoBus = sc.nextInt();
                    sc.nextLine();

                    System.out.print("|> Digite la capacidad de pasajeros del autobús: ");
                    int capacidadBus = sc.nextInt();
                    sc.nextLine();

                    System.out.print("|> El autobús tiene baño? (true/false): ");
                    boolean bañoBus = sc.nextBoolean();
                    sc.nextLine();

                    System.out.print("|> Digite el tipo de aire acondicionado del autobús: ");
                    String aireBus = sc.nextLine();

                    Autobus bus = new Autobus(marcaBus, modeloBus, añoBus, capacidadBus, bañoBus, aireBus);

                    vehiculos.add(bus);
                    break;
                case 4:
                    if(vehiculos.isEmpty()){
                        System.out.println("\nNo hay vehículos registrados.");
                    }
                    else{
                        System.out.println("\n=========================================");
                        System.out.println("         Vehículos registrados");
                        System.out.println("=========================================");
                        for(Vehiculo vehiculo: vehiculos){
                            vehiculo.mostrarDatos();
                            System.out.println("-----------------------------------------");
                        }
                    }
                    break;
                case 0:
                    System.out.println("\nVolviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opcion invalida."); 
            }
        }while(servicio != 0);
    }
}
