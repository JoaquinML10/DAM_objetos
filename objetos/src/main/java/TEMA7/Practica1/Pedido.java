package TEMA7.Practica1;

import java.util.HashMap;

public class Pedido {
    private HashMap<Producto, Integer> pedido;
    private double importeTotal;

    public Pedido(){
        this.pedido  = new HashMap<>();
        this.importeTotal = 0;
    }

    public void actualizarImporteTotal(double importe){
        setImporteTotal(importe);
    }
    public void aplicarPromo3x2(){

    }
    public void aplicarPromo10(){

    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal += importeTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pedido=" + pedido +
                ", importeTotal=" + importeTotal +
                '}';
    }

}
