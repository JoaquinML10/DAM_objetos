# Practica 1: MercaDAM

# Índice
  1. [Introducción](#1-introduccion)
  2. [Estructura del proyecto](#2-estructura-del-proyecto)
  3. [Contenido de las clases](#3-contenido-de-las-clases)
  4. [Contenido del Enum](#4-Contenido-del-Enum)


# 1. Introduccion
Esta práctica consiste en desarrollar una aplicación de compra online para un supermercado llamado Mercadam. El programa permite crear clientes, iniciar sesión con usuario y contraseña y realizar pedidos desde casa.

# 2. Estructura del proyecto

  ### Clases normales del proyecto
  - **Cliente**
  - **MercaDam**
  - **Pedido**
  - **Producto**
  
  ### Enum
  - **Producto**

# 3. Contenido de las clases
## Cliente
````
package TEMA7.Practica1;

public class Cliente {
    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.direccion = "Calle falsa, 123";
        this.pedido = null;
        this.promociones = false;
    }

    /**
     * crea un nuevo pedido
     */
    public void crearPedido(){
        this.pedido = new Pedido();
    }

    /**
     * Añade un producto al pedido
     * y si ya existe se le hace un mas 1 al pedido
     */
    public void insertarProducto(Producto producto){
        if (pedido.getPedido().containsKey(producto)){
            pedido.getPedido().put(producto, pedido.getPedido().get(producto) + 1);
        }else {
            pedido.getPedido().put(producto,1);
        }
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isPromociones() {
        return promociones;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}

````

# MercaDam
````
package TEMA7.Practica1;

import java.util.*;

public class Mercadam {
    private Set<Cliente> clientes = new HashSet<>();

    public Mercadam() {

        this.clientes = new HashSet<>();
    }


    /**
     * Le pasamos el numero de cuantos clientes quiere crear
     * y genera aleatoriamente un usuario y una contraseña
     * @param num
     */
    public void generarClientes(int num){
        Random aleatorio = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";


        for (int i = 0; i < num; i++) {
            String usuario = "";
            String contrasenia = "";
            for (int j = 0; j < 8; j++) {
                usuario += caracteres.charAt(aleatorio.nextInt(0,caracteres.length()));
                contrasenia += caracteres.charAt(aleatorio.nextInt(0,caracteres.length()));
            }
            Cliente cliente = new Cliente(usuario, contrasenia);
            clientes.add(cliente);
        }

        System.out.println(clientes);
    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Mercadam{" +
                "clientes=" + clientes +
                '}';
    }
}


````
# Entrenador
````
package TEMA6.Practica2;

public class Entrenador extends RiverPlate implements AccionesDeportivas  {

    private Equipos equipos;

    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipos, String formacionPreferida) {
        super(nombre, edad);
        this.equipos = equipos;
        try {
            setFormacionPreferida(formacionPreferida);
        }catch (FormacionNoValida e){
            System.out.println(e.getMessage());
        }
    }
    public void planificarEntrenamiento(){
        System.out.println("El entrenador esta planificando el entrenamiento para pegarles a los rivales");
    }

    public void hacerCambio(){
        System.out.println("El entrenador va a hacer un cambio porque sus jugadores son muy malos");
    }
    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        if (formacionPreferida.matches("\\d{1}-\\d{1}-\\d{1}")){
            this.formacionPreferida = formacionPreferida;
        }else {
            throw new FormacionNoValida();
        }

    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "formacionPreferida='" + formacionPreferida + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", equipos=" + equipos +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se esta concentrando insultando a sus jugadores");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador va a viajar a la ciudad: " + ciudad + ", para ganar la final de la LIBERTADORES");
    }

    @Override
    public void celebrarGol() {
        System.out.println("El entrenador celebra el gol mandando a callar al equipo rival");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador esta entrenando bicep");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador se esta preparando para jugar contra el equipo: " + rival);
    }
}

````

# Pedido
````
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

````

# 4. Contenido del Enum
# Producto  
````
package TEMA7.Practica1;

public enum Producto {
    MANZANA(2.30),PAN(1.0),ARROZ(3.50),POLLO(4.30),LECHE(1.30),ACEITE(8.30),HUEVOS(3.30),TOMATES(4.0),PASTA(0.80);

    private final double precio;

    Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

}

````

