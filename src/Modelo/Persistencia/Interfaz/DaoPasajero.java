package Modelo.Persistencia.Interfaz;

/*CREATE TABLE PASAJEROS(
ID INT(11) NOT NULL UNIQUE AUTO_INCREMENT,
COCHEID INT(11) NOT NULL,
NOMBRE VARCHAR(45),
EDAD INT(11),
PESO FLOAT(11),
PRIMARY KEY (id),
FOREIGN KEY (COCHEID) REFERENCES COCHES(ID));*/
import Modelo.Entidad.Pasajero;
import Modelo.Persistencia.DaoCocheMYSQL;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Gonzalo Solís Campos
 */
public interface DaoPasajero {

    /**
     *
     * @param pasajero
     * @return
     */
    public boolean addPasajero(Pasajero pasajero);

    /**
     *
     * @param id
     * @param daoCocheMYSQL
     * @return
     */
    public boolean borrarPasajero(int id,DaoCocheMYSQL daoCocheMYSQL);

    /**
     *
     * @param id
     * @return
     */
    public Pasajero obtenerPasajero(int id);

    /**
     *
     * @return
     */
    public List<Pasajero> listarPasajeros();

    /**
     *
     * @param idPasajero
     * @param idCoche
     * @return
     */
    public boolean sacarPasajeroDeunCoche(int idPasajero, int idCoche);

    /**
     *
     * @param idPasajero
     * @param idCoche
     * @return
     */
    public boolean addPasajeroA_Coche(int idPasajero, int idCoche);

    /**
     *
     * @param idCoche
     * @return
     */
    public List<Pasajero> listaDePasajerosQueHayEnUnCoche(int idCoche);

    /**
     *
     * @param idCoche
     * @param conexion
     */
    public void sacarATodosLosPasajerosDeUnCoche(int idCoche, Connection conexion);

}
