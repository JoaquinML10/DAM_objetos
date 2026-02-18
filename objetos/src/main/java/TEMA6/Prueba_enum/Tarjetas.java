package TEMA6.Prueba_enum;

public enum Tarjetas {
    MAESTRO(0), VISA(1.5), MASTERCARD(5);

    private final double comision;

    Tarjetas(double comision){
        this.comision=comision;
    }

    public double getComision(){
        return comision;
    }
}
