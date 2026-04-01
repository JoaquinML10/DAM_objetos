package Practica_Recuperacion.Practica1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Usuario implements Acciones {
    static Usuario comprador;
    private String nombre_usuaio;
    private String contrasenia;
    private HashMap<Evento, Integer> carritoCompra;

    public Usuario(String nombre_usuaio, String contrasenia) {
        this.nombre_usuaio = nombre_usuaio;
        this.contrasenia = contrasenia;
        this.carritoCompra = new HashMap<>();
    }

    public void anyadirAlCarrito(Evento evento, int cantidad){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas entradas quieres añadir, max 7");
        int entradas = teclado.nextInt();
    }
    public void verCarrito(){

    }

    public String getNombre_usuaio() {
        return nombre_usuaio;
    }

    public void setNombre_usuaio(String nombre_usuaio) {
        this.nombre_usuaio = nombre_usuaio;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public HashMap<Evento, Integer> getCarritoCompra() {
        return carritoCompra;
    }

    public void setCarritoCompra(Evento evento, int cantidad) {
        this.carritoCompra = carritoCompra;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre_usuaio='" + nombre_usuaio + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", carritoCompra=" + carritoCompra +
                '}';
    }

    @Override
    public void pagar() {

    }

    @Override
    public boolean autenticarse(Set<Usuario> usuariosRegistrados) {

        while (true) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Nombre del usuario: ");
            String nombre = teclado.next();
            System.out.println("Contraseña");
            String contra = teclado.next();
            for (Usuario usuario : usuariosRegistrados){
            if (usuario.nombre_usuaio.equals(nombre) && usuario.contrasenia.equals(contra)) {
               comprador = new Usuario(nombre,contra);
                System.out.println("BIENVENIDO");
                return true;
                }
            }
            System.out.println("Credenciales no validas");
        }
    }
}
