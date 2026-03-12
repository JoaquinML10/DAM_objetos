package TEMA7.Iteradores;

import org.example.Paciente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteradoresObjetos {
    static void main(String[] args) {
        ArrayList<Paciente> lista = new ArrayList<>(Arrays.asList(
                new Paciente("francisco",10,'M',20.0,10),
                new Paciente("francisca",10,'M',20.0,10))
        );
        Iterator<Paciente> it = lista.iterator();
        while (it.hasNext()){
            Paciente paci = it.next();
            if (paci.getNombre().equals("fransisco")){
                it.remove();
            }
        }
        System.out.println(lista);
    }
}
