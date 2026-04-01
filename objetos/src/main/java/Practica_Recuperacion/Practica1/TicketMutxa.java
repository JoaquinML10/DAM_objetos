package Practica_Recuperacion.Practica1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class TicketMutxa {

    static Set<Usuario> usuariosRegistrados = new HashSet<>();
    static Set<Evento> listaEventos = new HashSet<>();

    public TicketMutxa() {
    }

    static public void insertarEvento(String nombre, LocalDate fecha, double precio, String tipo){
        Evento evento;
        if (tipo.toUpperCase().equals("CONCIERTO")){
            evento = new Concierto(nombre,fecha,precio,"nombre");
        }else if (tipo.toUpperCase().equals("FESTIVAL")){
            evento = new Festival(nombre,fecha,precio);
        }else {
            System.out.println("Esa Fiesta no existe");
            return;
        }
        listaEventos.add(evento);
    }
    static public void generarUsuario(int cantidad) {
        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i <cantidad; i++) {
            String usuario = "";
            String contra = "";
            for (int j = 0; j < 8; j++) {
                usuario += caracteres.charAt(aleatorio.nextInt(0, caracteres.length()));
                contra += caracteres.charAt(aleatorio.nextInt(0, caracteres.length()));
            }
            Usuario usuario1 = new Usuario(usuario,contra);
            usuariosRegistrados.add(usuario1);
        }
        System.out.println(usuariosRegistrados);

    }
    static public void verEventos( ){
        System.out.println("Hola " + Usuario.comprador.getNombre_usuaio() + ". Elige un Evento para iniciar la compra:");
        int contador = 1;
        for (Evento evento : listaEventos){
            System.out.println("[" + contador + "] " + evento.nombre + " "+ evento.fecha);
            contador++;
        }
    }

   public static Evento getEvento(){

       do {
           Scanner teclado = new Scanner(System.in);
           int posicion = teclado.nextInt();
           int contador = 1;
           for (Evento evento : listaEventos) {
               if (contador == posicion) {
                   return evento;
               }
               contador++;
           }
       }
        while (true);
   }

    public static Set<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;

    }

    public static void setUsuariosRegistrados(Set<Usuario> usuariosRegistrados) {
        TicketMutxa.usuariosRegistrados = usuariosRegistrados;
    }

    public static Set<Evento> getListaEventos() {
        return listaEventos;
    }

    public static void setListaEventos(Set<Evento> listaEventos) {
        TicketMutxa.listaEventos = listaEventos;
    }
}
