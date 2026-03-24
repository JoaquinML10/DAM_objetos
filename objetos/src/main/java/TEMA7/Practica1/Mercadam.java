package TEMA7.Practica1;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mercadam {
    private Set<Cliente> clientes = new HashSet<>();

    public Mercadam() {

        this.clientes = clientes;
    }

    public void generarClientes(){

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
