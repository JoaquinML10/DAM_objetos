package TEMA6.Dispositivos_Inteleigentes;

import java.util.ArrayList;

public class DispositivosApp {

    static void main(String[] args) {
        ArrayList<Dispositivo> listadispositivos = new ArrayList<>();
        Televisor tv = new Televisor("Tele", false);
        ParalanteInteligente parlante = new ParalanteInteligente("Barra brava", false);
        AireAcondicionado aire = new AireAcondicionado("FRIO", false);
        listadispositivos.add(tv);
        listadispositivos.add(parlante);
        listadispositivos.add(aire);

        Dispositivo proyector = new Dispositivo("Optoma",false) {
            @Override
            public void encender() {
                if (isEstado()){
                    System.out.println("El proyector ya esta encendido");
                }else {
                    System.out.println(getNombre() + " encendiendo projector con btillo automatico");
                    setEstado(true);
                }
            }
        };
        proyector.encender();
        proyector.encender();

        ControlRemoto proyector_sin = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto");
            }
        };
        proyector_sin.sincronizar();

        Dispositivo horno_inte = new Dispositivo("Very_Inteligent",false) {
            @Override
            public void encender() {
                if (isEstado()){
                    System.out.println("El Horno ya esta encendido");
                }else {
                    System.out.println("Calentando horno con la temperatura automatica");
                    setEstado(true);
                }
            }
        };
        horno_inte.encender();
        horno_inte.encender();

        listadispositivos.add(proyector);
        listadispositivos.add(horno_inte);

        for (Dispositivo dispositivo : listadispositivos){
            if (dispositivo instanceof Televisor){
                ((Televisor) dispositivo).sincronizar();
            } else if (dispositivo.getNombre().equals("Optoma")) {
                proyector_sin.sincronizar();
            }
            dispositivo.encender();
            dispositivo.encender();
            dispositivo.apagar();
            dispositivo.apagar();
            dispositivo.mostrarestado();
        }

    }

}
