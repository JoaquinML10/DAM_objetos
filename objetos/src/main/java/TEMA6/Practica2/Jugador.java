package TEMA6.Practica2;

import java.util.ArrayList;

public class Jugador extends RiverPlate implements AccionesDeportivas {
    private Equipos categoria;
    private Integer dorsal;
    private Posiciones posicion;
    static ArrayList<Integer> listaDorsal = new ArrayList<>();

    public Jugador(String nombre, int edad, Equipos categoria, Integer dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        try {
            setDorsal();
        }catch (DorsaLIgual e){
            System.out.println(e.getMessage());
        }
        this.posicion = posicion;

    }

    public void calentar(){
        System.out.println("El jugador: " + nombre + " esta calentando");
    }

    public void descansar(){
        System.out.println("El jugador: " + nombre + " esta descansando");
    }

    public void marcarGol(){
        System.out.println("El jugador: " + nombre + " ha marcado un golazoooooo");
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal() {
        if (listaDorsal.contains(dorsal)){
            throw new DorsaLIgual();
        }else {
            listaDorsal.add(dorsal);
        }

    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "posicion=" + posicion +
                ", categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador: "+ nombre + " se esta concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador: " + nombre + " va a viajar a la ciudad " + ciudad + " para jugar la final de la LIBERTADORES");
    }

    @Override
    public void celebrarGol() {
        System.out.println("El jugador: " + nombre + " no celebra el gol, porque cuando un cartero entrega una carta no lo celebra, solo esta haciendo su trabajo");
    }

    @Override
    public void entrenar() {
        System.out.println("El jugador: " + nombre + " esta entrenando para ser mejor que Cristiano Ronaldo");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador: " + nombre + " se va a enfrentar contra el equipo de MAKELELE que es: " + rival);
    }
}
