package examenPruebaFinal;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import ejemplosTreeSetyMap.Producto;

public class Ej1Examenes implements Ej1Examinable{
	private TreeSet examenes;
	
	public Ej1Examenes(){
		ComparaFecha c=new ComparaFecha();
		examenes=new TreeSet(c);
	}
	
	public void setExamenes(TreeSet examenes){
		this.examenes=examenes;
	}
	
	
	public TreeSet getExamenes(){
		return examenes;
	}
	
	public void add(Ej1Examinable e){
		if(!examenes.add(e))System.out.println("no se introdujo "+e+" las horas coinciden con otro Examinable ya establecido para esa hora");;
	}
	
	
	public String toString(){
		String s="";
		Iterator it=examenes.iterator();
		while(it.hasNext()){
			s+=it.next()+"\n";
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
		return ((Ej1Examinable)examenes.first()).FechaprimerDia();
	}
	
	public void ordenado(Comparator c){
		TreeSet aux=new TreeSet(c);
		aux.addAll(this.getExamenes());
		setExamenes(aux);
	}

	@Override
	public Fecha getF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hora getH() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return null;
	}
}
