package TEMA7.Ejercicios;

import java.util.Stack;

public class Ejercicio3 {
    static void main(String[] args) {

        String calculo1 = "((2+3)*(5-1))";
        String calculo2 = "(2+3))+(5-1)(" ;
        System.out.println(esBalanceado(calculo1));
        System.out.println(esBalanceado(calculo2));

    }

   static public boolean esBalanceado(String expresion){

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {

            if (expresion.charAt(i) == '('){
                pila.push(expresion.charAt(i));

            } else if (expresion.charAt(i) == ')') {
                if (pila.contains('(')){
                    pila.pop();

                }else {
                    return false;
                }

            }
        }
        if (pila.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}
