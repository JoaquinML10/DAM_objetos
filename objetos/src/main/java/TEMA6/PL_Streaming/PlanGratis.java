package TEMA6.PL_Streaming;

public class PlanGratis extends Sucripcion{

    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso ilimitados con anuncios");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo prueba: Sin periodo de prueba" );
    }
}
