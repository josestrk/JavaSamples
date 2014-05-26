


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

	public Lista getPasosPrecaucion() {
		return pasosPreparacion;
	}

	public void setPasosPrecaucion(Lista pasosPrecaucion) {
		this.pasosPreparacion = pasosPrecaucion;
	}
	
	public Tiempo tiempoTotal(){
		Tiempo t=new Tiempo();
		pasosPreparacion.TiempoTotal();
		return t;
	}
}
