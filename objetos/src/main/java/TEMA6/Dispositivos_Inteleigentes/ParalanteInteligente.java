package TEMA6.Dispositivos_Inteleigentes;

public class ParalanteInteligente extends Dispositivo{

    public ParalanteInteligente(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void encender() {

        if (super.isEstado()){
            System.out.println("El parlante ya esta encendido");
        }else {
            System.out.println("Activando parlante por comando de vos");
            super.setEstado(true);
        }
    }
}
