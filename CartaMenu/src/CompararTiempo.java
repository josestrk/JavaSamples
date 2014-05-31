import java.util.Comparator;


public class CompararTiempo implements Comparator{

	public int compare(Object o1, Object o2) {
		FastFoodeable f=(FastFoodeable) o1;
		FastFoodeable f2=(FastFoodeable) o2;
		return f.tiempoPreparacion().compareTo(f2.tiempoPreparacion());
	}
}
