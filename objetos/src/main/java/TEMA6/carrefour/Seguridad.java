package TEMA6.carrefour;

import java.util.ArrayList;
import java.util.Scanner;

public class Seguridad extends Persona {

    static Scanner teclado = new Scanner(System.in);

    private String empresa;
    ArrayList<String> listaArmas;

    public Seguridad(int codigo, String nombre, double sueldo, String empresa) {
        super(codigo, nombre, sueldo);
        this.empresa = empresa;
        listaArmas = new ArrayList<>();
        setListaArmas();
    }

    public ArrayList<String> getListaArmas() {
        return listaArmas;
    }

    public void setListaArmas() {
        System.out.println("Introduce las armas");
        String armas = teclado.nextLine();
        listaArmas.add(armas);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa() {
        this.empresa = empresa;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El de saguridad trabaja en la empresa " + empresa + " y tiene un: ");
        for (String armas:listaArmas){
            System.out.println(armas);
        }
    }

    @Override
    public void trabajar() {
        System.out.println("Vigilar a sospechosos");
    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "empresa='" + empresa + '\'' +
                ", listaArmas=" + listaArmas +
                '}';
    }
}
