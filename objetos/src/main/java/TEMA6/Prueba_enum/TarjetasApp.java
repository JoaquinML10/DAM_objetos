package TEMA6.Prueba_enum;

import java.util.Scanner;

public class TarjetasApp {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Tarjetas tarjetas_tipo = Tarjetas.VISA;
        System.out.println(tarjetas_tipo.ordinal());
        System.out.println(tarjetas_tipo.name());

        System.out.println("Tipos de tarjetas: ");

        for (Tarjetas tarjetas : Tarjetas.values()){
            System.out.println(tarjetas);
        }
        System.out.println("Introduce el tipo: ");
        Tarjetas tipo = Tarjetas.valueOf(teclado.next());
        System.out.println("La tarjeta de " + tipo.name() + " tiene una comision de " + tipo.getComision());
    }
}
