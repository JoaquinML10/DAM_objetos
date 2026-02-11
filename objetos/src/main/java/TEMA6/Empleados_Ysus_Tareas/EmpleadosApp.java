package TEMA6.Empleados_Ysus_Tareas;

import java.util.ArrayList;

public class EmpleadosApp {

    public static void asignarTarea(Empleados empleados){
        System.out.println("Asignando empleado...");
        empleados.realizarTarea();
    }

    static void main(String[] args) {

        Desarollador david = new Desarollador();
        Diseniador joaquin = new Diseniador();
        Gerente jacobo = new Gerente();

        ArrayList<Empleados> listaempleados = new ArrayList<>();

        listaempleados.add(david);
        listaempleados.add(joaquin);
        listaempleados.add(jacobo);

        for (Empleados empleados : listaempleados){
            empleados.realizarTarea();
        }

        Empleados jorge = new Empleados();
          asignarTarea(jorge);

    }
}
