package TEMA6.Practica1;

import java.util.Scanner;

public class TarjetaCredito extends MetodoPago{
    Scanner teclado = new Scanner(System.in);
    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito() {
        setNro_tarjeta();
        setTipo();
        validarTarjeta();
    }

    public boolean validarTarjeta(){
        boolean validar = true;
        if (nro_tarjeta.length() != 16){
            validar = false;
        }
        if (tipo.toUpperCase().equals("VISA")||tipo.toUpperCase().equals("MASTERCARD")||tipo.toUpperCase().equals("MAESTRO")){

        }else {
            validar = false;
        }
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

    @Override
    public void procesarPago(double importe) {
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
