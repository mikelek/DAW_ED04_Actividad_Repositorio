/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 * Clase CCuenta con las variables para guardar el nombre, número de cuenta, 
 * saldo y tipo de interés del cliente. Tiene los métodos getters y setters y
 * un método para ingresar dinero y otro para retirar.
 * @author Mikel Gil
 * @version 1.0
 */

public class CCuenta {

    /**
     * Variable de clase para almacenar el nombre
     */
    private String nombre;
    /**
     * Variable de clase para almacenar el número de cuenta
     */
    private String cuenta;
    /**
     * Variable de clase para almacenar el saldo
     */
    private double saldo;
    /**
     * Variable de clase para almacenar el tipo de interés
     */
    private double tipoInterés;

    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor con parametros para inicializar las variables con los valores
     * deseado
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés = tipo;
    }

   /**
    * Método para ingresar dinero en la cuenta. Modifica el saldo y lanza una 
    * excepción si se intenta ingresar un valor negativo
    * @param cantidad
    * @throws Exception 
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de la cuenta. Modifica el saldo y lanza dos 
     * excepciones. Una cuando se intenta retirar una cantidad negativa y otra 
     * cuando no hay suficiente saldo
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método para obtener el nombre
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para poner el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el tipo de interés
     * @return 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para poner el tipo de interés
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Método para obtener el número de cuenta
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para poner el número de cuenta
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el saldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para poner el saldo
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
