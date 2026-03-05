package TEMA7.Linkedlist.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Colas {
    static void main(String[] args) {
        Deque<String> cola = new LinkedList<>();

        cola.offer("Bless");
        cola.offer("Yatra");
        cola.offer("Morat");

        System.out.println(cola.poll());
        System.out.println(cola.peek());

        cola.offerFirst("Pirlo");
        System.out.println(cola.peek());
        System.out.println(cola.pollLast());

        Queue<String> cola2 = new ArrayBlockingQueue<>(2);

        cola2.offer("Juan");
        cola2.offer("Jacobo");
        cola2.offer("Pedro samchez");

        System.out.println(cola2);
    }
}
