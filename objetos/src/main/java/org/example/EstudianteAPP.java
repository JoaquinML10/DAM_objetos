package org.example;

public class EstudianteAPP {
    static void main(String[] args) {
        Estudiante jorge = new Estudiante("jorge", "1DAM","jorgu@iesmutxamel.com");
        System.out.println(jorge.getNia());
        Estudiante raul = new Estudiante("Raul");

        System.out.println(raul.getNia());
        System.out.println(jorge);

        Libro divina_comedia = new Libro("divina comedia", "dante");

        divina_comedia.getEstudiantePrestado();
        divina_comedia.prestar(jorge);

        System.out.println(divina_comedia);
    }
}
