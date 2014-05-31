
public class Paso {
	private String descripcion;
	private Tiempo tiempoPreparacion;
	
	public Paso(){
		descripcion="xxx";
		tiempoPreparacion=new Tiempo(1,1);
	}
	public Paso(String descrip, Tiempo tiempopre){
		this.descripcion=descrip;
		this.tiempoPreparacion=tiempopre;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public void setDescripcion(String s){
		this.descripcion=s;
	}
	
	public Tiempo getTiempoPreparacion(){
		return tiempoPreparacion;
	}
	
	public void setTiempoPreparacion(Tiempo t){
		this.tiempoPreparacion=t;
	}
	
	
	
}
