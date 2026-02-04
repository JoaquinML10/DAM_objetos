package insti;


import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
public class Curso {

    @NonNull
    private String nombre;
    private int horas;

}
