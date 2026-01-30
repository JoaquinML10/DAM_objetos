package Partido_tenis;

import java.util.ArrayList;

public class Partdio {
    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set> listaSets;

    public Partdio(Jugador jugador1, Jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        jugador1.setRival(jugador2);
        jugador2.setRival(jugador1);
        listaSets = new ArrayList<>();
    }

    public void insertarSet(int puntosj1, int puntosj2){

        Set nuevoSet= new Set(puntosj1,puntosj2);

        listaSets.add(nuevoSet);

    }
    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public ArrayList<Set> getListaSets() {
        return listaSets;
    }

    public void setListaSets(ArrayList<Set> listaSets) {
        this.listaSets = listaSets;
    }

    @Override
    public String toString() {
        return "Partdio{" +
                "jugador1=" + jugador1 +
                ", jugador2=" + jugador2 +
                ", listaSets=" + listaSets +
                '}';
    }

}
