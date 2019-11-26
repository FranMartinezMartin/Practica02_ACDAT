package insertarDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Metodos {

    public String insertarModulo(int codigo, String nombre) {
        String url = "jdbc:mysql://localhost/Instituto";
        String user = "root";
        String password = "root";

        Connection conexion = null;
        Statement sentencia = null;
        String insertar = "INSERT INTO modulo VALUES (" + codigo + ",'" + nombre + "');";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url, user, password);
            sentencia = (Statement) conexion.createStatement();
            sentencia.executeUpdate(insertar);
            return "Datos insertados correctamente creada correctamente";
        } catch (Exception e) {
            return "Se ha producido un fallo al insertar los datos";
        }
    }

    public boolean insertarAlumno(int expediente, String nombre, String apellidoP, String apellidoM, java.sql.Date fechaNac, boolean delegado) {
        String url = "jdbc:mysql://localhost/Instituto";
        String user = "root";
        String password = "root";

        Connection conexion = null;
        Statement sentencia = null;
        String insertar = "INSERT INTO alumno VALUES (?,?,?,?,?,?);";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url, user, password);
            sentencia = (Statement) conexion.createStatement();
            CallableStatement callStmt = conexion.prepareCall(insertar);
            callStmt.setInt(1, expediente);
            callStmt.setString(2, nombre);
            callStmt.setString(3, apellidoP);
            callStmt.setString(4, apellidoM);
            callStmt.setDate(5, new java.sql.Date(fechaNac.getTime()));
            callStmt.setBoolean(6, delegado);
            callStmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String insertarProfesor(String RFC, String nombre, String apellidoP, String apellidoM, String direccion, int telefono, int codigo_Modulo) {
        String url = "jdbc:mysql://localhost/Instituto";
        String user = "root";
        String password = "root";

        Connection conexion = null;
        Statement sentencia = null;
        String insertar = "INSERT INTO profesor VALUES (" + RFC + ",'" + nombre + "','" + apellidoP + "','" + apellidoM + "','" + direccion + "'," + telefono + "," + codigo_Modulo + ");";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url, user, password);
            sentencia = (Statement) conexion.createStatement();
            sentencia.executeUpdate(insertar);
            return "Datos insertados correctamente creada correctamente";
        } catch (Exception e) {
            return "Se ha producido un fallo al insertar los datos";
        }
    }

    public String insertarModulo(int idModuloAlumno, int CodAlumno, int CodModulo) {
        String url = "jdbc:mysql://localhost/Instituto";
        String user = "root";
        String password = "root";

        Connection conexion = null;
        Statement sentencia = null;
        String insertar = "INSERT INTO alumno VALUES (" + idModuloAlumno + "," + CodAlumno + "," + CodModulo + ");";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url, user, password);
            sentencia = (Statement) conexion.createStatement();
            sentencia.executeUpdate(insertar);
            return "Datos insertados correctamente creada correctamente";
        } catch (Exception e) {
            return "Se ha producido un fallo al insertar los datos";
        }
    }

    public String selectAlumno() {
        String consulta = "select * from alumno;";
        String url = "jdbc:mysql://localhost/Instituto";
        String user = "root";
        String password = "root";
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet result;
        String texto = "";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url, user, password);
            sentencia = (Statement) conexion.createStatement();
            result = sentencia.executeQuery(consulta);

            ResultSetMetaData rsmd = result.getMetaData();
            ArrayList<String> columnas = new <String>ArrayList();
            if (rsmd.getColumnCount() != 0) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    columnas.add(rsmd.getColumnName(i));
                }
            }
            while (result.next()) {
                for (String col : columnas) {
                    texto = col + ": " + result.getString(col) + "\t|\t";
                }
                texto += "\n";
            }
            sentencia.close();
            conexion.close();
            result.close();
        } catch (ClassNotFoundException ex) {
            System.err.println("No se ha encontrado el fichero.");
        } catch (SQLException ex) {
            System.err.println("Error al conectar con la base de datos.");
        } catch (InstantiationException ex) {
            System.err.println("Error al conectar con la base de datos.");
        } catch (IllegalAccessException ex) {
            System.err.println("Error al conectar con la base de datos.");
        }
        return texto;
    }
}
