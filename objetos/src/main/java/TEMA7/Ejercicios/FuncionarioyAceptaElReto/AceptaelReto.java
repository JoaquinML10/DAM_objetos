package TEMA7.Ejercicios.FuncionarioyAceptaElReto;

import java.util.Scanner;
import java.util.TreeSet;

public class AceptaelReto {

            static Scanner teclado = new Scanner(System.in);

            public static void main(String[] args) {
                while (casoDePrueba()) {
                }
            } // main

            public static boolean casoDePrueba() {
                //leer caso de prueba
                int y = teclado.nextInt();
                teclado.nextLine();

                if (y == 0)
                    return false;
                else {
                    // CÓDIGO PRINCIPAL AQUÍ
                    TreeSet<String> potitoBueno = new TreeSet<>();
                    TreeSet<String> potitoMalo = new TreeSet<>();

                    for (int i = 0; i < y; i++) {
                        String frase = teclado.nextLine();
                        String[] palabras = frase.split(" ");
                        for (int j = 0; j < palabras.length-1; j++) {
                            if (palabras[0].equals("SI:") && j == 0)continue;
                            if (palabras[0].equals("SI:")){
                                potitoBueno.add(palabras[j]);
                            }
                            if (palabras[0].equals("NO:") && j == 0)continue;
                            if (palabras[0].equals("NO:")) {
                                potitoMalo.add(palabras[j]);
                            }
                        }
                    }

                    boolean espacio = false;
                    for (String potito : potitoMalo){
                        if (!potitoBueno.contains(potito)){
                            if (espacio){
                                System.out.print(" ");
                            }
                            System.out.print(potito);
                            espacio = true;
                        }
                    }
                    System.out.println();
                    return true;
                }
            }
}
