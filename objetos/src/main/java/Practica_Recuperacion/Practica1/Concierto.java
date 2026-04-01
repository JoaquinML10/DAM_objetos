package Practica_Recuperacion.Practica1;

import java.time.LocalDate;

public class Concierto extends Evento{
    private String artista;

    public Concierto(String nombre, LocalDate fecha, double precioBase, String artista) {
        super(nombre, fecha, precioBase);
        this.artista = artista;
    }


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Concierto{" +
                "artista='" + artista + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }
}
