import java.util.*;

public class Promedio {

    //5. Promedio de notas
    public static void promedioNotas(){

        int cantNotas, sumaNotas = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("|> Digite la cantidad de notas a promediar: ");
        cantNotas = sc.nextInt();
        System.out.println();

        for(int i = 0; i < cantNotas; i++){
            System.out.print("|> Digite la nota numero " + (i + 1) + ": ");
            sumaNotas += sc.nextDouble();
        }

        System.out.println("|> El promedio es: " + ((double)sumaNotas/cantNotas));
    }
}
