# Practica 2: Copa del Rey: Mutxamel FC vs Real Madrid

# Índice
  1. [Introducción](#1-introduccion)
  2. [Estructura del proyecto](#estructura-del-proyecto)
  3. [Contenido de las clases](#contenido-de-las-clases)
  4. [Diagrama UML](#diagrama-uml)
  5. [Pruebas](#pruebas)


# 1. Introduccion
Vamos a crear en esta practica una aplicacion para poder crear y modificar jugadores a tu gusto, en tu equipo.

# 2. Estructura del proyecto

  ### Clases normales del proyecto
  - **Jugador**
  - **Masajista**
  - **Acompañante**
  - **Entrenador**
  
  ### Clases Abstractas
  - **RiverPlate**
  
  ### Interfaces
  - **FuncionesIntegrantes**
  - **AccionesDeportivas**
  
  ### Enum
  - **Posiciones**
  - **Equipos**

# Contenido de las clases
## Jugador
````
package TEMA6.Practica2;

import java.util.ArrayList;

public class Jugador extends RiverPlate implements AccionesDeportivas {
    private Equipos categoria;
    private Integer dorsal;
    private Posiciones posicion;

    static ArrayList<Jugador> listaJugadores = new ArrayList<>();

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

````

# Acompañante
````
package TEMA6.Practica2;

import java.util.ArrayList;

public class Jugador extends RiverPlate implements AccionesDeportivas {
    private Equipos categoria;
    private Integer dorsal;
    private Posiciones posicion;

    static ArrayList<Jugador> listaJugadores = new ArrayList<>();

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

````
# Entrenador
````
package TEMA6.Practica2;

public class Entrenador extends RiverPlate implements AccionesDeportivas  {

    private Equipos equipos;

    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipos, String formacionPreferida) {
        super(nombre, edad);
        this.equipos = equipos;
        try {
            setFormacionPreferida(formacionPreferida);
        }catch (FormacionNoValida e){
            System.out.println(e.getMessage());
        }
    }
    public void planificarEntrenamiento(){
        System.out.println("El entrenador esta planificando el entrenamiento para pegarles a los rivales");
    }

    public void hacerCambio(){
        System.out.println("El entrenador va a hacer un cambio porque sus jugadores son muy malos");
    }
    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        if (formacionPreferida.matches("\\d{1}-\\d{1}-\\d{1}")){
            this.formacionPreferida = formacionPreferida;
        }else {
            throw new FormacionNoValida();
        }

    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "formacionPreferida='" + formacionPreferida + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", equipos=" + equipos +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se esta concentrando insultando a sus jugadores");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador va a viajar a la ciudad: " + ciudad + ", para ganar la final de la LIBERTADORES");
    }

    @Override
    public void celebrarGol() {
        System.out.println("El entrenador celebra el gol mandando a callar al equipo rival");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador esta entrenando bicep");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador se esta preparando para jugar contra el equipo: " + rival);
    }
}

````
