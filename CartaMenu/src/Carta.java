import java.util.*;


public class Carta {
	private Map<DiaSemana,Menu> carta;
	
	public Carta(){
		carta=new TreeMap();
	}
	
	public void add(DiaSemana dia,Menu m){
		carta.put(dia,m);
	}
	
	public Tiempo tiempoMendioMenu(DiaSemana diaS){
		Tiempo t = new Tiempo(carta.get(diaS).tiempoTotal());
		return t;
	}
	
	public Tiempo tiempoMedioCarta(){
		Tiempo t=new Tiempo();;
		int cont=0;
		Set s= carta.keySet();
		Iterator it=s.iterator();
		
		while(it.hasNext()){
			t.suma(carta.get(((DiaSemana) it.next())).tiempoTotal());
			cont++;
		}
		t.media(cont);
		return t;
	}
	public double porcentajeVejetariano(DiaSemana dia){
		double d = 0;
		return d;
	}
	
	public double porcentajeVejetariano(){
		double d = 0;
		return d;
	}
	
	public String toString(){
		String s = null;
		return s;
	}
	
}
