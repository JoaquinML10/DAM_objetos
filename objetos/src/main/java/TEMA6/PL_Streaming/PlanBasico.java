package TEMA6.PL_Streaming;

public class PlanBasico extends Sucripcion{


    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo prueba: 30 días de prueba gratuita");
    }
}
