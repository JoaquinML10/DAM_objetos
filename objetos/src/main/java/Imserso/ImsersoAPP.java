package Imserso;

public class ImsersoAPP {
    static void main(String[] args) {

        Abuelo manolo = new Abuelo("manolo", 89);
        Abuelo pepe = new Abuelo("pepe", 67);
        Abuelo marisa = new Abuelo("marisa", 75);
        Abuelo euge = new Abuelo("euge", 68);

        AutobusAbuelo alsa = new AutobusAbuelo("13213123", "chile");

        alsa.insertar_abuelo(manolo);
        alsa.insertar_abuelo(pepe);
        alsa.insertar_abuelo(marisa);
        alsa.insertar_abuelo(euge);

        System.out.println(alsa.getListabualeo());
        alsa.borrar_abuelo(euge);
        System.out.println(alsa.getListabualeo());

        alsa.mostrarabuelos();
        alsa.mostrarmayores(80);
    }
}
