/*CREATE TABLE PASAJEROS(
ID INT(11) NOT NULL UNIQUE AUTO_INCREMENT,
COCHEID INT(11) NOT NULL,
NOMBRE VARCHAR(45),
EDAD INT(11),
PESO  DECIMAL(11,3),
PRIMARY KEY (id));*/
package Modelo.Persistencia;

import Modelo.Entidad.Pasajero;
import Modelo.Persistencia.Interfaz.DaoPasajero;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo Solís Campos
 */
public class DaoPasajeroMYSQL implements DaoPasajero {

    private Connection conexion;
    private DaoCocheMYSQL daoCocheMYSQL;

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
            JOptionPane.showMessageDialog(null, "Error de conexion con la bbdd", null, JOptionPane.WARNING_MESSAGE);
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
     * @param pasajero
     * @return
     */
    @Override
    public boolean addPasajero(Pasajero pasajero) {
        String sql = "INSERT INTO PASAJEROS (NOMBRE,EDAD,PESO)"
                + "VALUES (?,?,?);";

        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            //////INSERTAMOS LOS VALORES//////////////////
            sentencia.setString(1, pasajero.getNombre());
            sentencia.setInt(2, pasajero.getEdad());
            sentencia.setDouble(3, pasajero.getPeso());
            ///////NUMERO DE REGISTROS INSERTADOS///////////////
            int numeroRegistrosInsertados = sentencia.executeUpdate();
            System.out.println("Numero de pasajeros insertados: " + numeroRegistrosInsertados);
            if (numeroRegistrosInsertados == 0) {
                return false;
            }
            System.out.println("Pasajero insertado: " + pasajero);

        } catch (SQLException e) {
            System.out.println("Registro no insertado: " + e.getMessage());
            return false;
        }
        return true;

    }

    /**
     *
     * @param id
     * @param daoCocheMYSQL
     * @return
     */
    @Override
    public boolean borrarPasajero(int id, DaoCocheMYSQL daoCocheMYSQL) {

        String sql1 = "SELECT COCHEID FROM PASAJEROS WHERE ID=?";
        String sql2 = "DELETE FROM PASAJEROS WHERE ID=?";
        try {
            PreparedStatement sentencia1 = conexion.prepareStatement(sql1);
            sentencia1.setInt(1, id);
            ResultSet resultado = sentencia1.executeQuery();
            int cocheId = 0;
            while (resultado.next()) {
                cocheId = resultado.getInt(1);
            }
            ///////////////////////////////////////////////////
            PreparedStatement sentencia2 = conexion.prepareStatement(sql2);
            sentencia2.setInt(1, id);
            ///////NUMERO DE REGISTROS BORRADOS///////////////
            int numeroderegistrosBorrados = sentencia2.executeUpdate();
            System.out.println("Numero de pasajeros borrados: " + numeroderegistrosBorrados);
            if (numeroderegistrosBorrados == 0) {
                return false;
            }
            System.out.println("Tabla coches actualizada: "
                    + daoCocheMYSQL.actualizarNumPasajeros(cocheId, conexion));
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
    public Pasajero obtenerPasajero(int id) {
        Pasajero pasajero = new Pasajero();
        try {
            String sql = "SELECT * FROM PASAJEROS WHERE ID=?";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            ////////////////////COCHE OBTENIDO/////////////
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {

                pasajero.setId(resultado.getInt(1));
                pasajero.setCocheID(resultado.getInt(2));
                pasajero.setNombre(resultado.getString(3));
                pasajero.setEdad(resultado.getInt(4));
                pasajero.setPeso(resultado.getDouble(5));
            }
            System.out.println("PASAJERO OBTENIDO: "
                    + pasajero);
            if (pasajero.getNombre() == null) {
                System.out.println("No existe ningun pasajero con ese id");
            }

            return pasajero;
        } catch (SQLException ex) {
            return null;
        }

    }

    /**
     *
     * @return
     */
    @Override
    public List<Pasajero> listarPasajeros() throws NullPointerException {
        List<Pasajero> listaDePasajeros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PASAJEROS";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Pasajero pasajero = new Pasajero();
                pasajero.setId(resultado.getInt(1));
                pasajero.setCocheID(resultado.getInt(2));
                pasajero.setNombre(resultado.getString(3));
                pasajero.setEdad(resultado.getInt(4));
                pasajero.setPeso(resultado.getDouble(5));
                listaDePasajeros.add(pasajero);
            }

            return listaDePasajeros;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

    /**
     *
     * @param idPasajero
     * @param idCoche
     * @return
     */
    @Override
    public boolean sacarPasajeroDeunCoche(int idPasajero, int idCoche) {
        try {
            daoCocheMYSQL = new DaoCocheMYSQL();
            /////////////////////////////////////
            String sql = "UPDATE PASAJEROS SET COCHEID=NULL  WHERE ID = ?;";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, idPasajero);
            ////////////////NUMERO DE REGISTROS ACTUALIZADOS/////////////
            int numRegistrosActualizados = sentencia.executeUpdate();
            System.out.println("Numero de registros actualizados = " + numRegistrosActualizados);
            //////////////////////ACTUALIZAMOS LAS PLAZAS DEL COCHE///////////////////////////
            daoCocheMYSQL.actualizarNumPasajeros(idCoche, conexion);
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    /**
     *
     * @param idPasajero
     * @param idCoche
     * @return
     */
    @Override
    public boolean addPasajeroA_Coche(int idPasajero, int idCoche) {
        daoCocheMYSQL = new DaoCocheMYSQL();
        ///////////////////////////////////////
        try {
            int numeroDePasajerosActual = numeroDepasajerosActual(idCoche);
            /////////////////////////////////////////////
            if (numeroDePasajerosActual >= 5) {
                System.out.println("Ya hay 5 pasajeros "
                        + "en el coche con ID=" + idCoche
                        + ", su capacidad esta al maximo");
                return false;
            } else {
                ////////////////SENTENCIA 2/////////////////////////////
                String sql2 = "UPDATE PASAJEROS SET COCHEID=? WHERE ID=?;";
                PreparedStatement sentencia2 = conexion.prepareStatement(sql2);
                sentencia2.setInt(1, idCoche);
                sentencia2.setInt(2, idPasajero);
                ////////////////NUMERO DE REGISTROS ACTUALIZADOS/////////////
                int numeroDeregistrosActualizados = sentencia2.executeUpdate();
                System.out.println("Numero de registros actualizados = " + numeroDeregistrosActualizados);
                //////////////////////ACTUALIZAMOS LAS PLAZAS DEL COCHE///////////////////////////
                daoCocheMYSQL.actualizarNumPasajeros(idCoche, conexion);
                return true;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("No se ha podido añadir al pasajero "
                    + "con ID=" + idPasajero
                    + " en el coche con ID=" + idCoche);
            return false;
        }

    }

    /**
     *
     * @param idCoche
     * @return
     * @throws NullPointerException
     */
    @Override
    public List<Pasajero> listaDePasajerosQueHayEnUnCoche(int idCoche) throws NullPointerException {
        List<Pasajero> listaDePasajeros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PASAJEROS WHERE COCHEID=?;";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, idCoche);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                Pasajero pasajero = new Pasajero();
                pasajero.setId(resultado.getInt(1));
                pasajero.setCocheID(resultado.getInt(2));
                pasajero.setNombre(resultado.getString(3));
                pasajero.setEdad(resultado.getInt(4));
                pasajero.setPeso(resultado.getDouble(5));
                listaDePasajeros.add(pasajero);
            }

            if (listaDePasajeros.isEmpty()) {
                //NO HAY PASAJEROS EN ESE COCHE
                return null;
            }

            return listaDePasajeros;
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
    public int numeroDepasajerosActual(int idCoche) {
        //////////////////////////////////
        int numeroDePasajerosActual = 0;
        String sql1 = "SELECT NUM_PASAJEROS FROM COCHES WHERE ID=?;";
        PreparedStatement sentencia1;
        try {
            sentencia1 = conexion.prepareStatement(sql1);
            sentencia1.setInt(1, idCoche);
            ResultSet resultado = sentencia1.executeQuery();
            while (resultado.next()) {
                numeroDePasajerosActual = resultado.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return numeroDePasajerosActual;
    }

    /**
     *
     * @param idCoche
     * @param conexion
     */
    @Override
    public void sacarATodosLosPasajerosDeUnCoche(int idCoche, Connection conexion) {
        try {
            String sql = "UPDATE PASAJEROS SET COCHEID=NULL WHERE COCHEID=?;";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, idCoche);
            int numeroDeRegistrosActualizados = sentencia.executeUpdate();
            System.out.println("Número de registros actualizados = " + numeroDeRegistrosActualizados);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
