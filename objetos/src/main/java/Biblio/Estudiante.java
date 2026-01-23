package Biblio;

public class Estudiante {

    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    private static int contadorestudiantes = 0;
    private String curso;
    private int nia;
    private String gmail;
    private String nombre;


    private Libro libro;

    public Estudiante (String nombre, String curso, String gmail){
        this.nombre = nombre;
        this.curso = curso;
        this.gmail = gmail;
        nia = ++contadorestudiantes;
        libro = null;
    }
    public  Estudiante (String nombre){
        this(nombre, "","" );
    }
    public boolean validarCorreo(String gmail){
        if (gmail.matches(CORREO_FORMAT)){
            return true;
        }else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "curso='" + curso + '\'' +
                ", nia=" + nia +
                ", gmail='" + gmail + '\'' +
                ", nombre='" + nombre + '\'' +
                ", libro='" + libro + '\'' +
                '}';
    }


}
