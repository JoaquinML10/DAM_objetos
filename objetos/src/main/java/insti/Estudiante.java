package insti;

import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;


}
