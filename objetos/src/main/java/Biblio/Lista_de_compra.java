package Biblio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lista_de_compra {
    static Random aleatorio = new Random();
    static ArrayList<String> listacompra = new ArrayList<>();
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        listacompra.add("Jacobo");
        listacompra.add("Bomba");
        listacompra.add("Cohete");
        listacompra.add("Casa");
        listacompra.add("Maduro");

        for (String cosas : listacompra){
            System.out.println("La lista de la compra es: " + cosas);
        }

        listacompra.set(2,"quezo");

        System.out.println(listacompra.contains("leche"));

        duplicado("melocoton");

        System.out.println("numero de cosas en la lista: " + listacompra.size());

        ArrayList<String> copia_lista_compra = new ArrayList<>(listacompra);

        copia_lista_compra.clear();

        System.out.println(copia_lista_compra);

        boolean soniguales = listacompra.equals(copia_lista_compra);
        System.out.println(soniguales);

        copia_lista_compra.addAll(Arrays.asList("China, Venezuela"));

        ArrayList<String> faltantes = new ArrayList<>(listacompra);

        faltantes.removeAll(copia_lista_compra);
        ArrayList<Integer> valor_lista = new ArrayList<>();
        for (int i = 0; i < listacompra.size(); i++) {
            Integer numero = aleatorio.nextInt(0,11);
            valor_lista.add(numero);
        }
        for (int i = 0; i < listacompra.size(); i++) {
            System.out.println("lista de la compra: " + listacompra.get(i) + " €" + valor_lista.get(i));

        }
    }
    static public void duplicado(String aniadir){

        if (listacompra.contains(aniadir)){
            System.out.println(aniadir + " esta en la lista, no hace falta añadirlo");

    }else {
            System.out.println(aniadir + " no esta en la lista");
            listacompra.add(aniadir);
        }

    }
}

