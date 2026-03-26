package TEMA7.Lambdas.Ejercicio.Ejercicio2;

public class Programa {
    static void main(String[] args) {
        VerificadorVoto voto = (nombre, edad) -> {
          boolean mayor = true;
            if (edad >= 18) {
              mayor = true;
          }else {
              mayor = false;
          }
            System.out.print("Probando Maria con " + edad + " años... ");
            return mayor;
        };

        System.out.println(voto.puedeVotar("Jacoboo", 20));
        System.out.println(voto.puedeVotar("Jacoboo", 10));
    }
}
