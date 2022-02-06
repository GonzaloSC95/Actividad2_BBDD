package Controlador;

import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class Controlador {

    /**
     *
     * @param matricula
     * @param marca
     * @param modelo
     * @param color
     * @return
     */
    public boolean camposVaciosCoche(String matricula, String marca, String modelo, String color) {
        ArrayList<String> texto = new ArrayList();
        texto.add(matricula);
        texto.add(marca);
        texto.add(modelo);
        texto.add(color);
        //////////////////////////////
        for (String txt : texto) {
            if (txt.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param id
     * @param matricula
     * @param marca
     * @param modelo
     * @param color
     * @return
     */
    public boolean camposVaciosCoche2(String id, String matricula, String marca, String modelo, String color) {
        ArrayList<String> texto = new ArrayList();
        texto.add(matricula);
        texto.add(marca);
        texto.add(modelo);
        texto.add(color);
        //////////////////////////////
        for (String txt : texto) {
            if (txt.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param nombre
     * @param edad
     * @param peso
     * @return
     */
    public boolean camposVaciosPasajero(String nombre, String edad, String peso) {
        ArrayList<String> texto = new ArrayList();
        texto.add(nombre);
        texto.add(edad);
        texto.add(peso);
        //////////////////////////////
        for (String txt : texto) {
            if (txt.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param numeroConComas
     * @return
     */
    public String numeroDecimalSinComas(String numeroConComas) {
        return numeroConComas.replace(",", ".");
    }

}
