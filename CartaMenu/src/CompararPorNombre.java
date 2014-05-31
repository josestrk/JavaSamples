import java.util.Comparator;


public class CompararPorNombre implements Comparator{

	@Override
	public int compare(Object o, Object o1) {
		FastFoodeable c=(FastFoodeable) o;
		FastFoodeable c1=(FastFoodeable) o1;
		return c.getNombre().compareTo(c1.getNombre());
	}

}
