package TEMA6.Practica2;

import java.util.Scanner;

import static TEMA6.Practica2.Jugador.listaJugadores;

public class AppMantenimiento {
    public static Scanner teclado = new Scanner(System.in);

    static void main(String[] args) {
        Jugador Joaquin = new Jugador("Joaquin",18,Equipos.SENIOR,10,Posiciones.CENTROCAMPISTA);
        Jugador Jacobo = new Jugador("Jacobo",20,Equipos.SENIOR,1,Posiciones.PORTERO);
        Jugador Jorge = new Jugador("Jorgito",20,Equipos.ALEVIN,1,Posiciones.PORTERO);
        char op = 'x';
        char op2 = 'x';
        do {
            System.out.println("=== App de mantenimiento del River Plate ===");
            System.out.println();
            System.out.println("    [1]. Mantenimiento de jugadores");
            System.out.println("        Dentro podemos añdir Jugadores, modificar datos, y añadir acompañantes (solo seniors).");
            System.out.println("    [2]. Mantenimiento de entrenador");
            System.out.println("        Dentro podremos añadir entrenadores y modificar sus datos.");
            System.out.println("    [3]. Mantenimiento de masajista");
            System.out.println("        Dentro podemos añadir masajistas y modificar sus datos.");
            System.out.println("    [4]. Consultar equipos");
            System.out.println("        Dentro se deben listar los tipos de equipos del club y elejir uno");
            System.out.println("    [X]. Salir");
            System.out.println();
            System.out.println("============================================");
            System.out.println();
            System.out.print("Selecciona una opcion --> ");
            op = teclado.next().toUpperCase().charAt(0);
            switch (op) {
                case '1':
                    do {
                        System.out.println("=== Mantenimiento de jugadores ===");
                        System.out.println();
                        System.out.println("    [1]. Añadir nuevo jugador");
                        System.out.println("    [2]. Modificar datos de jugadores ya existentes");
                        System.out.println("    [3]. Crear acompañante (solo seniors)");
                        System.out.println("    [X]. Volver al menu principal");
                        System.out.println();
                        System.out.println("==================================");
                        System.out.print("Selecciona una opcion -->  ");
                        op2 = teclado.next().toUpperCase().charAt(0);
                        switch (op2) {
                            /**
                             * Le preguntamos todos los datos del jugador nuevo que quiere crear
                             * y si hay uno con el mismo numero salta la exepcion de la clase Jugador
                             */
                            case '1':
                                System.out.println("=== Mantenimiento de jugadores. Crea tu jugador a tu gusto ===");
                                System.out.println();
                                System.out.print("Pon el nombre de tu nuevo jugador: ");
                                String nombre = teclado.next();
                                System.out.print("Pon la edad de tu jugador: ");
                                int edad = teclado.nextInt();
                                System.out.print("Pon en la categoria que va a jugar tu jugador " + nombre + ": ");
                                Equipos equipos = Equipos.valueOf(teclado.next());
                                System.out.print("Ahora que dorsal quieres que lleve tu jugador: ");
                                Integer dorsal = teclado.nextInt();
                                System.out.print("Solo falta la posicion de tu jugador:  ");
                                Posiciones posiciones = Posiciones.valueOf(teclado.next());
                                System.out.println();
                                System.out.println("jugador: [Nombre: " + nombre + ", Edad: " + edad + ", Categoria: " + equipos + ", Dorsal: " + dorsal + ", Posicion: " + posiciones + "]");
                                Jugador jugador = new Jugador(nombre, edad, equipos, dorsal, posiciones);
                                System.out.println();
                                break;
                            case '2':
                                System.out.println("=== Mantenimiento de jugadores. Modificar datos de jugadores ===");
                                System.out.println();
                                System.out.println("¿De que jugador quieres hacer cambios?");
                                int contador = 0; // lo usamos para ver en que posicion en la lista estan los jugadores
                                for (Jugador jugador1 : listaJugadores) {
                                    System.out.println("[" + contador + ", Nombre: " + jugador1.getNombre() + ", Edad: " + jugador1.getEdad() + ", Categoria: " + jugador1.getCategoria() + ", Dorsal: " + jugador1.getDorsal() + ", Posicion: " + jugador1.getPosicion() + "]");
                                    contador++;
                                }
                                System.out.println();
                                System.out.println("================================================================");
                                System.out.println();
                                System.out.println("Selecciona una opcion -->  ");
                                int eleccion = teclado.nextInt();
                                System.out.println();
                                System.out.println("=== Mantenimiento de jugadores. Modificar datos de jugadores ===");
                                System.out.println();
                                System.out.println("Modificando jugador: [Nombre: " + listaJugadores.get(eleccion).getNombre() + ", Edad: " + listaJugadores.get(eleccion).getEdad() + ", Categoria: " + listaJugadores.get(eleccion).getCategoria() + ", Dorsal: " + listaJugadores.get(eleccion).getDorsal() + ", Posicion: " + listaJugadores.get(eleccion).getPosicion() + "]");
                                System.out.println();
                                System.out.println("¿Que quieres modificar? [nombre,edad,categoria,dorsal,posicion]: ");
                                System.out.println();
                                System.out.println("================================================================");
                                System.out.println();
                                System.out.println("Seleccion la opcion --> ");
                                String opcion = teclado.next().toLowerCase();
                                System.out.println();
                                System.out.println("=== Mantenimiento de jugadores. Modificar datos de jugadores ===");
                                System.out.println();
                                System.out.println("Modificando jugador: [Nombre: " + listaJugadores.get(eleccion).getNombre() + ", Edad: " + listaJugadores.get(eleccion).getEdad() + ", Categoria: " + listaJugadores.get(eleccion).getCategoria() + ", Dorsal: " + listaJugadores.get(eleccion).getDorsal() + ", Posicion: " + listaJugadores.get(eleccion).getPosicion() + "]");
                                System.out.println();
                                System.out.println("================================================================");
                                System.out.println();
                                System.out.print("Nuevo " + opcion + " --> "); //Le preguntamos que parte del jugador quiere modificar
                                boolean cambio_con_exito = true;
                                /**
                                 * El usuario introduce el nuevo dato que le quiere modificar
                                 */
                                switch (opcion.toUpperCase()) {
                                    case "NOMBRE":
                                        String nuevo_nombre = teclado.next();
                                        listaJugadores.get(eleccion).setNombre(nuevo_nombre);
                                        break;
                                    case "EDAD":
                                        int nueva_edad = teclado.nextInt();
                                        listaJugadores.get(eleccion).setEdad(nueva_edad);
                                        break;
                                    case "CATEGORIA":
                                        Equipos categoria_nueva = Equipos.valueOf(teclado.next());
                                        for (Jugador jugador1 : listaJugadores) {
                                            if (jugador1.getDorsal() == listaJugadores.get(eleccion).getDorsal()) {//compreuba que el numero que elejiste no tenga el mismo numero que otro jugador
                                                if (jugador1.getCategoria().equals(categoria_nueva)) { //comprueba que el jugador no sea del mismo equipo
                                                    System.out.println("¡Lo siento! No puedes cambiar al jugador de categoria porque hay un jugador que tiene su mismo dorsal");
                                                    cambio_con_exito = false;
                                                }
                                            }
                                        }
                                        if (cambio_con_exito)//si esta todo correcto lo añade a la lista
                                            listaJugadores.get(eleccion).setCategoria(categoria_nueva);
                                        break;
                                    case "DORSAL":
                                        Integer dorsal_nuevo = teclado.nextInt();
                                        for (Jugador jugador1 : listaJugadores) {
                                            if (jugador1.getDorsal() == dorsal_nuevo) {//comprueba que el jugador no sea del mismo equipo
                                                if (jugador1.getCategoria().equals(listaJugadores.get(eleccion).getCategoria())) {//compreuba que el numero que elejiste no tenga el mismo numero que otro jugador
                                                    System.out.println("¡Lo siento! Este dorsal ya esta ocupado por un jugador del mismo equipo (" + jugador1.getCategoria() + ")");
                                                    cambio_con_exito = false;
                                                }
                                            }
                                        } //si esta todo correcto lo añade a la lista
                                        if (cambio_con_exito) listaJugadores.get(eleccion).setDorsal(dorsal_nuevo);
                                        break;
                                    case "POSICION":
                                        Posiciones nueva_posicion = Posiciones.valueOf(teclado.next());
                                        listaJugadores.get(eleccion).setPosicion(nueva_posicion);
                                        break;
                                    default:
                                }
                                System.out.println();
                                if (cambio_con_exito) {//si esta todo correcto te muestra al nuevo jugador y si no te saca del programa
                                    System.out.println("Jugador modificado con exito");
                                    System.out.println("[Nombre: " + listaJugadores.get(eleccion).getNombre() + ", Edad: " + listaJugadores.get(eleccion).getEdad() + ", Categoria: " + listaJugadores.get(eleccion).getCategoria() + ", Dorsal: " + listaJugadores.get(eleccion).getDorsal() + ", Posicion: " + listaJugadores.get(eleccion).getPosicion() + "]");
                                } else {
                                    return;
                                }
                                break;
                            /**
                             * Te pregunta los datos del nuevo acompañante
                             */
                            case '3':
                                System.out.println("=== Mantenimiento de jugadores. Crear acompañante ===");
                                System.out.println();
                                System.out.print("Pon el nombre de tu acompañante: ");
                                String nombre_aco = teclado.next();
                                System.out.print("Pon la edad de tu acompañante: ");
                                int edad_aco = teclado.nextInt();
                                System.out.println("Pon a que jugador va a acompañar:");
                                contador = 0;
                                for (Jugador jugador1 : listaJugadores) {
                                    System.out.println("[" + contador + ", Nombre: " + jugador1.getNombre() + ", Edad: " + jugador1.getEdad() + ", Categoria: " + jugador1.getCategoria() + ", Dorsal: " + jugador1.getDorsal() + ", Posicion: " + jugador1.getPosicion() + "]");
                                    contador++;
                                }
                                int jugador_acompaniante = teclado.nextInt();
                                System.out.print("Que parentesco tienes con el jugador:");
                                String parentesco = teclado.next();
                                if (listaJugadores.get(jugador_acompaniante).getCategoria().equals(Equipos.SENIOR)) { //Si el jugador no es de la categoria SENIOR no lo añade
                                    System.out.println("El acompañante se creo correctamente");
                                    Acompaniante acompaniante = new Acompaniante(nombre_aco, edad_aco, listaJugadores.get(jugador_acompaniante), parentesco);
                                    System.out.println();
                                }else {
                                    System.out.println("¡Lo siento! No puedes crear este acompañante porque el jugador no juega en SENIOR");
                                    System.out.println();
                                }
                                break;
                            case 'X':
                                break;
                            default:
                                System.out.println("Ninguna de las opciones es correcta bay bay, vuelve a intentar");
                        }
                    } while (op2 != 'X');
                    break;
                case '2':
                case '3':
                case '4':
                    System.out.println("Si argentina gana el mundial lo termino");
                    break;
                case 'X':
                    System.out.println("Chau gracias por probar");
                    break;
                default:
                    System.out.println("Ninguna de las opciones es correcta bay bay");
                    return;
            }
        }while (op != 'X');
    }
}
