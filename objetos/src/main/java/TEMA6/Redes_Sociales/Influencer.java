package TEMA6.Redes_Sociales;

import java.util.ArrayList;
import java.util.Scanner;

public class Influencer extends Usuario {
    Scanner teclado = new Scanner(System.in);
    private ArrayList<String> listaColaboraciones;

    public Influencer(String nombre, int edad, String userName, int seguidores) {
        super(nombre, edad, userName, seguidores);
        listaColaboraciones = new ArrayList<>();
        setListaColaboraciones();
    }

    public ArrayList<String> getListaColaboraciones() {
        return listaColaboraciones;
    }

    public void setListaColaboraciones() {
        System.out.println("Introduce las colaboraciones");
        String colaboraciones = teclado.nextLine();
        listaColaboraciones.add(colaboraciones);
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        for (String colaboraciones : listaColaboraciones){
            System.out.println(colaboraciones);
        }
    }

    @Override
    public String toString() {
        return "Influencer{" +
                "listaColaboraciones=" + listaColaboraciones +
                '}';
    }
}
