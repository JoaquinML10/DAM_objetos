package TEMA7.Iteradores;

import java.time.LocalDate;

public class Reserva {
    private Usuario usuario;
    private Pista pista;
    private LocalDate fecha_hora;

    public Reserva(Usuario usuario, Pista pista) {
        this.usuario = usuario;
        this.pista = pista;
        this.fecha_hora = fecha_hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public LocalDate getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "usuario=" + usuario +
                ", pista=" + pista +
                ", fecha_hora=" + fecha_hora +
                '}';
    }


}
