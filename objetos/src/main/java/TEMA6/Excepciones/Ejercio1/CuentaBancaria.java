package TEMA6.Excepciones.Ejercio1;

public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria() {
        this.saldo = 500;
    }

    public void ingresarDinero(double dar_platita){
        if (dar_platita > 3000){
            throw new DepositoMaximo();
        }else if (dar_platita <= 0){
            throw new ImporteMayor0();

        }
        this.saldo = saldo + dar_platita;
        System.out.println("Dinero ingresado con exito. Saldo actual " + saldo);
    }

    public void retirarDinero(double ret_platita){
        if (ret_platita > saldo){
            throw new SaldoInsuficiente();
        }else if (ret_platita > 600){
            throw new LimiteDiario();
        }else if (ret_platita <= 0){
            throw new ImporteMayor0();
        }
        this.saldo = saldo - ret_platita;
        System.out.println("Dinero retirado con exito. Saldo actual " + saldo);
    }
    public void consultarSaldo(){
        System.out.println("Este es tu saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
