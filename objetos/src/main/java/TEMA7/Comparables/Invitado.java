package TEMA7.Comparables;

import java.time.LocalTime;
import java.util.Locale;

public class Invitado implements Comparable<Invitado> {
    private Integer edad;
    private String nombre;
    private LocalTime hora;

    public Invitado(int edad, String nombre) {
        this.hora = LocalTime.now();
        this.edad = edad;
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", hora=" + hora +
                '}';
    }

    @Override
    public int compareTo(Invitado o) {
        int comparar = nombre.compareTo(o.getNombre());
        if (comparar != 0){
            return comparar;
        }
        comparar = edad.compareTo(o.getEdad());

        if (comparar != 0){
            return comparar;
        }

        return hora.compareTo(o.getHora());
    }
}
