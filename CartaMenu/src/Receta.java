/*
 * Las recetas se componen de
 * ingredientes array con los nombres de ingredirentes
 * Lista enlazada de pasos para la preparación
 * Nombre de la receta
 * * Ejemplo:
 * 1. macarrones con tomate
 * 2. [macarrones],[agua],[tomate]
 * 3. lista -> verter [agua,0:10]->[verter en agua los macarrones,0:8]-> 
 * */

public class Receta {
	String nombre;
	String[] ingredientes;
	Lista pasosPreparacion;
	
	Receta(){
		nombre="";
		ingredientes=new String[100];
		pasosPreparacion=new Lista();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Lista getPasosPreparacion() {
		return pasosPreparacion;
	}

	public void setPasosPreparacion(Lista PasosPreparacion) {
		this.pasosPreparacion = PasosPreparacion;
	}
	
	public Tiempo tiempoTotal(){
		Tiempo t=new Tiempo();
		pasosPreparacion.TiempoTotal();
		return t;
	}
}
