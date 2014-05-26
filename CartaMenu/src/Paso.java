
public class Paso {
	private String descripcion;
	private Tiempo tiempoPreparacion;
	
	public Paso(){
		
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
		this.tiempoPreparacion.setH(t.getH());//pones la hora de 'tiempo' desde el getter de el tiempo que te meten
		this.tiempoPreparacion.setM(t.getM());//estableces los minutos con los getters ya que no se puede con iguales'='
	}
	
}
