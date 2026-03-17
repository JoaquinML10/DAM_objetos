package TEMA7.Iteradores;

public class Padel extends Pista {

    private String paredes;

    public Padel(int id, String techado, String paredes) {
        super(id, techado);
        this.paredes=paredes;
    }

    public String getParedes() {
        return paredes;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    @Override
    public String toString() {
        return "Padel{" +
                "paredes='" + paredes + '\'' +
                '}';
    }
}
