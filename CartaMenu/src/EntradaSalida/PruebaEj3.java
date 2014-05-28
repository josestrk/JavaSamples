package EntradaSalida;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class PruebaEj3 {
	public static void main(String arg[]){
		FileOutputStream f;
		try{
		f = new FileOutputStream("Datos.dat");
		for (int i = 0; i < 100; i++)
			f.write(i);
		f.close();
		}catch(IOException e){System.out.println("No se pudo abrir el archivo para escribir");}
		
		FileInputStream d;
		try{
			d = new FileInputStream("Datos.dat");
			int dato=d.read();
			while(dato != -1)
			{
				System.out.print(dato+"-");
				dato=d.read();
			}
			d.close();
		}catch(IOException e){System.out.println("No se pudo abrir el archivo para leer");}
		
	}
}
