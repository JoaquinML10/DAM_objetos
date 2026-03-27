package TEMA7.Lambdas.Ejercicio.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        Producto producto1 = new Producto("Banana", 20.9,"Perfume");
        Producto producto2 = new Producto("Manzana", 50.9,"Perfume");
        Producto producto3 = new Producto("Cascara", 100.9,"Perfume");

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);


        List<Producto> listapasados = new ArrayList<>();

        FiltroProducto filtroProducto = (producto) -> {
            if (producto.getCategoria().equals("Perfume") && producto.getPrecio() > 50){
                System.out.println(producto);
                listapasados.add(producto);
                return true;
            }
            return false;
        };
        System.out.println(filtroProducto.filtrar(producto3));
        System.out.println(filtroProducto.filtrar(producto2));
        System.out.println(filtroProducto.filtrar(producto1));

        System.out.println("Productos filtrados (Electronica y precio > 100):");

        for (Producto producto : listapasados){
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
    }
}
