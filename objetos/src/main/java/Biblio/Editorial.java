package Biblio;

import java.util.ArrayList;

public class Editorial {
    private String nombre;
    private String pais;
    private ArrayList<Libro> listalibros;

    public Editorial(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        listalibros = new ArrayList<>();
    }

    public Editorial (){
        this("","");
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
