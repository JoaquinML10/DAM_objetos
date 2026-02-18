package TEMA6.Prueba_enum.Ejercicios.Semaforo;

public class SemaforoApp {
    static void main(String[] args) {

        Semaforo siguiente = Semaforo.ROJO;

        for (int i = 0; i < 10; i++) {
            System.out.println("Color semaforo: " + siguiente.name() );
            siguiente = siguiente.siguiente();
        }

    }
}
