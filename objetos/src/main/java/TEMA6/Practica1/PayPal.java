package TEMA6.Practica1;

import java.util.Scanner;

public class PayPal extends MetodoPago{
    Scanner teclado = new Scanner(System.in);
    final static private double SALDO_POR_DEFECTO = 23;

    private String cuenta;
    private double saldo;


    public PayPal(double saldo) {
        setCuenta();
        this.saldo = SALDO_POR_DEFECTO;
    }

    public void validarPaypal(){
        if (cuenta.matches("%@gmail.com")){

        }
    }

    @Override
    public void procesarPago(double importe) {

    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta() {
        System.out.println("Introduce tu cuenta con formato de correo electronico: ");
        cuenta = teclado.nextLine();
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
