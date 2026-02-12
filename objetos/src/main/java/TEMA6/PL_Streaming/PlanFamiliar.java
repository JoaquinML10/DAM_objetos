package TEMA6.PL_Streaming;

public class PlanFamiliar extends Sucripcion{


    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo prueba: 7 días de prueba para cuentas nuevas");
    }
}
