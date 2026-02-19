package TEMA6.Excepciones.Ejercio1;

public class DepositoMaximo extends RuntimeException {
    public DepositoMaximo() {

        super("No puedes ingresar mas de 3000 €");
    }
}
