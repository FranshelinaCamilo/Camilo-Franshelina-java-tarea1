import java.util.*;

//7. Cuenta Bancaria

public class CuentaBancaria {

    Scanner sc = new Scanner(System.in);

    private String Titular;
    private double Saldo;

    //Constructor
    public CuentaBancaria(String titular, double saldoInicial){
        setSaldo(saldoInicial);
        setTitular(titular);
    }

    public CuentaBancaria(){
        setTitular("");
        setSaldo(0);
    }

    //getters y setters
    public String getTitular(){
        return Titular;
    }

    public double getSaldo(){
        return Saldo;
    }

    public void setTitular(String titular){
        this.Titular = titular;
    }

    public void setSaldo(double saldo){
        this.Saldo = saldo;
    }

    //metodos
    public void depositar(){
        System.out.print("Digite el monto a depositar: ");
        double monto = sc.nextDouble();
        Saldo += monto;
    }

    public void retirar (){
        
        System.out.print("Digite el monto a depositar: ");
        double monto = sc.nextDouble();

        if(monto <= Saldo){
            Saldo -= monto;
        }
        else
            System.out.println("Fondos insuficientes.");
    }

    public void mostrarDatos(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }
}
