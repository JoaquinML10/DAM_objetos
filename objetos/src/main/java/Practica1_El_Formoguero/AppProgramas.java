package Practica1_El_Formoguero;

public class AppProgramas {
    static void main(String[] args) {

        Empleado empleado = new Empleado("1234", "joaquin", "nose");
        empleado.controlar_Cargo(empleado.getCargo());
        System.out.println(empleado);
    }
}
