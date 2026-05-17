import java.util.*;

public class Promedio {

    //5. Promedio de notas
    public static void promedioNotas(Scanner sc){

        int cantNotas;
        double sumaNotas = 0.0;

        System.out.print("|> Digite la cantidad de notas a promediar: ");
        cantNotas = sc.nextInt();
        sc.nextLine();

        if(cantNotas <= 0){
            System.out.println("|> Cantidad de notas invalida.");
            return;
        }

        System.out.println();

        for(int i = 0; i < cantNotas; i++){
            System.out.print("|> Digite la nota numero " + (i + 1) + ": ");
            sumaNotas += sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\n|> El promedio es: " + (sumaNotas/cantNotas));
    }
}
