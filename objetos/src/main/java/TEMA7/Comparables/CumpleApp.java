package TEMA7.Comparables;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CumpleApp {
    static void main(String[] args) {
        List<Invitado> invitados = new ArrayList<>();

        invitados.add(new Invitado(10, "Jacobo"));
        invitados.add(new Invitado(14, "David"));
        invitados.add(new Invitado(14, "Joaquin"));

        Collections.sort(invitados, new OrdenarPorEdadNombreHora().reversed());

        System.out.println(invitados);

    }
}
