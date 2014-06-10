package ejemplosTreeSetyMap;
/*
 * - Un TreeSet no permite elementos duplicados. 
	- Un TreeSet mantiene la lista ordenada. 
	- El elemento a comparar debe contar con métodos equals, hashCode y compareTo. 

 */

import java.util.*; 
public class MercadoTreeSet 
{ 
	public static void main(String args[]) 
	{
		// Definir 5 instancias de la Clase Producto 
		Producto pan = new Producto("Pan", 6); 
		Producto leche = new Producto("Leche", 2); 
		Producto manzanas = new Producto("Manzanas", 5); 
		Producto brocoli = new Producto("Brocoli", 2); 
		Producto carne = new Producto("Carne", 2); 
		Producto res = new Producto("Carne", 3); 
		
		// Definir un TreeSet 
		TreeSet lista = new TreeSet(); 
		
		lista.add(pan); 
		lista.add(leche); 
		lista.add(manzanas); 
		lista.add(brocoli); 
		lista.add(carne); 
		lista.add(res); 
		
		// Imprimir contenido de TreeSet 
		// Aunque se agregan 6 elementos, el TreeSet solo contiene 5 
		// TreeSet no permite elementos duplicados, 
		// TreeSet detecta que el elemento "Carne" esta duplicado 
		// Notese que el orden del TreeSet refleja un orden ascendente 
		mostrarLista(lista); 
		
		// No es posible eliminar elementos por indice 
		// Un TreeSet solo elimina por valor de Objeto 
		lista.remove(manzanas); 
		mostrarLista(lista); 
		
		// Eliminar todos los valores del TreeSet 
		lista.clear(); 
		mostrarLista(lista);
		}
		
		public static void mostrarLista(Collection lista) {
		System.out.println(" Lista del mercado con " + lista.size() + 
		" productos"); 
		for( Iterator it = lista.iterator(); it.hasNext();) {
		Producto producto = (Producto)it.next(); 
		System.out.println(producto);
		}
	}
}