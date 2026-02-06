package Practica1_El_Formoguero;

public class Empleado {

    // para la primera parte del id
    final static private String IDE_PREDETERMINADO= "EP";

    // cargo predeterminado
    final static private String valor_predeterminado_cargo = "pte";

    // Contador para los ID automáticos
    private static int contador_IDE = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo){

        this.id = controlar_IDE();
        this.nombre = nombre;

        setCargo(cargo);
    }

    // comprueba si el cargo que le pasamos es valido
    public String controlar_Cargo(String cargo){

        // Convierte a minúsculas para evitar problemas
        switch (cargo.toLowerCase())
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
        // Si es director no tiene un director porque el es su propio jefe
        if (cargo.equals("director")){
            director = null;
        }

        return cargo;
    }

    // genera el id automaticamente
    private String controlar_IDE(){
        contador_IDE ++;
        return IDE_PREDETERMINADO + String.format("%03d", contador_IDE); //juntamos el ide predeterminado y el contador automatico y se lo damos al constructor
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
        this.cargo = controlar_Cargo(cargo);
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        //si no es director es que tiene un director que lo supervisa
        if (!this.cargo.equals("director")){
            this.director = director;
        }
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
