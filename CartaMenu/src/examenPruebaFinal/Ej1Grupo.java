package examenPruebaFinal;

public class Ej1Grupo {
	private String nombre;
	private int numeroModulos;
	
	public Ej1Grupo(){
		nombre="";
		numeroModulos=0;
	}
	public Ej1Grupo(String nombre,int numeroModulos){
		this.nombre=nombre;
		this.numeroModulos=numeroModulos;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int numeroModulos(){
		return numeroModulos;
	}
	
	public String toString(){
		return nombre+" Numero Modulos:"+numeroModulos;
	}
}
