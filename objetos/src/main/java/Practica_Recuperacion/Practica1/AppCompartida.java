package Practica_Recuperacion.Practica1;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static Practica_Recuperacion.Practica1.Usuario.comprador;

public class AppCompartida {
    static Queue<Usuario> cola = new LinkedList<>();
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        TicketMutxa.insertarEvento("Paella", LocalDate.of(2025,4,16),20,"festival");
        TicketMutxa.insertarEvento("Concierto Estopa", LocalDate.of(2025, 4, 21),40,"concierto");
        // crear usuarios
        TicketMutxa.generarUsuario(4);

        Usuario usuario = new Usuario("","");
        usuario.autenticarse(TicketMutxa.getUsuariosRegistrados());
        TicketMutxa.verEventos();

       Evento elegido = TicketMutxa.getEvento();



        for (Usuario usuario1 : TicketMutxa.usuariosRegistrados){
            if (!usuario1.equals(comprador)) {
                cola.add(usuario1);
            }
        }

        cola.add(comprador);

        int contador = cola.size() - 1;
        while (!cola.isEmpty()){

            Usuario actual = cola.peek(); // el primero

            if (actual.getNombre_usuaio().equals(comprador.getNombre_usuaio())) {
                System.out.println("🎉 ¡Es tu turno!");
                break;
            }

            System.out.println("⏳ Esperando... delante tienes a: " + actual.getNombre_usuaio());

            cola.poll(); // sale de la cola
            contador--;

        }
    }
}
