package TEMA6.PL_Streaming;

import java.util.ArrayList;

public class PlataformaStreamingAPP {
    static void main(String[] args) {
        PlanGratis gratis = new PlanGratis("Gratis", 0.0);
        PlanBasico basico = new PlanBasico("Basico", 9.99);
        PlanPremium premium = new PlanPremium("Premium",14.99);
        PlanFamiliar familiar = new PlanFamiliar("Familiar", 19.00);

        ArrayList<Sucripcion> listaPlan = new ArrayList<>();
        listaPlan.add(gratis);
        listaPlan.add(basico);
        listaPlan.add(premium);
        listaPlan.add(familiar);

        for (Sucripcion sucripcion:listaPlan){
            sucripcion.mostrarInfo();
            sucripcion.obtenerBeneficios();
            sucripcion.obtenerPeriodoPrueba();
        }

    }
}
