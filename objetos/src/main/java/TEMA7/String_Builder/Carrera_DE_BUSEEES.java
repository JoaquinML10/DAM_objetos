package TEMA7.String_Builder;

import java.util.Random;

public class Carrera_DE_BUSEEES {
    public static final int TAM = 97;

    public static void main(String[] args) throws InterruptedException {

        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS
        int b = 0;
        int c = 0;
        Random aleatorio = new Random();
        System.out.println("\n<<<<<<<<<< AUTOBUSITO >>>>>>>>>>");
        Thread.sleep(3000);

        while (a < TAM && b < TAM && c <TAM) {

             // avanzamos

            limpiarPantalla();

                int num = aleatorio.nextInt(0,6);
                if (num == 1) {
                    a++;
                } else if (num == 0) {
                    b++;
                }else if (num == 2) {
                    c++;
                }
            System.out.println(dibujarCarrera(a,b,c));
            Thread.sleep(70);

        }

        System.out.println("\033[32m" + "EL AUTOBUSITO HA LLEGADO A SU DESTINO!!" + "\033[0m");
        if (c > b && c > a){
            System.out.println("GANO EL SUPER GUAPOOOOO JOAQUINN");
        }else if (b > a && b > c) {
            System.out.println("GANO DAVID QUE ABURRIDO");
        } else if (a > b && a > c) {
            System.out.println("IRIS");
        }

    }

    public static String dibujarCarrera(int n1, int n2, int n3) {

        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("________________    ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|  IRIS ESPEJO    |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");

        sb.append("_".repeat(117)).append("\n");

        sb.append("-".repeat(117)).append("\n");

        sb.append(" ".repeat(n2)).append("________________    ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("| MAQUINA DAVID   |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");

        sb.append("_".repeat(117)).append("\n");

        sb.append("-".repeat(117)).append("\n");

        sb.append(" ".repeat(n3)).append("________________    ").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append(" ".repeat(n3)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append(" ".repeat(n3)).append("| JOAQUIN SUPER   |)").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append(" ".repeat(n3)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n3)).append("|\n");

        sb.append("_".repeat(117));

        return sb.toString();
    }



    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
