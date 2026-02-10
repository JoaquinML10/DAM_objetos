package TEMA6.carrefour;

public class Empleados {
    static void main(String[] args) {

        Cajero jorge = new Cajero(147,"Jorge",1800);

        jorge.mostrarInfo();

        Seguridad david = new Seguridad(212, "david", 1222, "davidelreparador");

        david.mostrarInfo();
    }
}
