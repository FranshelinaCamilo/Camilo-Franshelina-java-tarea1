import java.util.Scanner;

public class Calculadora {

    //1. Calculadora basica    
    public static void calculadoraBasica(Scanner sc){

        int servicio;
        double num1, num2;

        do{

            System.out.println("\n====== CALCULADORA =====");
            System.out.println("0. Volver al menu principal");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            System.out.print("\nSeleccione una opción: ");
            servicio = sc.nextInt();
            sc.nextLine();

            //Verificacion de servicio seleccionado 
            if(servicio > 0 && servicio < 5 ){

                System.out.print("\n|> Digite el primer numero: ");
                num1 = sc.nextDouble();

                System.out.print("|> Digite el segundo numero: ");
                num2 = sc.nextDouble();

                switch(servicio){

                    case 1:
                        System.out.println("|> Resultado: " + suma(num1, num2));
                        break;

                    case 2:
                        System.out.println("|> Resultado: " + resta(num1, num2));
                        break;

                    case 3:
                        System.out.println("|> Resultado: " + multiplicacion(num1, num2));
                        break;

                    case 4:
                        System.out.println("|> Resultado: " + division(num1, num2));
                        break;
                }
            }
            else if(servicio == 0){

                System.out.println("Volviendo al menu principal...");
            }
            else{

                System.out.println("Opcion invalida.");
            }

        }while(servicio != 0);
    }

    //Métodos matemáticos
    public static double suma(double num1, double num2){
        return num1 + num2;
    }

    public static double resta(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2){
        return num1 * num2;
    }
    public static double division(double num1, double num2){
        
        //Validación para evitar divsión entre cero
        if(num2 == 0){
            System.out.println("\nDivision invalida.");
            return 0;
        }
        return num1/num2;
    }
}
