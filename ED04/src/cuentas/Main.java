/**
 * Programa que crea una cuenta y retira e ingresa dinero en ella
 * @author Desconocido
 */
package cuentas;

/**
 * Clase principal
 */
public class Main {
	/**
	 * Método principal
	 * @param args String que se puede introducir desde la consola de comandos
	 */
    public static void main(String[] args) {

    	operativaCuenta(0);
    }

    /**
     * Crea una cuenta y realiza operativas
     * @param cantidad la cantidad con la que operar
     */
	private static void operativaCuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;
        /**
         * Constructor
         */
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
