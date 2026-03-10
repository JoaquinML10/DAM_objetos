package TEMA7.Ejercicios.FuncionarioyAceptaElReto;

import java.util.Stack;

public class Informe {
    private int codigo;
    private Tipo descripcion;

    public Informe(int codigo, Tipo descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tipo getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Tipo descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", descripcion=" + descripcion +
                '}';
    }

}
