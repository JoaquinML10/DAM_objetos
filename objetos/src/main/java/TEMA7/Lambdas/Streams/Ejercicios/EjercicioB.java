package TEMA7.Lambdas.Streams.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioB {
    static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("ANA","LUIS","PEDRO","ANTONIO"));
        List<String> nombresMinusculas = nombres.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(nombresMinusculas);
    }
}
