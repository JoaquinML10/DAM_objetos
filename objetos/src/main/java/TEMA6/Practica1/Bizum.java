package TEMA6.Practica1;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{
    Scanner teclado = new Scanner(System.in);
    Random aleatorio = new Random();

    private String telefono;
    private int pin;

    public Bizum() {
        setTelefono();
        setPin();
    }


    /**
     * Valida los datos de Bizum.
     * Comprueba que el PIN introducido por el usuario
     * sea el mismo que se genero automaticamente y que la
     * la longitud del celular sea la correcta
     *
     * @return true si los datos son correctos y false si hay error
     */
    public boolean validarBizum(){
        boolean validar = true;
        System.out.println("Introduce tu pin");
        int pin_usuario = teclado.nextInt();
        System.out.println("Validando Bizum...");

        if (pin_usuario != pin || telefono.length() != 9){
            System.out.println("El pin que haz introducido o el telefono no es el correcto");
            validar = false;
        }

        return validar;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono() {
        System.out.println("Introduce tu telefono: ");
        telefono = teclado.nextLine();
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin() {
        pin = aleatorio.nextInt(100000,1000000);
        System.out.println("TU PIN ES: " + pin);
    }



    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }

    /**
     * Procesa el pago con Bizum
     * Muestra un mensaje si el pago
     * se ha realizado correctamente
     *
     * @param importe la plata que va a pagar el usuario
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum" );
        System.out.println("Pago aceptado. Muchas gracias.");
    }
}
