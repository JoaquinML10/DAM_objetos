package TEMA6.Prueba_enum.Juego;

import java.util.Random;
import java.util.Scanner;

public class   JuegoApp {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Elije el modo de dificultad [FACIL, MEDIO, DIFICIL, EXPERTO]");
        Dificultad dif = Dificultad.valueOf(teclado.next());

        int num_puntos = aleatorio.nextInt(1,99999);
        System.out.println("Tus puntos por haber nacido: " + num_puntos);
        System.out.println("Puntuacion final: " + (num_puntos * dif.getMultiplicador()));
    }
}
