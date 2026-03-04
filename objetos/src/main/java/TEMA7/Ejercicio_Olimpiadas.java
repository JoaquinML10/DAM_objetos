package TEMA7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio_Olimpiadas {
        static Scanner teclado;
        public static void main(String[] args) {
            teclado = new Scanner(System.in);
            while (casoDePrueba()) {

            }
        }

        public static boolean casoDePrueba() {
            if (!teclado.hasNext())
                return false;
            else {
                String frase = teclado.nextLine();
                Stack<Character> pila = new Stack<>();
                char[] parentesis = {'(',')','[',']','{','}'};
                ArrayList<String> listapare = new ArrayList<>();
                listapare.add(frase);
                for (int i = 0; i < frase.length(); i++) {
                    char signo = frase.charAt(i);
                    if (listapare.contains(parentesis)){

                    }
                }

                System.out.println(listapare);
                return true;
            }
        }
}
