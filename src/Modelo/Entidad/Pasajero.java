package Modelo.Entidad;

/*CREATE TABLE PASAJEROS(
ID INT(11) NOT NULL UNIQUE AUTO_INCREMENT,
COCHEID INT(11) NOT NULL,
NOMBRE VARCHAR(45),
EDAD INT(11),
PESO  DECIMAL(11,3),
PRIMARY KEY (id));*/
/**
 *
 * @author Gonzalo
 */
public class Pasajero {

    //ATRIBUTOS
    private int id;
    private int cocheID;
    private String nombre;
    private int edad;
    private double peso;

    //CONSTRUCTOR CON TODOS LOS PARAMETROS
    /**
     *
     * @param id
     * @param nombre
     * @param edad
     * @param cocheID
     * @param peso
     */
    public Pasajero(int id, String nombre, int edad, double peso, int cocheID) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.cocheID = cocheID;
    }

    ///CONSTRUCTOR CON TODOS LOS PARAMETROS - ID
    /**
     *
     * @param nombre
     * @param edad
     * @param peso
     */
    public Pasajero(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    //CONSTRUCTOR SIN PARAMETROS
    /**
     *
     */
    public Pasajero() {
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
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public double getPeso() {
        return peso;
    }

    /**
     *
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     *
     * @return
     */
    public int getCocheID() {
        return cocheID;
    }

    /**
     *
     * @param cocheID
     */
    public void setCocheID(int cocheID) {
        this.cocheID = cocheID;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Pasajero " + id + "--> Nombre = "
                + nombre + " | Edad = " + edad + " | Peso = "
                + peso + " | ID Coche = " + cocheID + '.';
    }

    /**
     *
     * @return
     */
    public String toString2() {
        return "Pasajero --> Nombre = "
                + nombre + " | Edad = " + edad + " | Peso = "
                + peso + '.';
    }

}
