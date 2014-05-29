package ejemplosTreeSetyMap;

import java.util.*; 
public class Producto implements Comparable { 

	private String nombre; 
	private int cantidad; 
	
	public Producto(String s, int i) {
		nombre = s; 
		cantidad = i;
	} 
	
	public String toString(){
		return ("Nombre: "+nombre+" Cantidad: "+cantidad);
	} 
	
	public String getNombre() {
		return this.nombre;
	} 
	
	public boolean equals( Object objeto ) {
		// Indica en base a que atributos se iguala el objeto 
		if (objeto == null) return false; 
			Producto producto = (Producto)objeto; 
		if (this.getNombre().equals(producto.getNombre()) ) return true; 
		
		return false;
	} 
	
	
	public int compareTo( Object objeto ) {
		// Indica en base a que atributos se compara el objeto 
		// Devuelve +1 si this es > que objeto 
		// Devuelve -1 si this es < que objeto 
		// Devuelve 0 si son iguales 
		
		Producto producto = (Producto)objeto; 
		String nombreObjeto = producto.getNombre().toLowerCase(); 
		String nombreThis = this.getNombre().toLowerCase(); 
		
		return( nombreThis.compareTo( nombreObjeto ) );
	}
} 


