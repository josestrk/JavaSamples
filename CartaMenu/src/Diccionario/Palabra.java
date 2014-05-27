package Diccionario;
import java.util.*;

public class Palabra implements Traducible {
	private String pal;
	
	public Palabra(){
		this.pal="";
	}
	
	public Palabra(String pal){
		this.pal=pal;
	}

	public int traduce(Diccionario d) {
		Map dicAux=d.getDiccionario();		
		String claveAux;
		boolean sw=false;
		
		Set s=dicAux.keySet();
		Iterator it=s.iterator();
		
		while (it.hasNext()){
			claveAux=(String) it.next();
			if(claveAux.compareTo(this.pal)==0){
				this.pal=(String)dicAux.get(claveAux);
				sw=true;
			}
		}
		if(!sw){
			try {
				throw new ExcepcionPalabraNoExiste();
			} catch (ExcepcionPalabraNoExiste e) {
				System.out.println("La palabra no existe");
			}
		}
		
		return 1;
	}
	
	public double coste() {
		return 0.05;
	}
	
	public String toString(){
		return this.pal;
	}
	
}
