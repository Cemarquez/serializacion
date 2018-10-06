import javax.swing.JOptionPane;

public class Main {

	/**
	 * Clase principal desde la que se ejecuta el programa.
	 * @param args
	 */
	public static void main(String[] args) {
   
		Pasajero[] pasajeros;
		pasajeros = new Pasajero[2];

		Persistencia serializarPasajeros = new Persistencia();

		pasajeros[0] = new Pasajero("2", "Cesar", "Marquez", "No hay", "No hay", "No hay");
		pasajeros[1] = new Pasajero("1", "roberto", "castro", "No hay", "No hay", "No hay");

		serializarPasajeros.serializar(pasajeros);

		imprimirPersistencia(serializarPasajeros.deserializar());

	}
    /**
     * Método para imprimir el arreglo de tipo pasajeros que retorna el método deserializar() de la clase Persistencia.
     * @param pasajeros Arreglo de pasajeros.
     */
	public static void imprimirPersistencia(Pasajero[] pasajeros) {
		String nuevo = "";
		for (int i = 0; i < pasajeros.length; i++) {

			nuevo += pasajeros[i].obtenerApellido() + "\n";

		}
		JOptionPane.showMessageDialog(null, nuevo);

	}

}
