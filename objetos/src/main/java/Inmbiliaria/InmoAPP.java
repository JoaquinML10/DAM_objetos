package Inmbiliaria;

public class InmoAPP {
    public static void main(String[] args) {
        Casa pisito = new Casa("Calle Falsa 234");

        System.out.println(pisito.getPropietario());

        pisito.crearHabitacion("Cocina", 20);
        pisito.crearHabitacion("baño", 7);
        pisito.crearHabitacion("dormitorio", 21);
        pisito.crearHabitacion("dormitorio", 28);
        System.out.println(pisito.getListahabitaciones());

        pisito.mostrarHabitacion();
        System.out.println("La habitacion mas grande es " + pisito.getHabitacionMasGrande().getNombre());

        pisito.eliminarHabitaciones("baño");
        pisito.mostrarHabitacion();
        pisito.eliminarHabitaciones("baño");
    }
}
