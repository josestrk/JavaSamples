package ExJavaColeccion362013;
/**
 * 
 * @author Jose
 * ej4
 * 
 */

import java.util.*;

import examenPruebaFinal.CompareNumAlumnos;
public class Liga {
	TreeSet liga;
	
	public Liga(){
		liga=new TreeSet();
	}
	
	public void add(Equipo eq){
		liga.add(eq);
	}
	
	public TreeSet getLiga(){
		return liga;
	}
	
	public void setLiga(TreeSet liga){
		this.liga=liga;
	}
	
	public void añadirResultadoPartido (String e1, String e2,int g1, int g2){
		//metemos dos equipos existentes
		Iterator it=liga.iterator();
		while(it.hasNext()){
			Equipo eq=((Equipo)it.next());
			if(e1==eq.getNombre()){	
				if(g1==g2){
					eq.getRes().setpE(eq.getRes().getpE()+1);
					eq.getRes().setPuntos(eq.getRes().getPuntos()+3);
				}else{
					eq.getRes().setpG(eq.getRes().getpG()+1);
					eq.getRes().setPuntos(eq.getRes().getPuntos()+1);
				}
				
				eq.getRes().setgF(eq.getRes().getgF()+g1);
				eq.getRes().setgC(eq.getRes().getgC()+g2);
			}else if(e2==eq.getNombre()){
				if(g1==g2){
					eq.getRes().setpE(eq.getRes().getpE()+1);
					eq.getRes().setPuntos(eq.getRes().getPuntos()+3);
				}else{
					eq.getRes().setpG(eq.getRes().getpG()+1);
					eq.getRes().setPuntos(eq.getRes().getPuntos()+1);
				}
				
				eq.getRes().setgF(eq.getRes().getgF()+g2);
				eq.getRes().setgC(eq.getRes().getgC()+g1);
			}
			
			
		}	
	}
	
	public void visualizar(Comparator c){
		TreeSet ordenado=new TreeSet(c);
		Iterator it=liga.iterator();
		while(it.hasNext()){
			ordenado.add(it.next());
		}
		System.out.println("\n"+ordenado+"\n");
	}
	
	
}
