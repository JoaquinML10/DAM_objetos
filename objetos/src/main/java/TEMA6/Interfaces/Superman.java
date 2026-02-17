package TEMA6.Interfaces;

public class Superman extends Superheroe implements Volador,Ataques{
    @Override
    public void volar() {
        System.out.println("Sobrevolando la ciudad vigilando a jorge...");
    }

    @Override
    public void rayolaser() {
        System.out.println("Disparando raoy laser");
    }

    @Override
    public void alientohielo() {
        System.out.println("Contagiando el mal aliento");
    }
}
