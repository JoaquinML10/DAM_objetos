package TEMA6.Interfaces;

import java.util.ArrayList;

public class VoladoresApp {
    static void main(String[] args) {
        Superman jorge = new Superman();

        Pajaros piolin = new Pajaros();

        jorge.volar();
        piolin.volar();

        Spiderman carlos = new Spiderman();
        ArrayList<Superheroe> listaheroes = new ArrayList<>();
        listaheroes.add(carlos);
        listaheroes.add(jorge);
        for (Superheroe superheroe : listaheroes){
            if (superheroe instanceof Superman){
                ((Superman) superheroe).alientohielo();
                ((Superman) superheroe).rayolaser();
            }
        }
    }
}
