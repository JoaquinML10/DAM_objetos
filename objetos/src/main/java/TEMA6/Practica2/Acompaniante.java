package TEMA6.Practica2;

public class Acompaniante extends RiverPlate {
    private Jugador integrante;
    private String parentesco;

    public Acompaniante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println("!!!!River mi buen amigo, esta campaña volveremos a estar contigo, te alentaremos de corazon, esta es la hinchada que te quiere ver CAMPEON¡¡¡¡");
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    @Override
    public String toString() {
        return "Acompañante{" +
                "parentesco='" + parentesco + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", integrante=" + integrante +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El acompañante esta concentrandose tomando agua");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante va a viajar a la ciudad: " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("EL acompañante esta celebrando el gol callando a la hinchada rival ");
    }
}
