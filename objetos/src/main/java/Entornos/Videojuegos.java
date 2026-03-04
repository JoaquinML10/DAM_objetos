package Entornos;

public class Videojuegos {

    private String titulo;
    private String plataforma;
    private String genero;
    private int anioLanzamiento;
    private double precio;
    private int stockDisponible;

    public Videojuegos(String titulo, String plataforma, String genero, int anioLanzamiento, double precio, int stockDisponible) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.anioLanzamiento = anioLanzamiento;
        this.precio = precio;
        this.stockDisponible = stockDisponible;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", genero='" + genero + '\'' +
                ", año de lanzamiento=" + anioLanzamiento +
                ", precio=" + precio +
                ", stock disponible=" + stockDisponible +
                '}';
    }
}
