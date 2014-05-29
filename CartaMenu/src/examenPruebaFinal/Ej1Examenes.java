package examenPruebaFinal;

import java.util.Iterator;
import java.util.TreeSet;

import ejemplosTreeSetyMap.Producto;

public class Ej1Examenes implements Ej1Examinable{
	private TreeSet examenes;
	
	public Ej1Examenes(){
		examenes=new TreeSet();
	}
	
	public TreeSet getExamenes(){
		return examenes;
	}
	
	public void add(Ej1Examinable e){
		examenes.add(e);
	}
	
	
	public String toString(){
		String s="";
		Iterator it=examenes.iterator();
		while(it.hasNext()){
			s+=it.next();
		}
		return s;
	}

	@Override
	public int hayAlumnos() throws HayPocos {
		if(examenes.size()>10)
			return examenes.size();
		else
			throw new HayPocos();
	}

	@Override
	public Fecha FechaprimerDia() {
		Iterator it=examenes.iterator();
		return ((Ej1Examinable)it.next()).FechaprimerDia();
	}
}
