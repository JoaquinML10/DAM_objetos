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

    /**
     * Suma importe
     * @param importe
     */
    public void actualizarImporteTotal(double importe){
        setImporteTotal(importe);
    }

    /**
     * Promocion 3x2
     * Cuando hay tres productos repetidos se aplica la promo de 3x2
     */
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

    /**
     * Aplica un descuento del 10%
     */
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

    /**
     * Se va actaulizando sumandose asi mismo
     *
     */
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

    /**
     * Ordena de la lista de mayor a menor
     */
    @Override
    public int compare(Map.Entry<Producto, Integer> o1, Map.Entry<Producto, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}
