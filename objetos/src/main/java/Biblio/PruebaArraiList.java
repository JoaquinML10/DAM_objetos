package Biblio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class PruebaArraiList {
    static void main(String[] args) {
        ArrayList<Integer> listanotas = new ArrayList<>();
        listanotas.add(5);
        listanotas.add(10);
        listanotas.add(6);

        System.out.println("Elementos en la lista: " + listanotas.size());

        listanotas.add(1,4);

        System.out.println("Elementos en la lista: " + listanotas.size());

        System.out.println("nota posisicoioi 2: " + listanotas.get(2));

        listanotas.remove(1);

        System.out.println("Elementos en la lista: " + listanotas.size());

        System.out.println(listanotas);

        System.out.println("Ele 10 esta en la pocisisiocn:" + listanotas.indexOf(10));

        System.out.println("Las notas de Raul");

        for (Integer nota : listanotas){
            System.out.println("Notas de la asignatura: " + nota);
        }
        for (int i = 0; i < listanotas.size(); i++) {
            System.out.println("Notas de la asignatura " + i + ": " + listanotas.get(i));
        }

        listanotas.set(0,10);

        System.out.println(listanotas);

        Object copia_mala = listanotas.clone();

        ArrayList<Integer> copia = new ArrayList<>(listanotas);

        System.out.println(listanotas.contains(6));

        listanotas.clear();

        System.out.println("Lista vacia?: " + listanotas.isEmpty());

        listanotas.addAll(Arrays.asList(2,5,6,3));

        System.out.println(listanotas);

    }
}
