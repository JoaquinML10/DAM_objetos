package TEMA6.Practica1;

import java.util.Scanner;

public class TarjetaCredito extends MetodoPago{
    Scanner teclado = new Scanner(System.in);
    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito() {
        setNro_tarjeta();
        setTipo();
    }


    /**
     * Valida los datos de la tarjeta
     *
     * Comprueba que la tarjeta tenga
     * El número tenga 16 caracteres
     * El tipo sea VISA, MASTERCARD y MAESTRO
     *
     * @return true si la tarjeta es válida y false si no lo es
     */
    public boolean validarTarjeta(){
        boolean validar = true;
        if (nro_tarjeta.length() != 16){
            validar = false;
        }
        if (tipo.toUpperCase().equals("VISA")||tipo.toUpperCase().equals("MASTERCARD")||tipo.toUpperCase().equals("MAESTRO")){

        }else {
            validar = false;
        }
        System.out.println("Validando tarjeta...");
        if (validar){

        }else {
            System.out.println("El numero de la tarjeta o el tipo no es el correcto");
        }
        return validar;

    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta() {
        System.out.println("Introduce el numero de tu tarjeta");
        nro_tarjeta = teclado.nextLine();
        this.nro_tarjeta = nro_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        System.out.println("Introduce el tipo de tarjeta (VISA, MASTERCARD, MAESTRO)");
        tipo = teclado.nextLine();
        this.tipo = tipo;
    }

    /**
     * Procesa el pago con Tarjeta
     * Muestra un mensaje si el pago
     * se ha realizado correctamente
     *
     * @param importe la plata que va a pagar el usuario
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con tarjeta de credito " + getTipo() );
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
