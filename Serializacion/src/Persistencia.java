import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.tools.FileObject;
/**
 * Clase para serializar.
 */
public class Persistencia {
    /**
     * Método para serializar el objeto que entra como párametro del mismo.
     * @param pPasajero Objeto a serializar.
     */
	public void serializar (Pasajero[] pPasajero)
	{
		try {
			
			FileOutputStream fos = new FileOutputStream("Pasajeros.dat");
			ObjectOutputStream oos =  new ObjectOutputStream(fos);
			oos.writeObject(pPasajero);
			oos.close();
			fos.close();	
		}
		
		
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
		
	}
	
	/**
	 * Método para leer el archivo .dat creado anteriormente por el método serializar y así poder modificarlo.
	 * @return Retorna un arreglo de pasajeros.
	 */
	public Pasajero[] deserializar()
	{
		Pasajero[] pasa=null;
		try
		{
		FileInputStream fis = new FileInputStream("Pasajeros.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		pasa = (Pasajero[]) ois.readObject();
		ois.close();
		fis.close();
	}
	
	catch (IOException ioe) 
	{
		ioe.printStackTrace();
	}
	
	catch (ClassNotFoundException cnfe)
	{
		cnfe.printStackTrace();
	}
		
		return pasa;
	}
	
	
}
