package TEMA6.carrefour;

public abstract class Persona {

    private int codigo;
    private String nombre;
    private double sueldo;

    public Persona (int codigo, String nombre, double sueldo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void mostrarInfo(){
        System.out.println("Persona con codigo " + codigo + " y nombre " + nombre + " gana " + sueldo + "€");
    }

    public abstract void trabajar();

    @Override
    public String toString() {
        return "Persona{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
