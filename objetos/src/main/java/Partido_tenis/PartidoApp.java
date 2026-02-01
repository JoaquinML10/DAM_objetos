package Partido_tenis;

public class PartidoApp {
   public static void main(String[] args) {
        Jugador jorge = new Jugador("jorge",4);
        Jugador raul = new Jugador("raul",5);

        Partdio copaleche = new Partdio(jorge,raul);
        copaleche.insertarSet(5,7);

        System.out.println(copaleche.getListaSets());





    }
}
