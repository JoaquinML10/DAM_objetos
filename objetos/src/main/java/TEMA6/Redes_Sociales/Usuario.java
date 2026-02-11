package TEMA6.Redes_Sociales;

public class Usuario {

    private String nombre;
    private int edad;
    private String userName;
    private int seguidores;

    public Usuario(String nombre, int edad, String userName, int seguidores){
        this.nombre = nombre;
        this.edad = edad;
        this.userName = userName;
        this.seguidores = seguidores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void mostrarInfo(){
        System.out.println("Informacion del Usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Usuario: " + userName);
        System.out.println("Edad: " + edad);
        System.out.println("Seguidores: " + seguidores);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", userName='" + userName + '\'' +
                ", seguidores=" + seguidores +
                '}';
    }
}
