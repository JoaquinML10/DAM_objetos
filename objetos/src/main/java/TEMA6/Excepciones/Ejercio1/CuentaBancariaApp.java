package TEMA6.Excepciones.Ejercio1;

import java.util.Scanner;

public class CuentaBancariaApp {
    static void main(String[] args) {
        CuentaBancaria nuevacuenta = new CuentaBancaria();
        Scanner teclado = new Scanner(System.in);
        String opcion = "1";
        do {
            System.out.println("======Cajero Automatico======");
            System.out.println();
            System.out.println("    [1]. Consultar saldo" );
            System.out.println("    [2]. Ingresar Dinero" );
            System.out.println("    [3]. Retirar dinero" );
            System.out.println("    [X]. Salir" );

            System.out.println("Selecciona una opcion: ");
            opcion = teclado.next().toUpperCase();
            switch (opcion.toUpperCase()){
                case "1":
                    nuevacuenta.consultarSaldo();
                    break;
                case "2":
                    System.out.println("Introduce el importe que quieres agregar");
                    double importe = teclado.nextDouble();
                    nuevacuenta.ingresarDinero(importe);
                    break;
                case "3":
                    System.out.println("Introduce el dinero que quieres retirar: ");
                    double ret_dinero = teclado.nextDouble();
                    nuevacuenta.retirarDinero(ret_dinero);
                    break;
                case "X":
                    System.out.println("Chau chau");
                    break;
                default:
                    System.out.println("La opcion que haz introducido no es la correcta");
            }
        }while (!opcion.equals("X"));


    }
}
