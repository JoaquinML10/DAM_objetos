package Inmbiliaria;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metros;
    private ArrayList<Electrodomesticos> listaElectrodomestico;

    public Habitacion(String nombre, double metros){
        this.nombre = nombre;
        this.metros = metros;
        listaElectrodomestico = new ArrayList<>();
    }

    public void crarElectrodomestico (String nombre, double consumo){
        Electrodomesticos electrodomesticos = new Electrodomesticos(nombre,consumo);
        listaElectrodomestico.add(electrodomesticos);
        System.out.println("has añadidio " + electrodomesticos.getNombre() + " a la lista");
    }

    public void mostrarElectrodomestico (){
        for (Electrodomesticos electrodomesticos:listaElectrodomestico){
            System.out.println("- " + electrodomesticos.getNombre() + " (" + electrodomesticos.getConsumo() + ")");
        }
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Electrodomesticos> getListaElectrodomestico() {
        return listaElectrodomestico;
    }

    public void setListaElectrodomestico(ArrayList<Electrodomesticos> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }

}
