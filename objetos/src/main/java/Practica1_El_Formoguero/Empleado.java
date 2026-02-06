package Practica1_El_Formoguero;

public class Empleado {
    final static private String valor_predeterminado_cargo = "pte";
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String id, String nombre, String cargo){
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public void controlar_Cargo(String cargo){
        switch (cargo)
        {
            case "director":
                cargo = "director";
                break;
            case "tecnico":
                cargo = "tecnico";
                break;
            case "presentador":
                cargo = "presentador";
                break;
            case "colaborador":
                cargo = "colaborador";
                break;
            default:
                cargo = valor_predeterminado_cargo;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
