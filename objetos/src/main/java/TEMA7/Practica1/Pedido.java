package TEMA7.Practica1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Pedido implements Comparator<Map.Entry<Producto,Integer>> {
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
        double total = 0;
        for (Map.Entry<Producto, Integer> entry : pedido.entrySet()){
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();

            int gratis = cantidad / 3;
            int cantidadAPagar = cantidad - gratis;

            total += cantidadAPagar * producto.getPrecio();
        }

        this.importeTotal = total;
    }
    public void aplicarPromo10(){
        this.importeTotal = importeTotal * 0.9;
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

    @Override
    public int compare(Map.Entry<Producto, Integer> o1, Map.Entry<Producto, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}
