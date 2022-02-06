package Test;

import Modelo.Persistencia.DaoCocheMYSQL;
import Modelo.Persistencia.DaoPasajeroMYSQL;

public class PruebaConexion {

    public static void main(String[] args) {

        DaoCocheMYSQL daoCoche = new DaoCocheMYSQL();
        DaoPasajeroMYSQL daoPasajero = new DaoPasajeroMYSQL();

        System.out.println("PROBANDO LA CONEXION A LA BBDD CON DAO COCHE:\t"
                + daoCoche.abrirConexion());
        System.out.println("CERRANDO LA CONEXION A LA BBDD CON DAO COCHE:\t "
                + daoCoche.cerrarConexion());
        //---------------------------------------------------------------------------
        System.out.println("\nPROBANDO LA CONEXION A LA BBDD CON DAO PASAJERO:\t"
                + daoPasajero.abrirConexion());
        System.out.println("CERRANDO LA CONEXION A LA BBDD CON DAO PASAJERO:\t "
                + daoPasajero.cerrarConexion());

    }

}
