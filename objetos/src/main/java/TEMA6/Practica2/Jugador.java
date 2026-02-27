package TEMA6.Practica2;

import java.util.ArrayList;

public class Jugador extends RiverPlate implements AccionesDeportivas {
    private Equipos categoria;
    private Integer dorsal;
    private Posiciones posicion;

    static ArrayList<Jugador> listaJugadores = new ArrayList<>();

    /**
     * En el constructor se valida si meter el jugador a la lista
     * llamando al metodo set dorsal y comprobando con el try-catch
     * @param nombre
     * @param edad
     * @param categoria
     * @param dorsal
     * @param posicion
     */
    public Jugador(String nombre, int edad, Equipos categoria, Integer dorsal, Posiciones posicion) {
        boolean validar = true;
        super(nombre, edad);
        this.categoria = categoria;
        try {
            setDorsal(dorsal);
        }catch (DorsaLIgual e){
            System.out.println(e.getMessage());
            validar = false;
        }
        this.posicion = posicion;
        if (validar){
            listaJugadores.add(this);
        }
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

    /**
     * Aqui le pasamos el dorsal y se fija si en la lista
     * hay un jugador con el mismo dorsal, si lo hay comprueba de que no sean del mimso equipo
     * Si hay un jugador con el mismo dorsal salta la excepcion dando error
     * @param dorsal
     */
    public void setDorsal(Integer dorsal) {
        boolean dorsalvalido = true;
        for (Jugador jugador : listaJugadores){
            if (jugador.getDorsal() == dorsal){
                if (jugador.getCategoria().equals(this.categoria)){
                    dorsalvalido = false;
                }
            }
        }
        if (dorsalvalido){
            this.dorsal = dorsal;
        }else {
            throw new DorsaLIgual();
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
        System.out.println("El jugador: "+ nombre + " se esta concentrando bailando la macarena");
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
