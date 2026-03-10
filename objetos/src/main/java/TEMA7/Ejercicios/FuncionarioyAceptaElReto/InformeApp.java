package TEMA7.Ejercicios.FuncionarioyAceptaElReto;

public class InformeApp {
    static void main(String[] args) {
        PilaInforme pilaInforme = new PilaInforme();

        Informe informe1 = new Informe(1, Tipo.ADMINISTRATIVO);
        Informe informe2 = new Informe(2, Tipo.EMPRESARIAL);
        Informe informe3 = new Informe(3, Tipo.PERSONAL);
        Informe informe4 = new Informe(4, Tipo.EMPRESARIAL);
        Informe informe5 = new Informe(5, Tipo.ADMINISTRATIVO);

        pilaInforme.aniadirInforme(informe1);
        pilaInforme.aniadirInforme(informe2);
        pilaInforme.aniadirInforme(informe3);
        pilaInforme.aniadirInforme(informe4);
        pilaInforme.aniadirInforme(informe5);

        System.out.println("Lista de informes");
        pilaInforme.mostrarInformes();

        System.out.println("Eliminando informes y mostrando");
        while (!pilaInforme.pila.isEmpty()){
            pilaInforme.quitarInfomr();;
            pilaInforme.mostrarInformes();
        }

        Informe informe6 = new Informe(6, Tipo.ADMINISTRATIVO);
        Informe informe7 = new Informe(7, Tipo.PERSONAL);
        Informe informe8 = new Informe(7, Tipo.PERSONAL);


        pilaInforme.aniadirInforme(informe6);
        pilaInforme.aniadirInforme(informe7);
        pilaInforme.aniadirInforme(informe8);

        System.out.println("Eliminando informes y mostrando");
        while (!pilaInforme.pila.isEmpty()){
            pilaInforme.quitarInfomr();;
            pilaInforme.mostrarInformes();
        }
        pilaInforme.aniadirInforme(informe6);
        pilaInforme.aniadirInforme(informe7);
        pilaInforme.aniadirInforme(informe8);
        System.out.println("Contar tareas");
        System.out.println(pilaInforme.contarTiposTarea());

    }
}
