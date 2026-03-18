package TEMA7.Comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparables {
    static  List<Integer> lista = new ArrayList<>();
    static void main(String[] args) {



        lista.add(324);
        lista.add(2);

    }

    public static List<Integer> getList(){
        return Collections.unmodifiableList(lista);
    }
}
