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
# Diagrama UML

# Pruebas
