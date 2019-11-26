package creacionBD;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

public class CrearBD {

    private static final String url = "jdbc:mysql://localhost/";
    private static final String user = "root";
    private static final String password = "root";

    // CREACION DE LA BASE DE DATOS
    private static final String creaDB = "CREATE DATABASE IF NOT EXISTS `Instituto` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;";

    // CREACION DE LA TABLA MODULO
    private static final String creaModulo = "CREATE TABLE IF NOT EXISTS `Instituto`.`Modulo` ("
            + "`Codigo` INT NOT NULL,"
            + "`Nombre` VARCHAR(45) NOT NULL,"
            + "PRIMARY KEY (`Codigo`))"
            + "ENGINE = InnoDB;";

    // CREACION DE LA TABLA PROFESOR
    private static final String creaProfesor = "CREATE TABLE IF NOT EXISTS `Instituto`.`Profesor` ("
            + "`R.F.C` CHAR(15) NOT NULL,"
            + "  `Nombre` VARCHAR(25) NOT NULL,"
            + "  `ApellidoP` VARCHAR(25) NOT NULL,"
            + "  `ApellidoM` VARCHAR(25) NOT NULL,"
            + "  `Direccion` VARCHAR(25) NOT NULL,"
            + "  `Telefono` CHAR(10) NOT NULL,"
            + "  `Codigo_modulo` INT NULL,"
            + " PRIMARY KEY (`R.F.C`),"
            + "  INDEX `Codigo_modulo_idx` (`Codigo_modulo` ASC) VISIBLE,"
            + "  UNIQUE INDEX `R.F.C_UNIQUE` (`R.F.C` ASC) VISIBLE,"
            + "  CONSTRAINT `Codigo_modulo`"
            + "    FOREIGN KEY (`Codigo_modulo`)"
            + "    REFERENCES `Instituto`.`Modulo` (`Codigo`)"
            + "    ON DELETE RESTRICT"
            + "    ON UPDATE CASCADE)"
            + " ENGINE = InnoDB;";

    // CREACION DE LA TABLA ALUMNO
    private static final String creaAlumno = "CREATE TABLE IF NOT EXISTS `Instituto`.`Alumno` ("
            + "  `Expediente` INT NOT NULL,"
            + "  `Nombre` VARCHAR(25) NOT NULL,"
            + "  `ApellidoP` VARCHAR(25) NOT NULL,"
            + "  `ApellidoM` VARCHAR(25) NOT NULL,"
            + "  `FechaNac` DATE NOT NULL,"
            + "  `Delegado` BINARY NULL,"
            + "  PRIMARY KEY (`Expediente`),"
            + "  UNIQUE INDEX `Expediente_UNIQUE` (`Expediente` ASC) VISIBLE)"
            + " ENGINE = InnoDB;";

    // CREACION DE LA TABLA MODULO_ALUMNO
    private static final String creaDatos_Alumno = "CREATE TABLE IF NOT EXISTS `Instituto`.`Modulo_Alumno` ("
            + "  `idModulo_Alumno` INT NOT NULL,"
            + "  `Codigo_alumno` INT NULL,"
            + "  `Codigo_modulo` INT NULL,"
            + "  PRIMARY KEY (`idModulo_Alumno`),"
            + "  INDEX `Codigo_alumno_idx` (`Codigo_alumno` ASC) VISIBLE,"
            + "  INDEX `Codigo_modulo_idx` (`Codigo_modulo` ASC) VISIBLE,"
            + "  CONSTRAINT `Codigo_alumno`"
            + "    FOREIGN KEY (`Codigo_alumno`)"
            + "    REFERENCES `Instituto`.`Alumno` (`Expediente`)"
            + "    ON DELETE CASCADE"
            + "    ON UPDATE CASCADE,"
            + "  CONSTRAINT `Codigo_modulo`"
            + "    FOREIGN KEY (`Codigo_modulo`)"
            + "    REFERENCES `Instituto`.`Modulo` (`Codigo`)"
            + "    ON DELETE RESTRICT"
            + "    ON UPDATE CASCADE)"
            + " ENGINE = InnoDB;";

    public static void main(String[] args) {
        Connection conexion = null;
        Statement sentencia = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = (Connection) DriverManager.getConnection(url, user, password);
            sentencia = (Statement) conexion.createStatement();
            
            //CREO LA BASE DE DATOS
            sentencia.executeUpdate(creaDB);
            System.out.println("Base de datos 'Instituto' creada correctamente");
 
            // LIBERO RECURSOS
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.err.print(e);
        }
    }
}
