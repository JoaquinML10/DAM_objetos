package TEMA7.Iteradores;

import java.util.*;

public class Iteradores {
    static void main(String[] args) {
        TreeSet<String> lista = new TreeSet<>();
        lista.add("Pikachu");
        lista.add("Charmander");
        lista.add("Squirtle");
        lista.add("Bulbasur");
        lista.add("Magikarp");

//        for (String pokemos : lista){
//            if (pokemos.equals("Magikarp")){
//                lista.remove(pokemos);
//            }
//        }

        Iterator<String> it = lista.iterator();

        while (it.hasNext()){
            String pokemon = it.next();
            if (pokemon.equals("Pikachu")){
                it.remove();
            }
            System.out.println(pokemon);
        }
        System.out.println(lista);
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Nicki Nickole", 4);
        mapa.put("Germaioni", 7);

        Iterator<Map.Entry<String, Integer>> itmapita = mapa.entrySet().iterator();

        System.out.println(mapa.entrySet());
        while (itmapita.hasNext()){
            Map.Entry<String,Integer> novia = itmapita.next();
            System.out.println(novia.getKey() + " ha durado " + novia.getValue() + " meses con joaquin");
            if (novia.getKey().equals("Germaioni")){
                itmapita.remove();
            }
        }
        for (Map.Entry<String, Integer> mapita : mapa.entrySet()){
            System.out.println(mapita.getKey());
        }
    }
}
