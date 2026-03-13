package TEMA7.Iteradores;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AceptaElReto {
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
            ArrayList<Character> lista = new ArrayList<>();
            ListIterator<Character> it = lista.listIterator();
            String palabra = teclado.nextLine();

            for (Character cara : palabra.toCharArray()){
                switch (cara){
                    case '-':
                        if (it.hasPrevious()){
                            while (it.hasPrevious()){
                                it.previous();
                            }
                        }
                        break;
                    case '3':   
                        if (it.hasNext()){
                            it.next();
                            it.remove();
                        }
                        break;
                    case '+':
                        if (it.hasNext()){
                            while (it.hasNext()){
                                it.next();
                            }
                        }
                        break;
                    case '*':
                        if (it.hasNext()){
                            it.next();
                        }
                        break;
                    default:
                        it.add(cara);
                }
            }
            for (Character character : lista){
                System.out.print(character);
            }
            System.out.println();
            return true;
        }
    }
}
