package TEMA6.PL_Streaming;

public abstract class Sucripcion {
    private String nombrePlan;
    private double precio;

    public Sucripcion(String nombrePlan, double precio){
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Plan: " + nombrePlan + ", Precio: " + precio + "€");
    }

    public abstract void obtenerBeneficios();

    public abstract void obtenerPeriodoPrueba();

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Sucripcion{" +
                "nombrePlan='" + nombrePlan + '\'' +
                ", precio=" + precio +
                '}';
    }
}
