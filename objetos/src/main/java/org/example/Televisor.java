package org.example;

public class Televisor {
    private static final int DEF_CANAL = 1;
    private static final int DEF_VOLUMEN = 5;
    private int canal;
    private int volumen;

    public Televisor(int canal, int volumen){
        this.canal = canal;
        this.volumen = volumen;
    }
    public Televisor(){
        canal = DEF_CANAL;
        volumen = DEF_VOLUMEN;
    }
    public int getCanal(){
        return canal;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public void subircanal(){
        if (canal == 100){
            canal=1;
        }else {
            canal=canal+1;
        }
        System.out.println("Canal: " + canal);
    }
    public void bajarcanal(){
        if (canal == 0){
            canal=99;
        }else {
            canal=canal-1;
        }
        System.out.println("Canal: " + canal);
    }
    public void subirvolumen(){
        if (volumen < 100){
            volumen = volumen + 1;
        }
        System.out.println("Volumen: " + volumen);
    }
    public void bajarvolumen(){
        if (volumen>0){
            volumen=volumen-1;
        }
        System.out.println("Volumen: " + volumen);
    }
}
