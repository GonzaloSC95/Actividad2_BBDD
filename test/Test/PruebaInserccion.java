package Test;

import Modelo.Entidad.Coche;
import Modelo.Entidad.Pasajero;
import Modelo.Persistencia.DaoCocheMYSQL;
import Modelo.Persistencia.DaoPasajeroMYSQL;

public class PruebaInserccion {

    public static void main(String[] args) {

        DaoCocheMYSQL daoCoche = new DaoCocheMYSQL();
        DaoPasajeroMYSQL daoPasajero = new DaoPasajeroMYSQL();
        //---------------ADD COCHES-------------------------------------
        System.out.println("PROBANDO LA CONEXION A LA BBDD CON DAO COCHE:\t"
                + daoCoche.abrirConexion());
        daoCoche.addCoche(new Coche("XYW-123", "Mercedes", "A7", "Negro", 2));
        //------------------------------------------------------
        System.out.println("CERRANDO LA CONEXION A LA BBDD CON DAO COCHE:\t "
                + daoCoche.cerrarConexion());
        //---------------ADD PASAJEROS-------------------------------------
        System.out.println("\nPROBANDO LA CONEXION A LA BBDD CON DAO PASAJERO:\t"
                + daoPasajero.abrirConexion());
        daoPasajero.addPasajero(new Pasajero("Ramon", 29, 60.95));
        //------------------------------------------------------------
        System.out.println("CERRANDO LA CONEXION A LA BBDD CON DAO PASAJERO:\t "
                + daoPasajero.cerrarConexion());

    }

}
