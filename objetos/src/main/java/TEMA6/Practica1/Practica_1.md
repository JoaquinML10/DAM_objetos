# Practica 1: Sistema de pago para e-commerce
# Índice
# Práctica 1: Sistema de pago para e-commerce

# Índice
  1. [Introducción](#1-introduccion)
  2. [Clases del proyecto](#clases-del-proyecto)
  3. [Código de las clases](#contenido-de-las-clases)
  4. [Diagrama UML](#diagrama-uml)
  5. [Pruebas](#pruebas)


# 1. Introduccion
En esta práctica se ha desarrollado un sistema de pago para una tienda online de cursos de programación.  
El sistema permite realizar pagos mediante distintos métodos: Tarjeta de Crédito, PayPal y Bizum.

# Clases del proyecto
  
  - **MetodoPago**  
    Clase abstracta que define el método `procesarPago(double importe)`.  
    Sirve como clase base para los distintos métodos de pago.
  
  - **TarjetaCredito**  
    Hereda de `MetodoPago`.  
    Gestiona los pagos con tarjeta y valida el número y tipo de tarjeta.
  
  - **PayPal**  
    Hereda de `MetodoPago`.  
    Gestiona los pagos mediante cuenta de correo electrónico y comprueba el saldo disponible.
  
  - **Bizum**  
    Hereda de `MetodoPago`.  
    Permite realizar pagos mediante número de teléfono y validación de PIN.
  
  - **Tienda**  
    Contiene los métodos estáticos:
    - `iniciarPago()` → Permite al usuario elegir el método de pago y valida los datos.
    - `realizarPago()` → Procesa el pago utilizando polimorfismo.
  
  - **AppEcommerce**  
    Clase principal que ejecuta la aplicación llamando a:
    `Tienda.iniciarPago();`
    
# Contenido de las clases
## MetodoPago
  ````
  package TEMA6.Practica1;
  
  public abstract class MetodoPago {
  
      public abstract void procesarPago(double importe);
  
  }
  ````
## Tienda
````
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
````
##Bizum
````
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
````

##PayPal
````
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
````

##Tarjeta Credito
````
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
````
# Diagrama UML

##Codigo UML
````
@startuml

title Sistema de Pago - Ecommerce

abstract class MetodoPago {
    +procesarPago(importe : double) : void
}

class Tienda {
    -teclado : Scanner
    +realizarPago(metodo : MetodoPago) : void
    +iniciarPago() : void
}

class PayPal {
    -cuenta : String
    -saldo : double
    -SALDO_POR_DEFECTO : double
    +PayPal()
    +validarPaypal(importe : double) : boolean
    +procesarPago(importe : double) : void
    +getCuenta() : String
    +setCuenta() : void
    +getSaldo() : double
    +setSaldo(saldo : double) : void
}

class TarjetaCredito {
    -nro_tarjeta : String
    -tipo : String
    +TarjetaCredito()
    +validarTarjeta() : boolean
    +procesarPago(importe : double) : void
    +getNro_tarjeta() : String
    +setNro_tarjeta() : void
    +getTipo() : String
    +setTipo() : void
}

class Bizum {
    -telefono : String
    -pin : int
    +Bizum()
    +validarBizum() : boolean
    +procesarPago(importe : double) : void
    +getTelefono() : String
    +setTelefono() : void
    +getPin() : int
    +setPin() : void
}

MetodoPago <|-- PayPal
MetodoPago <|-- TarjetaCredito
MetodoPago <|-- Bizum

Tienda --> MetodoPago : usa

@enduml
````

##Imagen del UML
# Pruebas
