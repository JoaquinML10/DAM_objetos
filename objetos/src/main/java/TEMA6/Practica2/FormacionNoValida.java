package TEMA6.Practica2;

public class FormacionNoValida extends RuntimeException {
    public FormacionNoValida() {
        super("La formacion que has introducido no es valida");
    }
}
