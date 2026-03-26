package TEMA7.Lambdas.Ejercicio.Ejercicio1;

public class Programa {
    static void main(String[] args) {

        Ejecutor ejecutor = numero -> {
          if (numero > 10) return true;
          else return false;
        };
        System.out.println(ejecutor.ejecutar(11));
    }

}
