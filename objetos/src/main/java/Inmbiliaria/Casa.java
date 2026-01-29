package Inmbiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    static Scanner teclado = new Scanner(System.in);
    private String direccion;

    private ArrayList<Habitacion> listahabitaciones;

    private Propietario propietario;

    public Casa(String direccion){
        this.direccion=direccion;
        listahabitaciones = new ArrayList<>();
        setPropietario();
    }

    public ArrayList<Habitacion> getListahabitaciones() {
        return listahabitaciones;
    }

    public void setListahabitaciones(ArrayList<Habitacion> listahabitaciones) {
        this.listahabitaciones = listahabitaciones;
    }

    public void mostrarHabitacion(){
        System.out.println("Casa en " + direccion + "y propetario " + propietario.getNombre() + " tiene " +  listahabitaciones.size());
        for (Habitacion habitacion : listahabitaciones){
            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetros() + " )");
        }
    }

    public Habitacion getHabitacionMasGrande(){
        Habitacion mayor = listahabitaciones.get(0);

        for (Habitacion habitacion:listahabitaciones){
            if (habitacion.getMetros()> mayor.getMetros()){
                mayor=habitacion;
            }
        }
        return mayor;
    }

    public void crearHabitacion(String nombre, double metros){

        for (Habitacion habitacion:listahabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitacion " + nombre + " ya existe.");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre,metros);
        listahabitaciones.add(habitacion);
        System.out.println("Habitacion creada");
    }

    public void eliminarHabitaciones(String nombre){
        for (Habitacion habitacion:listahabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                listahabitaciones.remove(habitacion);
                System.out.println("Habitacion " + nombre + " borrada con exito.");
                return;
            }
        }
        System.out.println("La habitacion " + nombre + " no existe.");
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propetario");
        String nombre = teclado.next();
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        Propietario propietario = new Propietario(nombre,edad);
        this.propietario = propietario;
        System.out.println("Propetario " + nombre + " añadido.");

    }


    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "propetario='" + propietario + '\'' +
                '}';
    }

}
