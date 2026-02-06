package Practica1_El_Formoguero;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String nombreDirector){
        this.nombre = nombre;
        this.cadena = cadena;
        if (cadena != null){
            cadena.aniadirPrograma(this);
        }
        this.temporadas = 0;
        this.director = new Empleado(nombreDirector,"director");
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();

        listaEmpleados.add(director);
    }

    public void invitado_Tempoarada(int temporada){
        int contador = 0;
        for (Invitado invitado1:listaInvitados){
            if (invitado1.getTemporada()==temporada) {
                contador++;
            }
        }
        System.out.println("Numeros de invitados que han acudido al programa " + contador);
        for (Invitado invitado1:listaInvitados){
            if (invitado1.getTemporada()==temporada) {
                System.out.println("El invitado es: " + invitado1.getNombre() + " y su profesion es: " + invitado1.getProfesion());
            }
        }

    }

    public int vecesInvitado(String nombre){
        int contador = 0;
        for (Invitado invitado1 : listaInvitados){
            if (invitado1.getNombre().equals(nombre)){
                contador++;
            }
        }
        return contador;
    }

    public void rastrearInvitado(String nombre){
        int contador = 0;
        for (Invitado invitado1 : listaInvitados){
            if (invitado1.getNombre().equals(nombre)){
                contador++;
            }
        }
        System.out.println("Veces que " + nombre + " al programa:" + contador);

        for (Invitado invitado1 : listaInvitados){
            if (invitado1.getNombre().equals(nombre)){
                System.out.println("Vino a la temporada " + invitado1.getTemporada() + ", en la fecha " + invitado1.getFecha_visita());
            }
        }
    }

    public boolean buscarInvitado(String nombre){
        for (Invitado invitado1 : listaInvitados){
            if (invitado1.getNombre().equals(nombre)){
                System.out.println("Este invitado ya vino al programa");
                return true;
            }
        }
        System.out.println("Nadie la invito");
        return false;
    }

    public void invitadoAntes(String nombre){
        LocalDate primera_fecha = null;
        if (buscarInvitado(nombre)){
            for (Invitado invitado: listaInvitados){
                if (invitado.getNombre().equals(nombre) ){
                    if (primera_fecha==null){
                        primera_fecha = invitado.getFecha_visita();
                    }else if (invitado.getFecha_visita().isBefore(primera_fecha)) {
                        primera_fecha = invitado.getFecha_visita();
                    }
                }
            }
            System.out.println(primera_fecha + " es la mas antigua");
        }else {
            System.out.println(nombre + " Este invitado no ha asistida al programa");
        }

    }

    public void aniadir_empleado(String nombre, String cargo, Empleado director){
        Empleado empleado = new Empleado(nombre, cargo);
        if (director == null && !empleado.getCargo().equals("director")) {
            empleado.setDirector(this.director);
        } else {
            empleado.setDirector(director);
        }
        listaEmpleados.add(empleado);
    }
    public void borrar_Empleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }
    public void aniadir_invitado(String nombre, String profesion, int temporadas){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año en el que acudira " + nombre);
        int año = teclado.nextInt();
        System.out.println("Introdue tambien el mes");
        int mes = teclado.nextInt();
        System.out.println("Introduce el dia");
        int dia = teclado.nextInt();
        Invitado invitado = new Invitado(nombre, profesion, temporadas, LocalDate.of(año,mes,dia));
        listaInvitados.add(invitado);
    }
    public void borrar_Invitado(Invitado invitado){
        listaInvitados.remove(invitado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String  toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
