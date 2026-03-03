package TEMA7.Ejercicios;

import java.util.Stack;

public class Ejercicio1 {
    static void main(String[] args) {
        Stack<Character> pila = new Stack<>();

        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        pila.push('e');

        System.out.println(pila.size());
        System.out.println(pila.peek());
        while (pila.size() != 0){
            System.out.println(pila.pop());
        }
    }
}
