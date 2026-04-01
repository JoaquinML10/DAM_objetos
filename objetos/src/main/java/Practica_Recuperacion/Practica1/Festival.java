package Practica_Recuperacion.Practica1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Festival extends Evento {
    private Set<String> listaArtistas;

    public Festival(String nombre, LocalDate fecha, double precioBase) {
        super(nombre, fecha, precioBase);
        this.listaArtistas = new HashSet<>();
    }

    public Set<String> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(Set<String> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }


    @Override
    public String toString() {
        return "Festival{" +
                "listaArtistas=" + listaArtistas +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }
}
