import java.util.Comparator;


public class CompararNumIngredientes implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		FastFoodeable f=(FastFoodeable) o1;
		FastFoodeable f2=(FastFoodeable) o2;
		if( f.getIngredientes().length>f2.getIngredientes().length)
			return 1;
		else if (f.getIngredientes().length<f2.getIngredientes().length)
			return -1;
		else
			return 0;
	}
	
}
