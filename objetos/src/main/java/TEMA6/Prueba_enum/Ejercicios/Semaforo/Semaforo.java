package TEMA6.Prueba_enum.Ejercicios.Semaforo;

public enum Semaforo {
    AMARILLO, ROJO, VERDE;

    public Semaforo siguiente() {
        switch (this) {
            case AMARILLO -> {
                return ROJO;
            }
            case ROJO -> {
                return VERDE;
            }
            case VERDE -> {
                return AMARILLO;
            }
        }
        return AMARILLO;
    }
}
