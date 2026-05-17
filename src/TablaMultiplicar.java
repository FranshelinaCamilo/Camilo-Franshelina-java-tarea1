import java.util.Scanner;

public class TablaMultiplicar {

    //3. Tabla de multiplicar (imprime la tabla del multiplicar de un numero hasta el 12)
    public static void tabla(Scanner sc){
        
        System.out.print("|> Digite el numero: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println();

        System.out.printf("\n===== TABLA DE MULTIPLICAR DEL %d =====\n", num);
        for(int i = 1; i <= 12; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
