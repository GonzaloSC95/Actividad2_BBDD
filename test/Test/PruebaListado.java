package Test;

import Modelo.Entidad.Coche;
import Modelo.Entidad.Pasajero;
import Modelo.Persistencia.DaoCocheMYSQL;
import Modelo.Persistencia.DaoPasajeroMYSQL;

public class PruebaListado {

    public static void main(String[] args) {
        DaoCocheMYSQL daoCoche = new DaoCocheMYSQL();
        DaoPasajeroMYSQL daoPasajero = new DaoPasajeroMYSQL();

        System.out.println("PROBANDO LA CONEXION A LA BBDD CON DAO COCHE:\t"
                + daoCoche.abrirConexion());
        try {
            for (Coche coche : daoCoche.listarCoches()) {
                System.out.println(coche);
            }
        } catch (NullPointerException e) {
            System.out.println("No hay ningun coche en la bbdd: " + e.getMessage());
        }

        System.out.println("CERRANDO LA CONEXION A LA BBDD CON DAO COCHE:\t "
                + daoCoche.cerrarConexion());
        //---------------------------------------------------------------------------
        System.out.println("\nPROBANDO LA CONEXION A LA BBDD CON DAO PASAJERO:\t"
                + daoPasajero.abrirConexion());
        try {
            for (Pasajero pasajero : daoPasajero.listarPasajeros()) {
                System.out.println(pasajero);
            }
            ///////////////////////////////////////////////////////////////////////////
            System.out.println("\n------------------------------------------------\n");
            ////////////////////////////////////////////////////////////////////////////
            for (Pasajero pasajero : daoPasajero.listaDePasajerosQueHayEnUnCoche(1)) {
                System.out.println(pasajero);
            }

        } catch (NullPointerException e) {
            System.out.println("NO HAY PASAJEROS EN ESE COCHE O EN ESA BBDD: " + e.getMessage());

        }
        System.out.println("CERRANDO LA CONEXION A LA BBDD CON DAO PASAJERO:\t "
                + daoPasajero.cerrarConexion());
    }

}
