import java.util.Scanner;

public class ContadorVocales {
    
    //4. Contador de vocales
    public static void cantVocales(Scanner sc){

        System.out.print("|> Digite una palabra o frase: ");
        String cad = sc.nextLine().toLowerCase();

        int contador = 0;

        for(int i = 0; i < cad.length(); i++){
            char c = cad.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            }
        }
        System.out.println("|> Cantidad de vocales: " + contador);
    }   
}
