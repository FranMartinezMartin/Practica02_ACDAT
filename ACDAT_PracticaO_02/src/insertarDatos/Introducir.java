package insertarDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Introducir {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/Instituto";
        String user = "root";
        String password = "root";

        Connection conexion = null;
        Statement sentencia = null;
        String insertar = "INSERT INTO alumno VALUES (0111,'prueba','prueba','prueba',10/10/2010,true);";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url, user, password);
            sentencia = (Statement) conexion.createStatement();
            sentencia.executeUpdate(insertar);
            System.out.println("si");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
