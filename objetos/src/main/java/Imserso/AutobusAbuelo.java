package Imserso;

import java.util.ArrayList;

public class AutobusAbuelo {


    private String matricula;
    private String destino;
    private ArrayList<Abuelo> listabualeo;

    public AutobusAbuelo(String matricula, String destino){
        this.matricula=matricula;
        this.destino=destino;
        listabualeo = new ArrayList<>();
    }

    public void insertar_abuelo(Abuelo abuelo){
        listabualeo.add(abuelo);
    }

    public void borrar_abuelo(Abuelo abuelo){
        listabualeo.remove(abuelo);
    }

    public void mostrarabuelos(){
        System.out.println("Abuelos del auyobus con matricula " + matricula + ": " );
        for (Abuelo abuelo:listabualeo){
            System.out.println("- " + abuelo.getNombre() + " de " + abuelo.getEdad());
        }
    }

    public void  mostrarmayores(int edad){

        System.out.println("Abuelos mayores a " + edad + " años: ");

        for (Abuelo abuelo : listabualeo){
            if (abuelo.getEdad()>=edad){
                System.out.println("pueden pasar");
            }
        }
        for (int i = 0; i < listabualeo.size(); i++) {
            System.out.println("- " + listabualeo.get(i).getNombre());
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<Abuelo> getListabualeo() {
        return listabualeo;
    }

    public void setListabualeo(ArrayList<Abuelo> listabualeo) {
        this.listabualeo = listabualeo;
    }


    @Override
    public String toString() {
        return "AutobusAbuelo{" +
                "matricula='" + matricula + '\'' +
                ", destino='" + destino + '\'' +
                ", listabualeo=" + listabualeo +
                '}';
    }


}
