package TEMA6.carrefour;

import java.util.ArrayList;
import java.util.Objects;

public class Empleados {
    static void main(String[] args) {

        Cajero jorge = new Cajero(147, "Jorge", 1800);

        jorge.mostrarInfo();

        Seguridad david = new Seguridad(212, "david", 1222, "davidelreparador");

        david.mostrarInfo();

        Persona manuel = new Cajero(1232, "Manuel", 2000);
        ArrayList<Persona> listaempleados = new ArrayList<>();

        listaempleados.add(manuel);
        listaempleados.add(david);

        for (Persona persona : listaempleados) {

        }
        fichar(manuel);
        fichar(david);

        jorge.trabajar();
        david.trabajar();
        manuel.trabajar();

    }
    public static void fichar(Persona persona){

        System.out.println("Fichando...");

    }
}
