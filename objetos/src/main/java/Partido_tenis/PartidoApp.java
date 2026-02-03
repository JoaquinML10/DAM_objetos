package Partido_tenis;

public class PartidoApp {
   public static void main(String[] args) {
        Jugador jorge = new Jugador("jorge",4);
        Jugador raul = new Jugador("raul",5);

        Partdio copaleche = new Partdio(jorge,raul);

        Set nuevose = new Set(7,4);

        nuevose.controlarPuntos(7,5);

        copaleche.insertarSet(5,7);

        System.out.println(copaleche.getListaSets());

        nuevose.controlarPuntos(6,0);



    }
}
