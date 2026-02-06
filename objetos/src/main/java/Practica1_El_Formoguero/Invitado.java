package Practica1_El_Formoguero;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        setFecha_visita();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año en el que acudira " + nombre);
        int año = teclado.nextInt();
        System.out.println("Introdue tambien el mes");
        int mes = teclado.nextInt();
        System.out.println("Introduce el dia");
        int dia = teclado.nextInt();
        this.fecha_visita = LocalDate.of(año, mes, dia);
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
