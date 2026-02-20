package TEMA6.Practica2;

public class Entrenador extends RiverPlate implements AccionesDeportivas  {

    private Equipos equipos;

    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipos, String formacionPreferida) {
        super(nombre, edad);
        this.equipos = equipos;
        this.formacionPreferida = formacionPreferida;
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador esta planificando el entrenamiento para pegarles a los rivales");
    }

    public void hacerCambio(){
        System.out.println("El entrenador va a hacer un cambio porque sus jugadores son muy malos");
    }
    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "formacionPreferida='" + formacionPreferida + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", equipos=" + equipos +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se esta concentrando insultando a sus jugadores");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador va a viajar a la ciudad: " + ciudad + ", para ganar la final de la LIBERTADORES");
    }

    @Override
    public void celebrarGol() {
        System.out.println("El entrenador celebra el gol mandando a callar al equipo rival");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador esta entrenando bicep");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador se esta preparando para jugar contra el equipo: " + rival);
    }
}
