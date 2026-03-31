package TEMA7.Practica1;

import java.util.*;

public class AppZonaClientes {
    static Cliente cliente;
    static Scanner teclado = new Scanner(System.in);

    /**
     * Método que llama a los demas metodos
     */
    public static void main(String[] args) {
        Mercadam mercadam = new Mercadam();

        System.out.println("Cuantos clientes quieres crear");
        int numeros = teclado.nextInt();

        mercadam.generarClientes(numeros);

        System.out.println("=== COMPRA ONLINE EN MERCADAW ===");

        autenticacion(mercadam.getClientes());

        iniciarCompra();
        mostrarOpciones();
    }

    /**
     * Pide usuario y contraseña
     * Comprueba si el cliente existe
     */
    static void autenticacion(Set<Cliente> clientes){

        int intentos = 3;
        boolean correcto = false;

        while (intentos != 0){
            System.out.println("usuario: ");
            String usuario = teclado.next();

            System.out.println("contraseña: ");
            String contrasenia = teclado.next();

            for (Cliente cliente1 : clientes){
                if (cliente1.getUsuario().equals(usuario) &&
                        cliente1.getContrasenya().equals(contrasenia)){
                    correcto = true;
                    break;
                }
            }

            if (correcto){
                System.out.println("Bienvenido, " + usuario);
                cliente = new Cliente(usuario, contrasenia);
                break;
            } else {
                intentos--;
                System.out.println("Credenciales no validas. Intentos: " + intentos);
            }

            if (intentos == 0){
                System.out.println("Error de autenticacion");
                return;
            }
        }
    }

    /**
     * Inicia el proceso de compra
     */
    static void iniciarCompra(){
        System.out.println("Creando nuevo pedido...");
        System.out.println();
        System.out.println("Elige un producto de la lista...");
        imprimirProductos();
    }

    /**
     * Muestra los productos y los añade al pedido
     */
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
                // Se intenta convertir el texto a un producto del enum
                Producto producto = Producto.valueOf(comida.toUpperCase());
                System.out.println("Has elegido el producto: " + producto + " con un precio de " + producto.getPrecio());
                cliente.getPedido().actualizarImporteTotal(producto.getPrecio()); // Se suma el precio del producto al imprteTotal
                cliente.insertarProducto(producto);

                // Se muestra el importe total actualizado
                System.out.println("Importe total del pedido: " + cliente.getPedido().getImporteTotal());
                System.out.println();
                System.out.println("¿Quieres añadir mas productos (S/N)?");
                char op = teclado.next().toUpperCase().charAt(0);
                if (op == 'S') {
                    seguir = true;
                } else {

                    seguir = false;
                }

            } catch (IllegalArgumentException e) {// Si el producto no es el correcto lo manda al catch

                System.out.println("Producto no valido. Elige otro");
            }

        } while (seguir);

        imprimirResumen();
    }

    /**
     * Muestra el resumen del pedido
     */
    static void imprimirResumen(){
        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        System.out.println("Productos");
        mostrarLista();
    }

    /**
     * Muestra mensaje final
     */
    static void imprimirDespedida(){
        System.out.println("==== GRACIAS POR SU PEDIDO ====");
        System.out.println("Lo recibira en unos dias en la direccion " + cliente.getDireccion());
    }

    /**
     * Muestra las opciones del menú
     */
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
                    //Si el cliente no uso la promocion llama a aplicar promo3x2 y 10, y cambia promocion a true
                    if (cliente.isPromociones()) {
                        System.out.println("El cliente no puede aplicar promociones otra vez");
                    } else {
                        cliente.getPedido().aplicarPromo3x2();
                        cliente.getPedido().aplicarPromo10();
                        cliente.setPromociones(true);

                        System.out.println("PROMOS APLICADAS");
                        imprimirResumen();
                    }
                    break;

                case 2:
                    //Ordena la lista de mayor a menor
                    List<Map.Entry<Producto, Integer>> listaOrdenada =
                            new ArrayList<>(cliente.getPedido().getPedido().entrySet());

                    listaOrdenada.sort(cliente.getPedido());

                    System.out.println("Productos ordenados por unidades:");

                    for (Map.Entry<Producto, Integer> mapita : listaOrdenada) {
                        System.out.println(mapita.getValue() + " " +
                                mapita.getKey() + " " +
                                mapita.getKey().getPrecio());
                    }

                    System.out.println("IMPORTE TOTAL: " +
                            cliente.getPedido().getImporteTotal() + "€");
                    break;

                case 3:
                    imprimirDespedida();
                    terminar = false;
                    break;
            }
        }
    }

    /**
     * Muestra los productos del pedido
     */
    static void mostrarLista(){
        for (Map.Entry<Producto, Integer> mapita :
                cliente.getPedido().getPedido().entrySet()){
            System.out.println(mapita.getValue() + " " +
                    mapita.getKey() + " " +
                    mapita.getKey().getPrecio());
        }

        System.out.println("IMPORTE TOTAL: " +
                cliente.getPedido().getImporteTotal() + "€");
    }
}
