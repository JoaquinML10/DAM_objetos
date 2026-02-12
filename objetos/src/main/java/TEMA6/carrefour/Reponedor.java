package TEMA6.carrefour;

public class Reponedor extends Persona{

    private String pasillo;

    public Reponedor(int codigo, String nombre, double sueldo, String pasillo) {
        super(codigo, nombre, sueldo);
        this.pasillo = pasillo;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("el cajero trabaja en el pasillo " + pasillo);
    }

    @Override
    public void trabajar() {
        System.out.println("Acomodando cajas");
    }

    @Override
    public String toString() {
        return "Reponedor{" +
                "pasillo='" + pasillo + '\'' +
                '}';
    }
}
