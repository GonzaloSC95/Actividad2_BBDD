package Modelo.Persistencia.Interfaz;

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
import Modelo.Entidad.Coche;
import Modelo.Persistencia.DaoPasajeroMYSQL;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Gonzalo
 */
public interface DaoCoche {

    /**
     *
     * @param coche
     * @return
     */
    public boolean addCoche(Coche coche);

    /**
     *
     * @param id
     * @param daoPasajeroMYSQL
     * @return
     */
    public boolean borrarCoche(int id,DaoPasajeroMYSQL daoPasajeroMYSQL);

    /**
     *
     * @param id
     * @return
     */
    public Coche obtenerCoche(int id);

    /**
     *
     * @param id
     * @param matricula
     * @param marca
     * @param color
     * @param modelo
     * @return
     */
    public boolean modificarCoche(int id, String matricula, String marca, String modelo, String color);

    /**
     *
     * @return
     */
    public List<Coche> listarCoches();

    /**
     *
     * @param idCoche
     * @param conexion
     * @return
     */
    public boolean actualizarNumPasajeros(int idCoche, Connection conexion);

}
