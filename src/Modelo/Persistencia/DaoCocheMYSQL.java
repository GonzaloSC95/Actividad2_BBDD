/*CREATE SCHEMA ACTIVIDAD2_BBDD; USE ACTIVIDAD2_BBDD;*/

 /*CREATE TABLE COCHES (
ID INT(11) NOT NULL UNIQUE AUTO_INCREMENT,
MATRICULA varchar(45),
MARCA varchar(45),
MODELO  varchar(45),
COLOR  varchar(45),
NUM_PASAJEROS INT(11),
PRIMARY KEY (id));*/

 /*ALTER TABLE COCHES
ADD FOREIGN KEY (ID) REFERENCES PASAJEROS (COCHEID);*/
package Modelo.Persistencia;

import Modelo.Entidad.Coche;
import Modelo.Persistencia.Interfaz.DaoCoche;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo Solís Campos
 */
public class DaoCocheMYSQL implements DaoCoche {

    private Connection conexion;
    private DaoPasajeroMYSQL daoPasajeroMYSQL;

    /////////////MÉTODO ABRIR CONEXION A BBDD////////////////
    /**
     *
     * @return
     */
    public boolean abrirConexion() {
        String url = "jdbc:mysql://localhost:3306/actividad2_bbdd";
        String usuario = "root";
        String password = "";
        try {
            /////////////////////////////
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            System.out.println("Error = " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error = " + e.getMessage());
            return false;
        }
        return true;
    }

    /////////////MÉTODO CERRAR CONEXION A BBDD////////////////
    /**
     *
     * @return
     */
    public boolean cerrarConexion() {
        try {
            /////////////////////////////
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error = " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error = " + e.getMessage());
            return false;
        }
        return true;
    }

    /**
     *
     * @param coche
     * @return
     */
    @Override
    public boolean addCoche(Coche coche) {

        String sql = "INSERT INTO COCHES (MATRICULA,MARCA,MODELO,COLOR,NUM_PASAJEROS)"
                + "VALUES (?,?,?,?,?);";

        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            //////INSERTAMOS LOS VALORES//////////////////
            sentencia.setString(1, coche.getMatricula());
            sentencia.setString(2, coche.getMarca());
            sentencia.setString(3, coche.getModelo());
            sentencia.setString(4, coche.getColor());
            sentencia.setInt(5, coche.getNumPasajeros());
            ///////NUMERO DE REGISTROS INSERTADOS///////////////
            int numeroRegistrosInsertados = sentencia.executeUpdate();
            System.out.println("Numero de coches insertados: " + numeroRegistrosInsertados);
            System.out.println("Coche insertado: " + coche);

        } catch (SQLException e) {
            System.out.println("Registro no insertado: " + e.getMessage());
            return false;
        }
        return true;
    }

    /**
     *
     * @param id
     * @param daoPasajeroMYSQL
     * @return
     */
    @Override
    public boolean borrarCoche(int id, DaoPasajeroMYSQL daoPasajeroMYSQL) {

        String sql = "DELETE FROM COCHES WHERE ID=?;";
        daoPasajeroMYSQL.sacarATodosLosPasajerosDeUnCoche(id, conexion);
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            ///////NUMERO DE REGISTROS BORRADOS///////////////
            int numeroderegistrosBorrados = sentencia.executeUpdate();
            System.out.println("Numero de coches borrados: " + numeroderegistrosBorrados);
            if (numeroderegistrosBorrados == 0) {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Registro no borrado: " + e.getMessage());
            return false;
        }

        return true;

    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Coche obtenerCoche(int id) throws NullPointerException {
        Coche coche = new Coche();
        try {
            String sql = "SELECT * FROM COCHES WHERE ID=?;";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            ////////////////////COCHE OBTENIDO/////////////
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {

                coche.setId(resultado.getInt(1));
                coche.setMatricula(resultado.getString(2));
                coche.setMarca(resultado.getString(3));
                coche.setModelo(resultado.getString(4));
                coche.setColor(resultado.getString(5));
                coche.setNumPasajeros(resultado.getInt(6));
            }
            System.out.println("COCHE OBTENIDO: "
                    + coche);

            if (coche.getMatricula() == null) {
                System.out.println("No existe ningun coche con ese id");
                System.out.println("COCHE OBTENIDO: "
                        + coche);

            }

            return coche;
        } catch (SQLException ex) {
            return null;
        }

    }

    /**
     *
     * @param id
     * @param matricula
     * @param modelo
     * @param marca
     * @param color
     * @return
     */
    @Override
    public boolean modificarCoche(int id, String matricula, String marca, String modelo, String color) {
        try {
            String sql = "UPDATE COCHES "
                    + "SET MATRICULA=?, MARCA=? ,MODELO=?, COLOR=? "
                    + "WHERE ID=?;";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, matricula);
            sentencia.setString(2, marca);
            sentencia.setString(3, modelo);
            sentencia.setString(4, color);
            sentencia.setInt(5, id);
            /////COCHES MODIFICADOS///////////
            int numeroDeregistrosModificados = sentencia.executeUpdate();
            System.out.println("NUMERO DE COCHES MODIFICADOS = " + numeroDeregistrosModificados);
            if (numeroDeregistrosModificados == 0) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            System.out.println("Ningun coche fue modificado: " + e.getMessage());
            return false;
        }

    }

    /**
     *
     * @return
     */
    @Override
    public List<Coche> listarCoches() throws NullPointerException {
        List<Coche> listaDeCoches = new ArrayList<>();
        try {
            String sql = "SELECT * FROM COCHES;";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Coche coche = new Coche();
                coche.setId(resultado.getInt(1));
                coche.setMatricula(resultado.getString(2));
                coche.setMarca(resultado.getString(3));
                coche.setModelo(resultado.getString(4));
                coche.setColor(resultado.getString(5));
                coche.setNumPasajeros(resultado.getInt(6));
                listaDeCoches.add(coche);
            }

            return listaDeCoches;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }

    }

    /**
     *
     * @param idCoche
     * @return
     */
    @Override
    public boolean actualizarNumPasajeros(Connection conexion) {
        ArrayList idsCoches = new ArrayList();
        ////////////////////////////////////////////////////////
        String sqlUpdate = "UPDATE COCHES SET NUM_PASAJEROS="
                + "(SELECT COUNT(COCHEID) FROM PASAJEROS WHERE COCHEID=?) WHERE ID=?;";
        //---------------------------------------------------------------------------------
        String sqlQuery = "SELECT ID FROM COCHES;";
        try {
            //////////////////RECOGEMOS TODOS LOS IDS DE COCHE EN UN ARRAY/////////////////////////////////
            PreparedStatement sentenciaQuery = conexion.prepareStatement(sqlQuery);
            ResultSet rs1 = sentenciaQuery.executeQuery();
            while (rs1.next()) {
                idsCoches.add(rs1.getInt(1));
            }
            System.out.println("IDS DE LOS COCHES " + idsCoches.toString());
            ////////////////////////////////////////////////////////////////////////////////////////////
            PreparedStatement sentenciaUpdate = conexion.prepareStatement(sqlUpdate);
            for (int i = 0; i < idsCoches.size(); i++) {
                sentenciaUpdate.setInt(1, (int) idsCoches.get(i));
                sentenciaUpdate.setInt(2, (int) idsCoches.get(i));
                sentenciaUpdate.addBatch();
            }
            System.out.println("Numero de registros actualizados = " + sentenciaUpdate.executeBatch().length);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("No se ha podido actualizar la bbdd");
            return false;
        }
        return true;

    }

}
