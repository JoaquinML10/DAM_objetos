package Biblio;

public class Libro {
    private static int cantidadDeLibros = 0;
    private static int librosDisponibles = 0;
    private static final String CADENA_ID = "LIB";
    private String titulo;
    private String autor;
    private String ID;
    private boolean disponibles;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro (String titulo, String autor, Editorial editorial){
        this.titulo = titulo;
        this.autor = autor;
        disponibles = true;
        cantidadDeLibros++;
        librosDisponibles++;
        ID = generarID();
        estudiantePrestado = null;
        this.editorial = editorial;
    }

    public Prestamo prestar(Estudiante estudiante){
        Prestamo prestamo = null;
        if (disponibles && estudiante.getLibro() == null){
            disponibles=false;
            System.out.println("El libro " + titulo + " ha sido prestado " + estudiante.getNombre() + " de " + estudiante.getCurso());
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.setLibro(this);
            prestamo = new Prestamo(this,estudiante);
            System.out.println("prestamo realizado");
        } else if (estudiante.getLibro() == null) {
            System.out.println("El estudiante " + estudiante.getNombre() + " Ya tiene el libro prestado");
        } else {
            System.out.println("El libro " + titulo + " no esta disponible");
        }

        return prestamo;
    }

    public void devolver(){
        if (disponibles){
            disponibles = true;
            System.out.println("El libro " + titulo + " ha sido devuelto " + estudiantePrestado.getNombre() + " de " + estudiantePrestado.getCurso());
            librosDisponibles++;
            estudiantePrestado.setLibro(null);
            estudiantePrestado = null;
        }else {
            System.out.println("El libro " + titulo + " esta disponible. no se puede devolver");
        }
    }

    public boolean disponible(){
        return disponibles;
    }

    public static int getTotallibros(){
        return cantidadDeLibros;
    }

    public static int getLibrosDisponibles(){
        return librosDisponibles;
    }

    private String generarID(){
        return CADENA_ID+cantidadDeLibros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isDisponibles() {
        return disponibles;
    }

    public void setDisponibles(boolean disponibles) {
        this.disponibles = disponibles;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ID='" + ID + '\'' +
                ", disponibles=" + disponibles +
                ", estudiante=" + estudiantePrestado +
                ", editorial= " + editorial +
                '}';
    }
}
