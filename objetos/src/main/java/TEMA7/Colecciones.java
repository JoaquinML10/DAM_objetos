package TEMA7;

import java.util.ArrayList;
import java.util.Stack;

public class Colecciones {
    static void main(String[] args) {
        ArrayList<Integer> listaNums = new ArrayList<>();
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(9);
        pila.push(912);
        System.out.println(pila.peek());
        pila.pop();

        System.out.println(pila.peek());
    }
}
