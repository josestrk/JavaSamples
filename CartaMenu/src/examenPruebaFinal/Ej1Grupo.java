package examenPruebaFinal;

import java.io.Serializable;

public class Ej1Grupo implements Comparable,Serializable{
	private String nombre;
	private int numeroModulo;
	
	public Ej1Grupo(){
		nombre="";
		numeroModulo=0;
	}
	public Ej1Grupo(String nombre,int numeroModulos){
		this.nombre=nombre;
		this.numeroModulo=numeroModulos;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getNumeroModulos(){
		return numeroModulo;
	}
	
	public String toString(){
		return nombre+" NºModulo:"+numeroModulo;
	}
	@Override
	public int compareTo(Object o) {
		Ej1Grupo e=(Ej1Grupo) o;
		if(this.numeroModulo>e.getNumeroModulos()){
			return 1;
		}else if (this.numeroModulo<e.getNumeroModulos()){
			return -1;
		}
		return 0;
	}
}
