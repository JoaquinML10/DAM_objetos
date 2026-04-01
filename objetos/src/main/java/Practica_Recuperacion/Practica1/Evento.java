package Practica_Recuperacion.Practica1;

import java.time.LocalDate;

public abstract class Evento {
    protected String nombre;
    protected LocalDate fecha;
    protected double precioBase;

    public Evento(String nombre, LocalDate fecha, double precioBase) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }
}
