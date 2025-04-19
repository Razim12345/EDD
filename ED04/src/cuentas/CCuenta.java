//cambio en el código


package cuentas;
/**
 * Cuenta bancaria
 */
public class CCuenta {

	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor sobrecargado
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo inicial
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * getNombre
     * @return nombre nombre del propietario de la cuenta
     */
    public String getNombre() {
		return nombre;
	}
    /**
     * setNombre da un valor al atributo nombre del propietario de la cuenta
     * @param nombre nombre del propietario de la cuenta
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * getCuenta
	 * @return importe actual de la cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * setCuenta establece el número de cuenta
	 * @param cuenta importe de la cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * getSaldo 
	 * @return el saldo actual de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Establece el saldo de la cuenta
	 * @param saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * getTipoInterés
	 * @return tipo de interés de la cuenta
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * Establece el tipo de interés de la cuenta
	 * @param tipoInterés el tipo de interés de la cuenta
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    
    /**
     * Estado de la cuenta
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * Ingreso en cuenta
     * @param cantidad importe a igresar
     * @throws Exception en caso de introducir una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Retirada de cuenta
     * @param cantidad importe a retirar
     * @throws Exception en caso de no haber suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}




