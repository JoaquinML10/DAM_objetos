package TEMA7.Iteradores;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListaIteradorPrueba {
    static void main(String[] args) {
        ArrayList<String> chat = new ArrayList<>(Arrays.asList("ChatGPT","Geminis","SeepSeek","Copilot","Perplexity"));

        ListIterator<String> it = chat.listIterator();

        while (it.hasNext()){
            System.out.println(it.nextIndex());
            String ia = it.next();
            System.out.println(it.nextIndex());
            System.out.println(ia);
        }

        while (it.hasPrevious()){
            System.out.println(it.previousIndex());
            String ia = it.previous();

            if (ia.equals("SeepSeek")){
                it.add("Claude");
            }
            System.out.println(it.previousIndex());
            System.out.println(ia);
        }


    }
}
