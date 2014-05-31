import java.util.*;


public class Menu {
	private TreeSet<FastFoodeable> fastFood;
	
	public Menu(Comparator c){
		fastFood=new TreeSet(c);
	}
	
	public void add(FastFoodeable o){
		fastFood.add(o);
	}
	
	public Tiempo tiempoTotal(){
		Tiempo t= new Tiempo();
		int c=0;
		Iterator it=fastFood.iterator();
		//recorre el objeto fastfoodeable(pizza o sanwich o receta) y saca el tiempo que nos llevaria hacerlos
		while(it.hasNext()){
			t.suma(((FastFoodeable) it.next()).tiempoPreparacion());
			c++;
		}
		t.media(c);
		
		return t;
	}



	public double isVegetariano() {
		double c=0;int t=0;
		Iterator it=fastFood.iterator();
		//recorre el objeto fastfoodeable(pizza o sanwich o receta) y saca la cantidad total 't' y la cantidad de vegetarianos 'c'
		while(it.hasNext()){
			if(((FastFoodeable) it.next()).isVegetariano()){
				c++;
			}
			t++;
		}
		c=c*100/t;
		return c;
	}
}
