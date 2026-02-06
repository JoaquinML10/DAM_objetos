package Practica1_El_Formoguero;

import java.util.ArrayList;

public class Cadena {

    private String nombre;

    // lista de programas que estan en la cadena
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    // "AGREGA" un programa a la cadena
    public void aniadirPrograma(Programa programa) {
        listaProgramas.add(programa);
    }

    // elimina un programa de la cadena
    public void borrar_Programa(Programa programa){
        listaProgramas.remove(programa);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas.size() +
                '}';
    }
}

