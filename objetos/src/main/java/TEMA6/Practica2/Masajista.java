package TEMA6.Practica2;

public class Masajista extends RiverPlate{

    private String titulacion;
    private int anosExperiencias;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencias) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencias = anosExperiencias;
    }

    /**
     * Le pasamos el jugador y como no sabemos cuantos jugadores
     * le vamos a pasar le ponemos el ...
     * @param jugador
     */
    public void darMasaje(Jugador... jugador){
        if (jugador.length == 1) {//si la longitud de los Jugadores que le pasamos es igual a 1 (osea que solo le pasamos un parametro)
            System.out.println("El masajista: " + nombre + " le esta haciendo unos masjes muy buenos al jugador: " + jugador[0].getNombre()); //busca como si fuera un vector en la primera posicion
        }else {//si hay mas de un jugador usa un for para mostrar los jugadores
            System.out.println("El masajista: " + nombre + " le esta haciendo unos masjes muy buenos a los jugadores: ");
            for (int i = 0; i < jugador.length; i++) {
                System.out.println(jugador[i].getNombre());
            }
        }

    }
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencias() {
        return anosExperiencias;
    }

    public void setAnosExperiencias(int anosExperiencias) {
        this.anosExperiencias = anosExperiencias;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "anosExperiencias=" + anosExperiencias +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", titulacion='" + titulacion + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista se esta concentrando para hacer bien el masaje");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista tiene que viajar a la ciudad: " + ciudad + ", para poder seguir dandole masajes a los jugadores");
    }

    @Override
    public void celebrarGol() {
        System.out.println("El masajista esta celebrando el gol que metio el jugador");
    }
}
