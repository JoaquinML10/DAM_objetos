package TEMA7.Lambdas.Streams.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioC {
    static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("ANA", "LUIS", "PEDRO", "ANTONIO"));
        long cantidad = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .count();

        System.out.println("Los nobres Que empiezan con la letra A hay: " + cantidad);
    }
}
