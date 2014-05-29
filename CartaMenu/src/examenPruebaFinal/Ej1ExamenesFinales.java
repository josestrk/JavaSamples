package examenPruebaFinal;

import java.util.*;

public class Ej1ExamenesFinales {
	private TreeMap<Ej1Grupo,Ej1Examenes> calendario;
	
	public Ej1ExamenesFinales(){
		calendario=new TreeMap<Ej1Grupo,Ej1Examenes>();
	}
	
	public TreeMap getCalendario(){
		return calendario;
	}
	
	public Ej1Examenes getExamenes(Ej1Grupo grupo){
		return calendario.get(grupo);
	}
	
	public void add(Ej1Grupo k,Ej1Examenes v){
		calendario.put(k, v);
	}
	
	public String toString(){
		String s="";
		
		Iterator it=this.calendario.keySet().iterator();
		while( it.hasNext()){
			Ej1Grupo clave=(Ej1Grupo)it.next();
			s+= clave+":\n"+calendario.get(clave)+"\n";
		}
		return s;
	}
}
