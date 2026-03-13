package TEMA7.Iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class EjercicioOlimpiadas {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Character> lista = new ArrayList<>();
        ListIterator<Character> it = lista.listIterator();
        System.out.println("Introduce tu palabra: ");
        String palabra = teclado.next();

        for (Character cara : palabra.toCharArray()){
            switch (cara){
                case '<':
                    if (it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext()){
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious()){
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(cara);
            }
        }
        for (Character character : lista){
            System.out.print(character);
        }
    }
}
