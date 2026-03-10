package TEMA7.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SedeDelMundial {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {
        //leer caso de prueba
        int y = teclado.nextInt();
        teclado.nextLine();

        if (y == 0)
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            HashMap<String, Integer> mapita = new HashMap<>();
            String paises = teclado.nextLine();

            for(String pais : paises.split(" ")){
                if (mapita.containsKey(pais)){
                    mapita.put(pais,mapita.get(pais)+1);
                }else {
                    mapita.put(pais,1);
                }
            }
            int aux = 0;
            String fin = "";
            for (Map.Entry<String, Integer> mapa : mapita.entrySet()){
                if (aux < mapa.getValue()) {
                    aux = mapa.getValue();
                    fin = mapa.getKey();
                } else if (aux == mapa.getValue()) {
                    fin = "EMPATE";
                }
            }
            System.out.println(fin);
            return true;
        }
    }
}
