package EntradaSalida;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class PruebaEj2 {
	/* Flujo y filtros */
	public static void main(String arg[]){
		String nombreArchivo = "src/PruebaEj1.java";
		FileReader leer;
		BufferedReader filtro;
		String linea;
		
	//ahora leeremos el archivo copaprueba.txt
	try{
		leer = new FileReader(nombreArchivo);
		filtro = new BufferedReader(leer);
		
		linea = filtro.readLine();
		
		while(linea != null){
			System.out.println(linea);
			linea = filtro.readLine();
		}
		filtro.close();
		leer.close();
	}catch(IOException e){
		System.out.println("no se puede abrir el archivo para leer");
	}
}


}
