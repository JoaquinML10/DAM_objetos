package Practica1_El_Formoguero;

import java.time.LocalDate;
import java.util.ArrayList;

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

        // Si el programa tiene cadena se autoinvita y se añade a la cadena
        if (cadena != null){
            cadena.aniadirPrograma(this);
        }

        this.temporadas = 0;
        this.director = new Empleado(nombreDirector,"director");
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        listaEmpleados.add(director);
    }

    // cuenta cuántos invitados han venido en una temporada y los muestra por pantalla
    public void invitado_Tempoarada(int temporada){
        int contador = 0;

        for (Invitado invitado1 : listaInvitados){
            if (invitado1.getTemporada() == temporada) {
                contador++;
            }
        }
        System.out.println("Numeros de invitados que han acudido al programa " + contador);

        for (Invitado invitado1 : listaInvitados){
            if (invitado1.getTemporada() == temporada) {
                System.out.println("El invitado es: " + invitado1.getNombre()
                        + " y su profesion es: " + invitado1.getProfesion());
            }
        }
    }

    // muestra cuántas veces aparece un invitado
    public int vecesInvitado(String nombre){
        int contador = 0;
        for (Invitado invitado1 : listaInvitados){
            if (invitado1.getNombre().equals(nombre)){
                contador++;
            }
        }
        return contador;
    }

    // Muestra todas las visitas de la temporada y fecha que vino el invitado
    public void rastrearInvitado(String nombre){
        int contador = 0;

        // cuenta visitas
        for (Invitado invitado1 : listaInvitados){
            if (invitado1.getNombre().equals(nombre)){
                contador++;
            }
        }

        System.out.println("Veces que " + nombre + " al programa:" + contador);

        // muestra los detalles de la visita
        for (Invitado invitado1 : listaInvitados){
            if (invitado1.getNombre().equals(nombre)){
                System.out.println("Vino a la temporada " + invitado1.getTemporada() + ", en la fecha " + invitado1.getFecha_visita());
            }
        }
    }

    // busca si existe un invitado por nombre y lo muestra
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

    // Calcula la fecha más antigua en la que vino un invitado
    public void invitadoAntes(String nombre){
        LocalDate primera_fecha = null;
        if (buscarInvitado(nombre)){
            for (Invitado invitado : listaInvitados){
                if (invitado.getNombre().equals(nombre)){
                    if (primera_fecha == null){
                        primera_fecha = invitado.getFecha_visita();
                    } else if (invitado.getFecha_visita().isBefore(primera_fecha)) { // si encuentra una fecha anterior menor se convierte en esa fecha
                        primera_fecha = invitado.getFecha_visita();
                    }
                }
            }
            System.out.println(primera_fecha + " es la mas antigua");
        } else {
            System.out.println(nombre + " Este invitado no ha asistida al programa");
        }
    }

    // si no tiene director y el empleado no es director se le asigna como el nuevo director y lo añade al programa
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
        // Elimina el objeto si existe en la lista (comparación por equals)
        listaEmpleados.remove(empleado);
    }

    // añade invitado
    public void aniadir_invitado(String nombre, String profesion, int temporadas){
        Invitado invitado = new Invitado(nombre, profesion, temporadas);
        listaInvitados.add(invitado);
    }

    public void borrar_Invitado(Invitado invitado){
        listaInvitados.remove(invitado);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Cadena getCadena() { return cadena; }
    public void setCadena(Cadena cadena) { this.cadena = cadena; }
    public int getTemporadas() { return temporadas; }
    public void setTemporadas(int temporadas) { this.temporadas = temporadas; }
    public ArrayList<Empleado> getListaEmpleados() { return listaEmpleados; }
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) { this.listaEmpleados = listaEmpleados; }
    public ArrayList<Invitado> getListaInvitados() { return listaInvitados; }
    public void setListaInvitados(ArrayList<Invitado> listaInvitados) { this.listaInvitados = listaInvitados; }
    public Empleado getDirector() { return director; }
    public void setDirector(Empleado director) { this.director = director; }

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
