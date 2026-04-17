package bbdd_mariadb;

import java.sql.*;

public class Main {
        public static void main(String[] args) {

            Connection bd = conexion();
            consulta(bd);
            modificar(bd);
        }

        public static Connection conexion() {
            Connection conexion;
            String host = "jdbc:mariadb://localhost:3310/";
            String user = "root";
            String psw = "";
            String bd = "prueba";
            System.out.println("Conectando...");

            try {
                conexion = DriverManager.getConnection(host+bd,user,psw);
                System.out.println("Conexión realizada con éxito.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }

            return conexion;
        }

        public static void consulta(Connection connection){
            String query = "SELECT * FROM estudiante WHERE";

            Statement statement;
            try {
                statement = connection.createStatement();
                ResultSet respuesta = statement.executeQuery(query);

                while (respuesta.next()){
                    int nia = respuesta.getInt("nia");
                    String nombre = respuesta.getString("nombre");
                    Date fecha_nacimiento = respuesta.getDate("fecha_nacimiento");
                    System.out.println("Estudiante con NIA: " + nia + " nombre: " + nombre + " fecha nacimiento: " + fecha_nacimiento);
                }

            }catch (SQLException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }

        public static void modificar (Connection connection){
            String query = "UPDATE estudiante SET nombre='PATRI' where nia='12344'";
            Statement statement;
            try {
                statement = conexion().createStatement();
                statement.executeQuery(query);
            }catch (SQLException e){
                System.out.println(e.getMessage());
                throw new RuntimeException();
            }

        }
    }