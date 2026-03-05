package TEMA7.Linkedlist.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {
    static void main(String[] args) {

        Queue<String> playlist = new LinkedList<>();

        playlist.offer("Diamantito");
        playlist.offer("Baila Morena");
        playlist.offer("Matador");
        playlist.offer("Capoeira");


        System.out.println("Estado inicial de la lista: " + playlist);
        while (!playlist.isEmpty()) {

            System.out.println();
            System.out.println("Reproduciendo: " + playlist.poll());
            System.out.println("Estado de la play list despues de reproducir la cancion " + playlist);
        }

        System.out.println("La playlist ha terminado");

    }
}
