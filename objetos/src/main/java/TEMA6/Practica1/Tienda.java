package TEMA6.Practica1;

import java.util.Scanner;

public class Tienda {
    static Scanner teclado = new Scanner(System.in);

    /**
     * Pide el importe al usuario y hace el pago
     * al metodo que seleccionamos
     *
     * @param metodo de pago qye eligio el usuario
     */
    static void realizarPago(MetodoPago metodo){
        System.out.println("Introduce el importe a pagar: ");
        double importe = teclado.nextDouble();
        metodo.procesarPago(importe);
    }

    /**
     * Es el proceso inicial que se inicia en el main
     *
     * Pregunta al usuario qué método que va utilizar,
     * Si todo esta bien va llama al metodo realizar pago
     */
    static void iniciarPago(){
        System.out.println("Que metodo de pago quieres usar? [Bizum, Paypal, Tarjeta]");

        String metodo = teclado.nextLine();

        switch (metodo.toUpperCase()){
            case "BIZUM":
                Bizum bizum = new Bizum();
                if (bizum.validarBizum()) {
                    realizarPago(bizum);
                }
                break;
            case "PAYPAL":
                PayPal payPal = new PayPal();
                System.out.println("Introduce el importe a pagar: ");
                double importe = teclado.nextDouble();
                teclado.nextLine();
                if (payPal.validarPaypal(importe)) {
                    payPal.procesarPago(importe);
                }
                break;
            case "TARJETA":
                TarjetaCredito tarjetaCredito = new TarjetaCredito();
                if (tarjetaCredito.validarTarjeta()) {
                    realizarPago(tarjetaCredito);
                }
                break;
            default:
                System.out.println("El metodo de pago no existe");
        }


    }

}
