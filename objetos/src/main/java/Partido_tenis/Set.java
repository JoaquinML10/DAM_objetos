package Partido_tenis;

public class Set {

    private int puntosJ1;
    private int puntosJ2;

    public Set(int puntosJ1, int puntosJ2){
        this.puntosJ1=puntosJ1;
        this.puntosJ2=puntosJ2;
    }

    public void controlarPuntos(int puntosJ1, int puntosJ2){

        if (validartimebrak(puntosJ1, puntosJ2) ) {
            Set nuevoset = new Set(puntosJ1,puntosJ2);
        }else {
            if (puntosJ1 == 6 && puntosJ2 >= 0 && puntosJ2 < 6){

            } else if (puntosJ2 == 6 && puntosJ1 >= 0 && puntosJ1 < 6) {

            }else {
                System.out.println("Error al crear el set");
                return;
            }
        }
        return;
    }

    private boolean validartimebrak(int puntosJ1, int puntosJ2){
        int mayor = 0;
        int menor = 0;
        if (puntosJ1 > puntosJ2){
            mayor = puntosJ1;
            menor = puntosJ2;
        }else if (puntosJ2 > puntosJ1){
            mayor = puntosJ2;
            menor = puntosJ1;
        }
        if (mayor == 7 ) {
            if (menor == 6 || menor == 5){
                return true;
            }
        }

        return false;
    }

    public int getPuntosJ1() {
        return puntosJ1;
    }

    public void setPuntosJ1(int puntosJ1) {
        this.puntosJ1 = puntosJ1;
    }

    public int getPuntosJ2() {
        return puntosJ2;
    }

    public void setPuntosJ2(int puntosJ2) {
        this.puntosJ2 = puntosJ2;
    }

    @Override
    public String toString() {
        return "Set{" +
                "puntosJ1=" + puntosJ1 +
                ", puntosJ2=" + puntosJ2 +
                '}';
    }
}
