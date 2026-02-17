package TEMA6.Dispositivos_Inteleigentes;

public abstract class Dispositivo {
    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public abstract void encender();

    public void apagar(){
        if (estado){
            System.out.println(nombre + estado);
            setEstado(false);
        }else {
            System.out.println(nombre + " Ya esta apagado");
        }
    }
    public void mostrarestado(){
        System.out.println(estado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
