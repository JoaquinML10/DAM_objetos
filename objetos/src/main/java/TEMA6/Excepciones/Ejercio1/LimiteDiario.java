package TEMA6.Excepciones.Ejercio1;

public class LimiteDiario extends RuntimeException {
    public LimiteDiario() {

        super("No puedes Retirar mas de 600 €");
    }
}
