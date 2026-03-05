package TEMA7.Linkedlist.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio5 {
    static void main(String[] args) {
        Deque<Character> palindromo = new LinkedList<>();
        String palabras = "RADAR";
        boolean corre = true;
        for (int i = 0; i < palabras.length(); i++) {
            char letra = palabras.charAt(i);
            palindromo.offer(letra);
        }
        while (!palindromo.isEmpty()){
            if (palindromo.peekFirst() == palindromo.peekLast()){
                palindromo.pollFirst();
                palindromo.pollLast();
            }else {
                corre=false;
                break;
            }
        }
        System.out.println(palabras + " es " + corre);

    }
}
