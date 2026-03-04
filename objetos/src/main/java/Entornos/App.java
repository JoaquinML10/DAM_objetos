package Entornos;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Videojuegos juego = new Videojuegos("The Legend of Code", "PC", "Aventura", 2025, 59.99, 10);

        Cliente cliente = new Cliente(1, "Juan", "Pérez", "juan@email.com", LocalDate.now());

        System.out.println(juego);
        System.out.println(cliente);
    }
}
