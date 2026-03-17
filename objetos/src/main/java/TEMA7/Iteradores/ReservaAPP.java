package TEMA7.Iteradores;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ReservaAPP {
    static HashMap<Usuario, HashSet<Reserva>> mapa = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {

    }
    public static void eliminar (HashSet<Reserva> listaReserva){
        System.out.println("Que pistas quieres borrar");
        String pista = teclado.next().toLowerCase();

        Iterator<Reserva> it = listaReserva.iterator();
        while (it.hasNext()){
            Reserva reserva = it.next();
            if (reserva.getPista() instanceof Tenis && pista.equals("tenis")){
                it.remove();
            } else if (reserva.getPista() instanceof  Padel && pista.equals("padel")) {
                it.remove();

            }
        }
    }

    public static HashSet<Reserva> reservasUusario (Usuario usuario){
        return mapa.get(usuario);
    }

    public static void Crear(Usuario usuario, Pista pista){

        Reserva reserva = new Reserva(usuario, pista);

        HashSet<Reserva> lista = reservasUusario(usuario);

        if (lista.contains(reserva)){
            throw new Dupliucado("DUPLICADO");
        }else {
            lista.add(reserva);
            mapa.put(usuario,lista);
        }
    }
}


