# Practica 2: Copa del Rey: Mutxamel FC vs Real Madrid

# Índice
  1. [Introducción](#1-introduccion)
  2. [Estructura del proyecto](#2-estructura-del-proyecto)
  3. [Contenido de las clases](#3-contenido-de-las-clases)
  4. [Contenido de la clase Abstractas](#4-Contenido-de-la-clase-Abstractas)
  5. [Contenido de las Interfaces](#5-contenido-de-las-Interfaces)
  6. [Contenido del Enum](#6-Contenido-del-Enum)


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

# 3. Contenido de las clases
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

# Masajista
````
package TEMA6.Practica2;

public class Masajista extends RiverPlate{

    private String titulacion;
    private int anosExperiencias;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencias) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencias = anosExperiencias;
    }

    public void darMasaje(Jugador... jugador){
        if (jugador.length == 1) {
            System.out.println("El masajista: " + nombre + " le esta haciendo unos masjes muy buenos al jugador: " + jugador[0].getNombre());
        }else {
            System.out.println("El masajista: " + nombre + " le esta haciendo unos masjes muy buenos a los jugadores: ");
            for (int i = 0; i < jugador.length; i++) {
                System.out.println(jugador[i].getNombre());
            }
        }

    }
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencias() {
        return anosExperiencias;
    }

    public void setAnosExperiencias(int anosExperiencias) {
        this.anosExperiencias = anosExperiencias;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "anosExperiencias=" + anosExperiencias +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", titulacion='" + titulacion + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista se esta concentrando para hacer bien el masaje");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista tiene que viajar a la ciudad: " + ciudad + ", para poder seguir dandole masajes a los jugadores");
    }

    @Override
    public void celebrarGol() {
        System.out.println("El masajista esta celebrando el gol que metio el jugador");
    }
}

````

# 4. Contenido de la clase Abstractas

# RiverPlate
````
package TEMA6.Practica2;

public abstract class RiverPlate implements FuncionesIntegrantes{

    protected String nombre;
    protected int edad;

    public RiverPlate(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "RiverPlate{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

````

# 5. Contenido de las Interfaces
# Funciones Integrantes
````
package TEMA6.Practica2;

public interface FuncionesIntegrantes {

    void concentrarse();
    void viajar(String ciudad);
    void celebrarGol();
}
````
# Acciones Deportivas
````
package TEMA6.Practica2;

public interface AccionesDeportivas {

    void entrenar();
    void jugarPartido(String rival);
}
````

# 6. Contenido del Enum
# Posiciones
````
package TEMA6.Practica2;

public enum Posiciones {
    PORTERO,DEFENSA,CENTROCAMPISTA,DELANTERO;
}
````

# Equipos
````
package TEMA6.Practica2;

public enum Equipos {
    BENJAMIN,ALEVIN,INFANTIL,CADETE,JUVENIL,SENIOR;
}
````
