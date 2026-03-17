package TEMA7.Iteradores;

public abstract class Pista {
    private int id;
    private String techado;

    public Pista(int id, String techado) {
        this.id = id;
        this.techado = techado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechado() {
        return techado;
    }

    public void setTechado(String techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return "Pista{" +
                "id=" + id +
                ", techado='" + techado + '\'' +
                '}';
    }
}
