


public class Receta {
	String nombre;
	String[] ingredientes;
	Lista pasosPrecaucion;
	
	Receta(){
		nombre="";
		ingredientes=new String[100];
		pasosPrecaucion=new Lista();
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

	public Lista getPasosPrecaucion() {
		return pasosPrecaucion;
	}

	public void setPasosPrecaucion(Lista pasosPrecaucion) {
		this.pasosPrecaucion = pasosPrecaucion;
	}
	
	public Tiempo tiempoTotal(){
		Tiempo t=new Tiempo();
		
		return t;
	}
}
