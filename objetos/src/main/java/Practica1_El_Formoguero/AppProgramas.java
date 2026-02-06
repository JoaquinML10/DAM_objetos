package Practica1_El_Formoguero;

public class AppProgramas {

    public static void main(String[] args) {

        Cadena c1 = new Cadena("Antena 3");
        Programa p1 = new Programa("El Hormiguero", c1, "Pablo");
        Programa p2 = new Programa("La Rebelion", c1, "David");


        p1.aniadir_empleado("Juan", "tecnico", null);
        p1.aniadir_empleado("Maria", "presentador", null);

        p2.aniadir_empleado("Luis", "colaborador", null);

        p1.aniadir_invitado("Ana", "Actriz", 1);
        p1.aniadir_invitado("Ana", "Actriz", 2);
        p1.aniadir_invitado("Carlos", "Cantante", 1);

        p2.aniadir_invitado("Ana", "Actriz", 1);

        System.out.println("Invitados temporada 1 en p1");
        p1.invitado_Tempoarada(1);

        System.out.println("Veces que Ana vino a p1");
        System.out.println(p1.vecesInvitado("Ana"));

        System.out.println("Registrar Ana en p1");
        p1.rastrearInvitado("Ana");

        System.out.println("Fecha mas antigua de Ana en p1 ");
        p1.invitadoAntes("Ana");

        System.out.println("Mostrar cadena");
        System.out.println(c1);
        System.out.println();
        System.out.println("Mostrar programas");
        System.out.println(p1);
        System.out.println(p2);


    }
}
