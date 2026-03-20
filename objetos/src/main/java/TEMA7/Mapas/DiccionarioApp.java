package TEMA7.Mapas;

import java.util.Scanner;

import static TEMA7.Mapas.Diccionario.*;

public class DiccionarioApp {
    static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {
        Diccionario.llamarApar();
        System.out.println("Bienvenido al juego del diccionario SIUUUUUUUUUUUUUUUUUU");
        while (true) {
            String espa = palabraAleatoria();
            String inglish = traduce(espa);
            System.out.println(espa + ": " + primeraLetraTraduccion(inglish) + "...");
            System.out.print("Indique la respuesta correcta: ");
            String palabra = teclado.next().toLowerCase();

            if (getMapa().containsValue(palabra)) {
                System.out.println("¡CORRECTO!");
                correcto++;
            } else if (palabra.equals("fin")) {
                break;
            } else {
                System.out.println("¡NO! La respuesta correcta es: " + inglish);
            }
            preguntas++;
        }
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total de preguntas: " + preguntas);
        System.out.println("Total de aciertos: " + correcto);
        System.out.println("Total de errores: " + (preguntas-correcto));
        System.out.println("Aciertos: " + ((correcto*100) / preguntas) + "%");
    }
}
