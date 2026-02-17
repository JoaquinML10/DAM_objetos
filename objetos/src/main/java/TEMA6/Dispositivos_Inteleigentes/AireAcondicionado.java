package TEMA6.Dispositivos_Inteleigentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{

    AireAcondicionado(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto");
    }

    @Override
    public void encender() {
        if (super.isEstado()) {
            System.out.println("El aire acondicionado ya esta encendido");
        }else {
            System.out.println("Encendiendo aire acondicionado...");
            super.setEstado(true);
        }
    }
}
