package examenPruebaFinal;

import java.util.*;

public class Ej1ExamenesFinales {
	private HashMap<Ej1Grupo,Ej1Examenes> calendario;
	
	public Ej1ExamenesFinales(){
		calendario=new HashMap<Ej1Grupo,Ej1Examenes>();
	}
	
	public HashMap getCalendario(){
		return calendario;
	}
	
	public Ej1Examenes getExamenes(Ej1Grupo grupo){
		return calendario.get(grupo);
	}
	
	public String toString(){
		String s="";
		Set t=calendario.entrySet();
		Iterator it=t.iterator();
		
		while( it.hasNext()){
			s+=it.next()+"\n";
		}
		return s;
	}
}
