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

    public void duplicados_Curso(Curso curso){
        for (Curso curso1 : listCurso ){
            if (curso1.getNombre().equals(curso.getNombre())){
                System.out.println("no se puede añadir");
            }else {
                System.out.println("Se agrego el curso");
                listCurso.add(curso);
            }
        }

    }

}
