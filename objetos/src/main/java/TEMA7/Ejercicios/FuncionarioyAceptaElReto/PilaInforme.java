package TEMA7.Ejercicios.FuncionarioyAceptaElReto;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;

public class PilaInforme {
    Stack<Informe> pila = new Stack<>();

    public void aniadirInforme(Informe informe){
        pila.push(informe);
    }

    public void quitarInfomr() {
        if (!pila.isEmpty()){
            System.out.println("Eliminando informe: " + pila.pop());
        }else {
            System.out.println("La lista de informes esta vacia");
        }
    }

    public void mostrarInformes(){
        System.out.println("Informes restantes");
        for (Informe informe : pila){
            System.out.println("Este es el informe: " + informe.getCodigo() + ", con la descripcion: " + informe.getDescripcion());
        }
    }

    public int contarTiposTarea() {
        Set<String> tipos = new HashSet<>();

        for (Informe informe : pila) {
            tipos.add(informe.getCodigo() + ", " + informe.getDescripcion());
        }

        return tipos.size();
    }
}
