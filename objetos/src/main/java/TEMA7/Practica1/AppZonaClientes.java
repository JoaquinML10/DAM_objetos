package TEMA7.Practica1;

import java.util.*;

public class AppZonaClientes {
    static Cliente cliente;
    static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {
        Mercadam mercadam = new Mercadam();
        System.out.println("Cuantos clientes quieres crear");
        int numeros = teclado.nextInt();
        mercadam.generarClientes(numeros);

        System.out.println("=== COMPRA ONLINE EN MERCADAW");
        autenticacion(mercadam.getClientes());

        iniciarCompra();
        mostrarOpciones();
    }

    static void autenticacion(Set<Cliente> clientes){

        int intentos = 3;
        boolean correcto = false;
        while (intentos != 0){
            System.out.println("usuario: ");
            String usuario = teclado.next();
            System.out.println("contraseña: ");
            String contrasenia = teclado.next();
            for (Cliente cliente1 : clientes){
                if (cliente1.getUsuario().equals(usuario) && cliente1.getContrasenya().equals(contrasenia)){
                    correcto = true;
                    break;
                }
            }
            if (correcto){
                System.out.println("Bienvenido, " + usuario );
                cliente = new Cliente(usuario, contrasenia);
                break;
            }else {
                intentos--;
                System.out.println("Credenciales no validas. Intentos: " + intentos);
            }
            if (intentos == 0){
                System.out.println("Error DE AUTENTICACION");
                return;
            }
        }

    }
    static void iniciarCompra(){
        System.out.println("Creando nuevo pedido...");
        System.out.println();
        System.out.println("Elige un producto de la lista...");
        imprimirProductos();
    }
    static void imprimirProductos(){
        boolean seguir = true;
        cliente.crearPedido();
        do {
            for (Producto producto : Producto.values()) {
                System.out.println(producto + ": " + producto.getPrecio());
            }
            System.out.println("=============================================");

            System.out.println("Elige un producto:");
            String comida = teclado.next();

            try {
                Producto producto = Producto.valueOf(comida.toUpperCase());
                System.out.println("Has elegido el producto: " + producto + " con un precio de " + producto.getPrecio());
                cliente.getPedido().actualizarImporteTotal(producto.getPrecio());
                cliente.insertarProducto(producto);
                System.out.println("Importe total del pedido: " + cliente.getPedido().getImporteTotal());
                System.out.println();
                System.out.println("¿Quieres añadir mas productos (S/N)?");
                char op = teclado.next().toUpperCase().charAt(0);
                if (op == 'S') {
                    seguir = true;
                } else {
                    seguir = false;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Producto no valido. Elige otro");
            }


        }while (seguir);

        imprimirResumen();

    }
    static void imprimirResumen(){

        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        System.out.println("Productos");
        mostrarLista();
    }
    static void imprimirDespedida(){

        System.out.println("==== GRACIAS POR SU PEDIDO ====");
        System.out.println("Lo recibira en unos dias en la direccion " + cliente.getDireccion());
    }
    static void mostrarOpciones(){
        boolean terminar = true;
        while (terminar) {
            System.out.println();
            System.out.println("===================");
            System.out.println("¿Que deseas hacer?");
            System.out.println("[1]. Aplicar promos.");
            System.out.println("[2]. Mostrar resumen ordenado por uds.");
            System.out.println("[3]. Terminar pedido.");
            System.out.print("Elije una opcion: ");
            int op = teclado.nextInt();
            switch (op) {
                case 1:
                    if (cliente.isPromociones()) {
                        System.out.println("El cliente no puede aplicar ninguna promo porque ya la gasto");
                    } else {
                        cliente.getPedido().aplicarPromo3x2();
                        cliente.getPedido().aplicarPromo10();
                        cliente.setPromociones(true);
                        System.out.println("====================================");
                        System.out.println("PROMO 3x2 y 10% DESC. APLICADAS");
                        System.out.println("====================================");

                        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
                        System.out.println("Productos:");

                        mostrarLista();
                    }
                    break;
                case 2:
                    List<Map.Entry<Producto, Integer>> listaOrdenada = new ArrayList<>(cliente.getPedido().getPedido().entrySet());
                    listaOrdenada.sort(cliente.getPedido());
                    System.out.println("Productos ordenados por uds: ");
                    for (Map.Entry<Producto, Integer> mapita : listaOrdenada) {
                        System.out.println(mapita.getValue() + " " + mapita.getKey() + " " + mapita.getKey().getPrecio());
                    }
                    System.out.println("IMPORTE TOTAL: " + cliente.getPedido().getImporteTotal() + "€");
                    break;
                case 3:
                    imprimirDespedida();
                    terminar = false;
                    break;

                default:
            }
        }
    }
    static void mostrarLista(){
        for (Map.Entry<Producto, Integer> mapita  : cliente.getPedido().getPedido().entrySet()){
            System.out.println(mapita.getValue() + " " + mapita.getKey() + " " + mapita.getKey().getPrecio());
        }
        System.out.println("IMPORTE TOTAL: " + cliente.getPedido().getImporteTotal() + "€");
    }
}
