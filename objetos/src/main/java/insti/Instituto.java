package insti;

import lombok.*;
import java.util.ArrayList;
import java.util.Objects;

//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
//@Data

@Getter @Setter @ToString
public class Instituto {

//@NonNull
    private String nombre;
    private String poblacion;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Curso> listCurso;

    public Instituto(String nombre){
        this.nombre = nombre;
        listaEstudiantes = new ArrayList<>();
        listCurso = new ArrayList<>();
    }
    public void setNombre(String nombre){
        this.nombre = Objects.requireNonNullElse(nombre,"IES");

    }

    public void agregarCurso(Curso curso){
        if (curso == null){
            System.out.println("No se puede agregar este curso porque esta null esta null");
            return;
        }

        for (Curso curso1 : listCurso ){
            if (curso1.getNombre().equals(curso.getNombre())){
                System.out.println("no se puede añadir");
                return;
            }
        }
        System.out.println("Se agrego el curso");
        listCurso.add(curso);
    }

    public void agregarEstudiante(Estudiante estudiante){

        if (estudiante == null){
                System.out.println("No se puede agregar un estudiante que esta null");
                return;
            }
        System.out.println("El estudiante se agrego coorrectamente");
        listaEstudiantes.add(estudiante);

    }



}
