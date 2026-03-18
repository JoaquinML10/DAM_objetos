package TEMA7.Comparables;

import java.util.*;

public class CumpleApp {
    static void main(String[] args) {
        List<Invitado> invitados = new ArrayList<>();

        invitados.add(new Invitado(10, "Jacobo"));
        invitados.add(new Invitado(14, "David"));
        invitados.add(new Invitado(14, "Joaquin"));

        Collections.sort(invitados, new OrdenarPorEdadNombreHora().reversed());

        System.out.println(invitados);

        TreeMap<Invitado,String> mapaInvitados = new TreeMap<>(Comparator.reverseOrder());

        mapaInvitados.put(new Invitado(10, "Jacobo"),"Raqueta");
        mapaInvitados.put(new Invitado(14, "David"),"500€");
        mapaInvitados.put(new Invitado(14, "Joaquin"),"Charla con Milei");

        List<Map.Entry<Invitado,String>> listaMapa = new ArrayList<>(mapaInvitados.entrySet());

        listaMapa.sort(Map.Entry.comparingByKey());
        for (Map.Entry<Invitado, String> mapita : listaMapa){
            System.out.println(mapita.getKey().getNombre() + " " + mapita.getValue());
        }

    }
}
