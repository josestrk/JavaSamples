import java.util.*;


public class Menu {
	private TreeSet<FastFoodeable> fastFood;
	
	
	public Tiempo tiempoTotal(){
		Tiempo t= new Tiempo();
		Iterator it=fastFood.iterator();
		//recorre el objeto fastfoodeable(pizza o sanwich o receta) y saca el tiempo que nos llevaria hacerlos
		while(it.hasNext()){
			t.suma(((FastFoodeable) it.next()).tiempoPreparacion());
		}
		
		return t;
	}
}
