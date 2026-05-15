import java.util.Scanner;

public class TablaMultiplicar {

    public static void tabla(){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("|> Digite el numero: ");
        int num = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= 12; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
