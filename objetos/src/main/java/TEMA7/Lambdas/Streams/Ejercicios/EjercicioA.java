package TEMA7.Lambdas.Streams.Ejercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioA {
    static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Ana","Luis","Pedro","Antonio"));
        nombres.stream()
                .filter(nombre -> nombre.length() > 4)
                .forEach(System.out::println);
    }
}
