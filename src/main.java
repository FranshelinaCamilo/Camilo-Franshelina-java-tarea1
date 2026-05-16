import java.util.*;

public class main{

    //Se colocan fuera del metodo para que se mantenga la informacion 
    static matriz mat = new matriz();
    static CuentaBancaria cb = null;
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
            System.out.println("6. clase estudiante");
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
                    Calculadora.CalculadoraBasica();
                    pause(sc);
                    break;
                case 2:
                    ParOImpar.ParImpar();
                    pause(sc);
                    break;
                case 3: 
                    TablaMultiplicar.tabla();
                    pause(sc);
                    break;
                case 4:
                    ContadorVocales.cantVocales();
                    pause(sc);
                    break;
                case 5:
                    Promedio.promedioNotas();
                    sc.nextLine();
                    pause(sc);
                    break;
                case 6:
                    preguntarDatosEstudiantes(sc);
                    pause(sc);
                    break;
                case 7:
                    DatosCuentaBancaria(sc);
                    pause(sc);
                    break;
                case 8:
                    DatosHerenciaVehiculo(sc);
                    pause(sc);
                    break;
                case 9:
                    mat.mostrarMenuMatriz(); 
                    pause(sc);
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

    //Metodo para adquirir las informaciones pertinentes de los estudiantes e imprimirlos
    public static void preguntarDatosEstudiantes(Scanner sc){

        System.out.println("¿Cuantos estudiantes desea registrar?");
        int cantEstudiantes = sc.nextInt();

        //ArrayList de estudiantes para guardar su informacion
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>(cantEstudiantes);

        //Ciclo para registrar varios estudiantes
        sc.nextLine();
        for(int i = 0; i < cantEstudiantes; i++){

            System.out.print("|> Nombre del estudiante: ");
            String nombre = sc.nextLine();

            System.out.print("|> Matricula del estudiante: ");
            String matricula = sc.nextLine();

            System.out.print("|> Carrera del estudiante: ");
            String carrera = sc.nextLine();

            System.out.print("|> Semestre del estudiante: ");
            String semestre = sc.nextLine();

            System.out.println();

            Estudiante est = new Estudiante(nombre, matricula, carrera, semestre);
            estudiantes.add(est);
        }

        //Imprime los datos alamcenados de los estudiantes 
        System.out.println("\n=========================================");
        System.out.println("         Estudiantes registrados");
        System.out.println("=========================================");
        for(Estudiante estudiante: estudiantes){
            System.out.println("Nombre: " + estudiante.getNombre()
                                + "\nMatricula: " + estudiante.getMatricula()
                                + "\nCarrera: " + estudiante.getCarrera()
                                + "\nSemestre: " + estudiante.getSemestre());
            System.out.println("-----------------------------------------");
        }
    }

    //Metodo para adquirir las informaciones pertinentes e imprimirlas sobre cuentas bancarias
    public static void DatosCuentaBancaria(Scanner sc){

        int servicio;

        System.out.println("\n====== MENU CUENTA BANCARIA =====");
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
                    cb.depositar();
                }
                break;
            case 3:
                if(cb == null){
                    System.out.println("\nPrimero debe crear una cuenta.");
                }
                else{
                    cb.retirar();
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
            default:
                System.out.println("\nOpción inválida.");
        }
    }

    //Se coloca fuera del metodo para que se mantenga la informacion de los vehículos registrados
    static ArrayList<Vehiculos> vehiculos = new ArrayList<Vehiculos>();

    //Metodo para adquirir las informaciones pertinentes e imprimirlas sobre la herencia de vehículos
    public static void DatosHerenciaVehiculo(Scanner sc){

        
        int servicio;

        System.out.println("\n====== MENU HERENCIA DE VEHÍCULOS =====");
        System.out.println("1. Carro");
        System.out.println("2. Motocicleta");
        System.out.println("3. Autobús");
        System.out.println("4. Mostrar vehículos registrados");

        System.out.print("\n¿Qué tipo de vehículo desea registrar?: ");
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

                System.out.println("\nDatos del carro registrado:");
                carro.mostrarDatos();
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

                System.out.println("\nDatos de la motocicleta registrada:");
                moto.mostrarDatos();
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

                System.out.println("\nDatos del autobús registrado:");
                bus.mostrarDatos();
                break;
            case 4:
                if(vehiculos.isEmpty()){
                    System.out.println("\nNo hay vehículos registrados.");
                }
                else{
                    System.out.println("\n=========================================");
                    System.out.println("         Vehículos registrados");
                    System.out.println("=========================================");
                    for(Vehiculos vehiculo: vehiculos){
                        vehiculo.mostrarDatos();
                        System.out.println("-----------------------------------------");
                    }
                }
                break;
            default:
                System.out.println("\nOpción inválida.");
        }
    }
}
