package TEMA7.Practica1;

import java.util.*;

public class Mercadam {
    private Set<Cliente> clientes = new HashSet<>();

    public Mercadam() {

        this.clientes = new HashSet<>();
    }


    /**
     * Le pasamos el numero de cuantos clientes quiere crear
     * y genera aleatoriamente un usuario y una contraseña
     * @param num
     */
    public void generarClientes(int num){
        Random aleatorio = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";


        for (int i = 0; i < num; i++) {
            String usuario = "";
            String contrasenia = "";
            for (int j = 0; j < 8; j++) {
                usuario += caracteres.charAt(aleatorio.nextInt(0,caracteres.length()));
                contrasenia += caracteres.charAt(aleatorio.nextInt(0,caracteres.length()));
            }
            Cliente cliente = new Cliente(usuario, contrasenia);
            clientes.add(cliente);
        }

        System.out.println(clientes);
    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Mercadam{" +
                "clientes=" + clientes +
                '}';
    }
}
