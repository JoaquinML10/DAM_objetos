package org.example;

public class PacienteAPP {
    static void main(String[] args) {
        Paciente jacobo = new Paciente("jacobo",20,'M',110,179);
        System.out.println(jacobo.getNombre());
        System.out.println(jacobo.getDNI());
        System.out.println(jacobo.getEdad());
        System.out.println(jacobo.getGenero());
        System.out.println(jacobo.getPeso());
        System.out.println(jacobo.getAltura());
        System.out.println(jacobo.calcularIMC());
    }
}
