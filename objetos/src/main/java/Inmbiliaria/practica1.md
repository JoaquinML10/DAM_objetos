## Practica 1. Practica de cpmpra-venta de casas

## INDICE
1. [Intro].().
2. [Estructura de clases].().
3. [Progama principal (Inmobiliaria APP)].().
4. [Pruebas].().
5. [Entrega].().

### 1. Intro
> La practica consiste n una app ...

### 2. Estrucutra de clase

#### Diagrama de clases UML
![](img/nose.png)

#### Codigo PlantUML
@startuml
package Biblio {

class Editorial {
    - nombre : String
    - pais : String
    - listalibros : ArrayList<Libro>
    + Editorial(nombre : String, pais : String)
    + Editorial()
    + getNombre() : String
    + setNombre(nombre : String)
    + getPais() : String
    + setPais(pais : String)
    + toString() : String
}

class Estudiante {
    - CORREO_FORMAT : String
    - contadorestudiantes : int
    - curso : String
    - nia : int
    - gmail : String
    - nombre : String
    - listalibto : ArrayList<Libro>
    + Estudiante(nombre : String, curso : String, gmail : String)
    + Estudiante(nombre : String)
    + validarCorreo(gmail : String) : boolean
    + insertarLibro(libro : Libro)
    + borrarLibro(libro : Libro)
    + getListalibto() : ArrayList<Libro>
    + toString() : String
}

class Libro {
    - cantidadDeLibros : int
    - librosDisponibles : int
    - CADENA_ID : String
    - titulo : String
    - autor : String
    - ID : String
    - disponibles : boolean
    - estudiantePrestado : Estudiante
    - editorial : Editorial
    + Libro(titulo : String, autor : String, editorial : Editorial)
    + prestar(estudiante : Estudiante) : Prestamo
    + devolver()
    + disponible() : boolean
    + getTotallibros() : int
    + getLibrosDisponibles() : int
    + toString() : String
}

class Prestamo {
    - libro : Libro
    - estudiante : Estudiante
    - fecha : LocalDateTime
    + Prestamo(libro : Libro, estudiante : Estudiante)
    + getLibro() : Libro
    + getEstudiante() : Estudiante
    + getFecha() : LocalDateTime
    + toString() : String
}

Editorial "1" -- "*" Libro : publica >
Estudiante "1" *--> "*" Libro : >
Prestamo "1" o--> "1" Libro
Prestamo "1" o--> "1" Estudiante

}
@enduml

#### Contenido clases (.java)

````
package Inmbiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    static Scanner teclado = new Scanner(System.in);
    private String direccion;

    private ArrayList<Habitacion> listahabitaciones;

    private Propietario propietario;

    public Casa(String direccion){
        this.direccion=direccion;
        listahabitaciones = new ArrayList<>();
        setPropietario();
    }

    public ArrayList<Habitacion> getListahabitaciones() {
        return listahabitaciones;
    }

    public void setListahabitaciones(ArrayList<Habitacion> listahabitaciones) {
        this.listahabitaciones = listahabitaciones;
    }

    public void mostrarHabitacion(){
        System.out.println("Casa en " + direccion + "y propetario " + propietario.getNombre() + " tiene " +  listahabitaciones.size());
        for (Habitacion habitacion : listahabitaciones){
            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetros() + " )");
        }
    }

    public Habitacion getHabitacionMasGrande(){
        Habitacion mayor = listahabitaciones.get(0);

        for (Habitacion habitacion:listahabitaciones){
            if (habitacion.getMetros()> mayor.getMetros()){
                mayor=habitacion;
            }
        }
        return mayor;
    }

    public void crearHabitacion(String nombre, double metros){

        for (Habitacion habitacion:listahabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitacion " + nombre + " ya existe.");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre,metros);
        listahabitaciones.add(habitacion);
        System.out.println("Habitacion creada");
    }

    public void eliminarHabitaciones(String nombre){
        for (Habitacion habitacion:listahabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                listahabitaciones.remove(habitacion);
                System.out.println("Habitacion " + nombre + " borrada con exito.");
                return;
            }
        }
        System.out.println("La habitacion " + nombre + " no existe.");
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propetario");
        String nombre = teclado.next();
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        Propietario propietario = new Propietario(nombre,edad);
        this.propietario = propietario;
        System.out.println("Propetario " + nombre + " añadido.");

    }


    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "propetario='" + propietario + '\'' +
                '}';
    }

}

````

### 3. Programa principal (InmobiliariaApp)

### 4. Purebas

### 5. Entregas
