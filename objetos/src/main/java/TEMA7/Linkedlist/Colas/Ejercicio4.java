package TEMA7.Linkedlist.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
            LinkedList<String> cola = new LinkedList<>();

            Scanner teclado = new Scanner(System.in);

        while (true) {

            System.out.println("1. Añadir producto al final");
            System.out.println("2. Eliminar primer producto");
            System.out.println("3. Eliminar producto por nombre");
            System.out.println("4. Ver primer producto");
            System.out.println("5. Buscar producto");
            System.out.println("6. Mostrar lista actual");
            System.out.println("X. Salir");
            System.out.println();
            System.out.print("Selecciona una opcion: ");
            char op = teclado.next().charAt(0);
            System.out.println();
            System.out.println("------------------------------");
            switch (op) {
                case '1':
                    System.out.print("Añade tu producto: ");
                    String producto = teclado.next();
                    cola.offerLast(producto);
                    System.out.println(cola);
                    break;
                case '2':
                    System.out.print("Eliminando el producto...");
                    cola.pollFirst();
                    break;
                case '3':
                    System.out.print("Di el producto que quieres eliminar: ");
                    String producto2 = teclado.next();
                    System.out.println(cola);
                    if (cola.contains(producto2)) {
                        System.out.println("Eliminando producto...");
                        cola.remove(producto2);
                    } else {
                        System.out.println("El producto no esta en la lista");
                    }
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                default:
            }
            System.out.println();
        }
    }
}
