package TEMA6.Dispositivos_Inteleigentes;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televiosr con el control remoto");
    }

    @Override
    public void encender() {

        if (super.isEstado()) {
            System.out.println("El televisor ya esta encendido");
        }else {
            System.out.println("Encendiendo televisor...");
            super.setEstado(true);
        }
    }
}
