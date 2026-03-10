package TEMA7.Ejercicios.FuncionarioyAceptaElReto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AceptaelReto {

            static Scanner read = new Scanner(System.in);

            public static void main(String[] args) {
                while (casoDePrueba()) {
                }
            } // main

            public static boolean casoDePrueba() {
                //leer caso de prueba
                int y = read.nextInt();
                read.nextLine();

                if (y == 0)
                    return false;
                else {
                    // CÓDIGO PRINCIPAL AQUÍ
                    Set<String> potito = new HashSet<>();
                    return true;
                }
            }
}
