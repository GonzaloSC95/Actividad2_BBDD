package Modelo.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class DaoCreateBBDD {

    private Connection conexion;

    /**
     *
     */
    public DaoCreateBBDD() {
        try {
            ArrayList<String> createBBDD = new ArrayList();
            //////////////////////////////////////////////////
            String url = "jdbc:mysql://localhost:3306/";
            String usuario = "root";
            String password = "";
            ///////////////////////////////////////
            String sqlCreateBBDD = "CREATE SCHEMA ACTIVIDAD2_BBDD;";
            String sqlUseBBDD = "USE ACTIVIDAD2_BBDD;";
            /////////////////////////////////////////////////////
            String sqlCoches = "CREATE TABLE COCHES ("
                    + "ID INT(11) NOT NULL UNIQUE AUTO_INCREMENT,"
                    + "MATRICULA varchar(45),"
                    + "MARCA varchar(45),"
                    + "MODELO  varchar(45),"
                    + "COLOR  varchar(45),"
                    + "NUM_PASAJEROS INT(11) DEFAULT 0 CHECK (NUM_PASAJEROS<=5 AND NUM_PASAJEROS>=0),"
                    + "PRIMARY KEY (id));";
            String sqlPasajeros = "CREATE TABLE PASAJEROS("
                    + "ID INT(11) NOT NULL UNIQUE AUTO_INCREMENT,"
                    + "COCHEID INT(11) NULL,"
                    + "NOMBRE VARCHAR(45),"
                    + "EDAD INT(11),"
                    + "PESO  DECIMAL(11,3),"
                    + "PRIMARY KEY (id),"
                    + "FOREIGN KEY (COCHEID) REFERENCES COCHES(ID) "
                    + "ON UPDATE SET NULL ON DELETE SET NULL);";
            ////////////////////////////////////////////////////////////// 
            createBBDD.add(sqlCoches);
            createBBDD.add(sqlPasajeros);
            ////////////////////////////////////////
            createBBDD.add("INSERT INTO COCHES (MATRICULA,MARCA,MODELO,COLOR,NUM_PASAJEROS) VALUES ('X12-548','Mercedes','Clase A','Negro',0);");
            createBBDD.add("INSERT INTO COCHES (MATRICULA,MARCA,MODELO,COLOR,NUM_PASAJEROS) VALUES ('X02-125','Alfa Romeo','500C','Rojo',0);");
            createBBDD.add("INSERT INTO COCHES (MATRICULA,MARCA,MODELO,COLOR,NUM_PASAJEROS)VALUES ('K82-589','BMW','A10','Gris',0);");
            createBBDD.add("INSERT INTO COCHES (MATRICULA,MARCA,MODELO,COLOR,NUM_PASAJEROS) VALUES ('X82-055','Abarth','4C','Verde',0);");
            createBBDD.add("INSERT INTO COCHES (MATRICULA,MARCA,MODELO,COLOR,NUM_PASAJEROS) VALUES ('M82-111','Ferrari','A9','Negro',0);");
            ////////////////////////////////////////////
            createBBDD.add("INSERT INTO PASAJEROS (COCHEID, NOMBRE, EDAD, PESO) VALUES (1,'Gonzalo',26,83.50);");
            createBBDD.add("INSERT INTO PASAJEROS (COCHEID, NOMBRE, EDAD, PESO) VALUES (1,'Roberto',20,70.50);");
            createBBDD.add("INSERT INTO PASAJEROS (COCHEID, NOMBRE, EDAD, PESO) VALUES (2,'Marcos',26,71.50);");
            createBBDD.add("INSERT INTO PASAJEROS (COCHEID, NOMBRE, EDAD, PESO) VALUES (3,'Juan',31,84.56);");
            createBBDD.add("INSERT INTO pasajeros (COCHEID, NOMBRE, EDAD, PESO) VALUES (1,'Pedro',18,70.98);");
            //////////////////////////////////////////////
            createBBDD.add("UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=1) WHERE ID=1;");
            createBBDD.add("UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=2) WHERE ID=2;");
            createBBDD.add("UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=3) WHERE ID=3;");
            createBBDD.add("UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=4) WHERE ID=4;");
            createBBDD.add("UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=5) WHERE ID=5;");
            createBBDD.add("UPDATE COCHES SET NUM_PASAJEROS=(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=6) WHERE ID=6;");
            ///////////////////////////////////////////////////////////////////////////////////////////
            conexion = DriverManager.getConnection(url, usuario, password);
            conexion.setAutoCommit(false);
            ///////////////////////////////////////////////////////
            Statement sentencia = conexion.createStatement();
            sentencia.addBatch(sqlCreateBBDD);
            sentencia.addBatch(sqlUseBBDD);
            System.out.println("Sentencias ejecutadas = " + sentencia.executeBatch());
            //////////////////////////////////////////////////////////////////////////////////
            for (String sql : createBBDD) {
                sentencia.addBatch(sql);
                System.out.println("Sentencia sql añadida = " + sql);
            }
            sentencia.executeBatch();
            System.out.println("BBDD CREADA");
            conexion.commit();
        } catch (SQLException e) {
            System.err.println("ERROR: " + e.getMessage());
            try {
                conexion.rollback();
                conexion.close();
            } catch (SQLException ex) {
            }
        }
    }

}
