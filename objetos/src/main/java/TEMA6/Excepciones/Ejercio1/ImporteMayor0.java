package TEMA6.Excepciones.Ejercio1;

public class ImporteMayor0 extends RuntimeException {
    public ImporteMayor0() {

        super("El importe que has introducido es menor que 0");
    }
}
