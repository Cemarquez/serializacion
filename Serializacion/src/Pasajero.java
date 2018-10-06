import java.io.Serializable;

/**
 *  Pasajero del avión.
 */
public class Pasajero implements Serializable {

/**
 * Número de identificación o pasaporte del pasajero.
 */	
private String id;

/**
 * Nombre del pasajero.
 */
private String nombre; 

/**
 * Apellido del pasajero.
 */
private String apellido;

/**
 * Dirección de domicilio del pasajero.
 */
private String direccion;

/**
 * Correo electronico del pasajero.
 */
private String correo;

/**
 * Fecha de nacimiento del pasajero.
 */
private String fechaNacimiento;

/**
 * Carga total del pasajero en kilogramos.
 */
private int carga;


/**
 * Crea un pasajero con sus datos asignados.
 * @param id Número de identificación o pasaporte del pasajero.
 * @param nombre Nombre del pasajero.
 * @param apellido Dirección de domicilio del pasajero.
 * @param direccion Dirección de domicilio del pasajero.
 * @param correo Correo electronico del pasajero.
 * @param fechaNacimiento Fecha de nacimiento del pasajero.
 */
public Pasajero(String id, String nombre, String apellido, String direccion, String correo, String fechaNacimiento) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.direccion = direccion;
	this.correo = correo;
	this.fechaNacimiento = fechaNacimiento;
}

/**
 * Retorna la id del pasajero.
 * @return La id del pasajero.
 */
public String obtenerId() {
	return id;
}

/**
 * Retorna el nombre del pasajero.
 * @return El nombre del pasajero.
 */
public String obtenerNombre() {
	return nombre;
}

/**
 * Retorna el apellido del pasajero.
 * @return El apellido del pasajero.
 */
public String obtenerApellido() {
	return apellido;
}

/**
 * Retorna la direeción de domicilio del pasajero.
 * @return La direeción de domicilio del pasajero
 */
public String obtenerDireccion() {
	return direccion;
}

/**
 * Retorna el correo electronico del pasajero.
 * @return El correo electronico del pasajero.
 */
public String obtenerCorreo() {
	return correo;
}

/**
 * Retorna la fecha de nacimiento del pasajero.
 * @return La fecha de nacimiento del pasajero.
 */
public String obtenerFechaNacimiento() {
	return fechaNacimiento;
}

/**
 * Retorna la carga total del pasajero en kilogramos.
 * @return La carga total del pasajero en kilogramos.
 */
public int obtenerCarga() {
    return 	carga;
}

}
