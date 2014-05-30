package EntradaSalida;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PruebaEj1 {
	/* Creamos un ficher de texto y lo copiamos en otro*/
	public static void main(String arg[]){
		String nombreArchivo = "ExamenesJunio.dat";
		FileReader leer;
		//estr flujo escribe en el nuevo fichero 
		FileWriter escribir;
		try{
			leer = new FileReader(nombreArchivo);
			try{
				escribir = new FileWriter("copiaprueba.txt");
				int c=leer.read();
				while(c!=-1){
					escribir.write(c);
					c=leer.read();
				}
				escribir.close();
				leer.close();
			}catch(IOException e){
				System.out.println("no se puede abrir el archivo para escribir");
			}
		}catch(IOException e){
			System.out.println("no se puede abrir el archivo para leer");
		}
		
		//ahora leeremos el archivo copaprueba.txt
		try{
			leer = new FileReader("copiaprueba.txt");
			int c=leer.read();
			while(c!=-1){
				System.out.print((char)c);
				c=leer.read();
			}
			leer.close();
		}catch(IOException e){
			System.out.println("no se puede abrir el archivo para leer");
		}
	}
	
}
