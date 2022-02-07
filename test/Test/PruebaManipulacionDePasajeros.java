package Test;

import Modelo.Persistencia.DaoPasajeroMYSQL;

public class PruebaManipulacionDePasajeros {

    public static void main(String[] args) {
        //////////////////////////////////////////////////
        DaoPasajeroMYSQL daoPasajeroMYSQL = new DaoPasajeroMYSQL();
        ////////////////////////////////////////////////////////////

        System.out.println("Conexion a BBDD = " + daoPasajeroMYSQL.abrirConexion());
        ////////////////////////////////////////////////////////////////////////////

        System.out.println("Pasajero añadido a un coche = " + daoPasajeroMYSQL.addPasajeroA_Coche(2, 2));
        //System.out.println("Pasajero sacado de un coche = " + daoPasajeroMYSQL.sacarPasajeroDeunCoche(1, 2));

        /////////////////////////////////////////////////////////////////////////////
        System.out.println("BBDD cerrada = " + daoPasajeroMYSQL.cerrarConexion());
        
       

    }

}
