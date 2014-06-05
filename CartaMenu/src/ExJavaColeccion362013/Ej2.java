package ExJavaColeccion362013;

public class Ej2 {
	public static void main(String[] args){ 

		String [] palabras = new String[4]; 

		palabras[1] = "palabra1"; 

		palabras[2] = "palabra2"; 

		palabras[3] = "palabra3"; 

		try{ 

		System.out.println(" antes del for "); 

		for (int i=1; i<palabras.length; i++){ 

		System.out.println(palabras[i%3]); 

		} 

		System.out.println(" despues del for "); 

		}catch (NullPointerException npe){ 

		System.out.println(" null pointer "); 

		}catch (ArrayIndexOutOfBoundsException aiobe){ 

		System.out.println(" array index out "); 

		}catch (Exception e){
			System.out.println(" exception "); 

		}finally{ 

		System.out.println(" todo bien? "); 

		} 

		}
}
