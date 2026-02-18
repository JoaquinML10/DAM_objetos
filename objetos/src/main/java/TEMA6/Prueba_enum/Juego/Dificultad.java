package TEMA6.Prueba_enum.Juego;

public enum Dificultad {

    FACIL(2),MEDIO(4),DIFICIL(8),EXPERTO(10);

    private final double multiplicador;

    Dificultad(double multiplicador){
        this.multiplicador=multiplicador;
    }

    public double getMultiplicador() {
        return multiplicador;
    }


}
