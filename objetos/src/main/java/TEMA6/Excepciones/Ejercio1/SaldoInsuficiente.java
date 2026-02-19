package TEMA6.Excepciones.Ejercio1;

public class SaldoInsuficiente extends RuntimeException {

    public SaldoInsuficiente() {

        super("No tienes saldo suficiente");
    }
}
