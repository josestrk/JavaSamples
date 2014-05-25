import java.util.*;


public class Menu {
	private TreeSet<FastFoodeable> fastFood;
	
	
	public Tiempo tiempoTotal(){
		Tiempo t= new Tiempo();
		Iterator it=fastFood.iterator();
		
		while(it.hasNext()){
			t.suma(((FastFoodeable) it.next()).tiempoPreparacion());
		}
		
		return t;
	}
}
