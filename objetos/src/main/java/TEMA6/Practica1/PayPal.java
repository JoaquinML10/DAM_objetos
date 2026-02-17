package TEMA6.Practica1;

import java.util.Scanner;

public class PayPal extends MetodoPago{
    Scanner teclado = new Scanner(System.in);
    final static private double SALDO_POR_DEFECTO = 23;

    private String cuenta;
    private double saldo;


    public PayPal() {
        setCuenta();
        this.saldo = SALDO_POR_DEFECTO;
    }


    /**
     * Valida los datos que le pasamos de la cuenta de paypal
     *
     * Comprueba que
     * El correo tenga el formato que se le pide
     * Y que el saldo sea suficiente para pagar
     *
     *
     * @return true si los datos son correctos y false si hay algun error error
     */
    public boolean validarPaypal(double importe){
        boolean validar = true;
        System.out.println("Validando PayPal...");
        if (!cuenta.matches("[A-Za-z0-9._%+-]+@gmail.com")){
            System.out.println("Formato de correo incorrecto");
            validar = false;
        }
        if (importe > saldo){
            System.out.println("No tienes saldo suficiente");
            validar = false;
        }
        return validar;
    }


    /**
     * Procesa el pago con PayPal
     * Muestra un mensaje si el pago
     * se ha realizado correctamente
     *
     * @param importe la plata que va a pagar el usuario
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con PayPal");
        System.out.println("Pago aceptado. Muchas gracias.");
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
