package ExJavaColeccion362013;
/**
 * 
 * @author Jose
 * ej4
 * 
 */
import java.util.*;
public class Conjunto {
	private HashMap jug;
	
	public Conjunto(){
		jug=new HashMap();
	}
	
	public Set getNumeros(){
		return jug.keySet();
	}
	
	public String getNombres(){
		String s="";
		Iterator it=jug.keySet().iterator();
		while(it.hasNext()){
			s+=jug.get(it.next());
		}
		return s;
	}
	
	public String toString(){
		String s="";
		Iterator it=jug.keySet().iterator();
		while(it.hasNext()){
			int k=(int) it.next();
			s+="\n"+k+"-"+jug.get(k);
		}
		return s;
	}
	//fichaje
	public void anadirFichaje(int num,String nom) throws ImposibleFichaje{
		if(jug.keySet().contains(num)){
			throw new ImposibleFichaje();
		}else{
			put(num,nom);
		}
	}
	public void put(int numero,String nombre){
		jug.put(numero, nombre);
	}
	
	public int size(){
		int cantidad=0;
		Iterator it=jug.keySet().iterator();
		while(it.hasNext()){
			it.next();
			cantidad++;
		}
		return cantidad;
	}
}
