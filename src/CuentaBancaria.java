import java.util.*;

//7. Cuenta Bancaria

public class CuentaBancaria {


    private String titular;
    private double saldo;

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
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //metodos
    public void depositar(Scanner sc){
        System.out.print("|> Digite el monto a depositar: ");
        double monto = sc.nextDouble();
        sc.nextLine();

        saldo += monto;
    }

    public void retirar (Scanner sc){
        
        System.out.print("|> Digite el monto a retirar: ");
        double monto = sc.nextDouble();
        sc.nextLine();

        if(monto <= saldo){
            saldo -= monto;
        }
        else
            System.out.println("|> Fondos insuficientes.");
    }

    public void mostrarDatos(){
        System.out.println("|> Titular: " + getTitular());
        System.out.println("|> Saldo: " + getSaldo());
    }
}
