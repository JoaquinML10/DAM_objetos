package Practica_Recuperacion.Practica1;

import java.util.Set;

public interface Acciones {
    void pagar();
    boolean autenticarse(Set<Usuario> usuariosRegistrados);
}
