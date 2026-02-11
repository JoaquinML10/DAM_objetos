package TEMA6.Redes_Sociales;

public class Streamer extends Usuario {

    private int numeros_retransmiciones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String userName, int seguidores) {
        super(nombre, edad, userName, seguidores);

    }

    public int getNumeros_retransmiciones() {
        return numeros_retransmiciones;
    }

    public void setNumeros_retransmiciones(int numeros_retransmiciones) {
        this.numeros_retransmiciones = numeros_retransmiciones;
    }

    public int getHoras_directo() {
        return horas_directo;
    }

    public void setHoras_directo(int horas_directo) {
        this.horas_directo = horas_directo;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El  streamer tiene " + numeros_retransmiciones + ", " + horas_directo + " horas" );
    }

    @Override
    public String toString() {
        return "Streamer{" +
                "numeros_retransmiciones=" + numeros_retransmiciones +
                ", horas_directo=" + horas_directo +
                '}';
    }
}

