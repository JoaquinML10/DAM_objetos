package TEMA7.Ejercicios.FuncionarioyAceptaElReto;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class InformeApp {
    static Stack<Informe> pila = new Stack<>();
    static void main(String[] args) {


        Informe informe1 = new Informe(1, Tipo.ADMINISTRATIVO);
        Informe informe2 = new Informe(2, Tipo.EMPRESARIAL);
        Informe informe3 = new Informe(3, Tipo.PERSONAL);
        Informe informe4 = new Informe(4, Tipo.EMPRESARIAL);
        Informe informe5 = new Informe(5, Tipo.ADMINISTRATIVO);

        pila.push(informe1);
        pila.push(informe2);
        pila.push(informe3);
        pila.push(informe4);
        pila.push(informe5);


        System.out.println("Lista de informes");
        for (Informe informe: pila){
            System.out.println("Este es el informe: " + informe.getCodigo() + ", con la descripcion: " + informe.getDescripcion());
        }

        System.out.println("Eliminando informes y mostrando");
        while (!pila.isEmpty()){
            System.out.println(pila.pop());
            for (Informe informe: pila){
                System.out.println("Este es el informe: " + informe.getCodigo() + ", con la descripcion: " + informe.getDescripcion());
            }
        }

        Informe informe6 = new Informe(6, Tipo.ADMINISTRATIVO);
        Informe informe7 = new Informe(7, Tipo.PERSONAL);
        Informe informe8 = new Informe(7, Tipo.PERSONAL);


        pila.push(informe6);
        pila.push(informe7);
        pila.push(informe8);
        System.out.println("Eliminando informes y mostrando");
        while (!pila.isEmpty()){
            System.out.println(pila.pop());
            for (Informe informe: pila){
                System.out.println("Este es el informe: " + informe.getCodigo() + ", con la descripcion: " + informe.getDescripcion());
            }
        }
        pila.push(informe6);
        pila.push(informe7);
        pila.push(informe8);
        System.out.println("Contar tareas");
        System.out.println(contarTiposTarea());

    }

    public static int contarTiposTarea() {
        Set<String> tipos = new HashSet<>();

        for (Informe informe : pila) {
            tipos.add(informe.getCodigo() + ", " + informe.getDescripcion());
        }

        return tipos.size();
    }
}
