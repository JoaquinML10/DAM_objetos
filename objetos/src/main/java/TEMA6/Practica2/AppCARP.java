package TEMA6.Practica2;

public class AppCARP {
    static void main(String[] args) {
        Jugador Joaquin = new Jugador("Joaquin",18,Equipos.SENIOR,10,Posiciones.CENTROCAMPISTA);
        Jugador Jacobo = new Jugador("Jacobo",20,Equipos.SENIOR,1,Posiciones.PORTERO);
        Jugador Jorge = new Jugador("Jorgito", 22,Equipos.SENIOR,3,Posiciones.DEFENSA);
        System.out.println(Jugador.listaDorsal);
        Entrenador Carlos = new Entrenador("Carlitos",20,Equipos.SENIOR,"3-3-4");
        Masajista Denis = new Masajista("MotherBoard",19,"Jardinero",6);
        Acompaniante Angel = new Acompaniante("Angel",19,Joaquin,"AMANTE");
        Angel.animarEquipo();
        Angel.viajar("Madrid");

    }
}
