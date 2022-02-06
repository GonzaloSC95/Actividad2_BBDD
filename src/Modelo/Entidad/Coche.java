package Modelo.Entidad;

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
/**
 *
 * @author Gonzalo
 */
public class Coche {

    //ATRIBUTOS
    private int id;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int numPasajeros;

    //CONSTRUCTOR CON TODOS LOS PARAMETROS
    /**
     *
     *
     * @param id
     * @param matricula
     * @param marca
     * @param color
     * @param modelo
     * @param numPasajeros
     */
    public Coche(int id, String matricula, String marca, String modelo, String color, int numPasajeros) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numPasajeros = numPasajeros;
    }

    //CONSTRUCTOR CON TODOS LOS PARAMETROS - ID
    /**
     *
     * @param matricula
     * @param marca
     * @param color
     * @param modelo
     * @param numPasajeros
     */
    public Coche(String matricula, String marca, String modelo, String color, int numPasajeros) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numPasajeros = numPasajeros;
    }

    //CONSTRUCTOR CON TODOS LOS PARAMETROS - numPasajeros

    /**
     *
     * @param id
     * @param matricula
     * @param marca
     * @param modelo
     * @param color
     */
    public Coche(int id, String matricula, String marca, String modelo, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //CONSTRUCTOR SIN PARAMETROS
    /**
     *
     */
    public Coche() {
    }

    //GETTERS Y SETTERS
    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }

    /**
     *
     * @param numPasajeros
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Coche " + id + "--> Matricula = " + matricula + " | Marca = "
                + marca + " | Modelo = " + modelo + " | Color = " + color
                + " | Nº de Pasajeros = " + numPasajeros + '.';
    }

    /**
     *
     * @return
     */
    public String toString2() {
        return "Coche " + "--> Matricula = " + matricula + " | Marca = "
                + marca + " | Modelo = " + modelo + " | Color = " + color
                + '.';
    }

}
