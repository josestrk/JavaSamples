import java.util.*;


public class Carta {
	private Map<DiaSemana,Menu> carta;
	
	public Carta(){
		carta=new HashMap();
	}
	
	public void add(DiaSemana dia,Menu m){
		//introducimos en el map una lista que contenga dias de la semana y y el menu del dia
		//ya sea un sandwich pizza o lo que sea
		carta.put(dia,m);
	}
	
	//queremos calcular el tiempo que nos lleva hacer un menu cada dia
	public Tiempo tiempoMedioMenu(DiaSemana diaS){
		
		Tiempo t = new Tiempo(carta.get(diaS).tiempoTotal());
		return t;
	}
	
	public Tiempo tiempoMedioCarta(){
		Tiempo t=new Tiempo();;
		int cont=0;
		Set s= carta.keySet();
		Iterator it=s.iterator();
		
		while(it.hasNext()){
			t.suma(carta.get(  ((DiaSemana) it.next())   ).tiempoTotal());
			cont++;
		}
		t.media(cont);
		return t;
	}
	public double porcentajeVejetariano(DiaSemana dia){
		return carta.get(dia).isVegetariano();
	}
	
	public double porcentajeVejetariano(){
		double d = 0;
		Set s= carta.keySet();
		Iterator it=s.iterator();
		while(it.hasNext()){
			d+=porcentajeVejetariano((DiaSemana) it.next());
		}
		return d;
	}
	
	public String toString(){
		String s = null;
		return s;
	}
	
}
