package TEMA6.Practica2;

public class DorsaLIgual extends RuntimeException {
    public DorsaLIgual() {
        super("No puede haber dos jugadores con el mismo numero");
    }
}
