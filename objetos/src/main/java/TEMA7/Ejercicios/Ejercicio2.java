package TEMA7.Ejercicios;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.print("Introduce el numero 1");
        Integer num1 = teclado.nextInt();
        System.out.print("Introduce el numero 2");
        Integer num2 = teclado.nextInt();
        System.out.print("Introduce el numero 3");
        Integer num3 = teclado.nextInt();

        pila.push(num1);
        pila.push(num2);
        pila.push(num3);
        System.out.println("Orden inverso");
    }
}
