import java.util.Scanner;

public class ParOImpar {
    
    //2.Numero par o impar
     public static void parImpar(Scanner sc){
        
        System.out.print("|> Digite el numero a evaluar: ");
        int num = sc.nextInt();
        sc.nextLine();

        if(num % 2 == 0)
            System.out.println("|> El numero es par");
        else
            System.out.println("|> El numero es impar");
    }
}
