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
        validarBizum();
    }

    public void validarBizum(){
        System.out.println("Introduce tu pin");
        int pin_usuario = teclado.nextInt();
        if (pin_usuario != pin || telefono.length() != 16){
            System.out.println("El pin que haz introducido o el telefono no es el correcto");
        }
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
        pin = aleatorio.nextInt(0,1000000);
        System.out.println("TU PIN ES: " + pin);
    }

    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }

    @Override
    public void procesarPago(double importe) {


    }
}
