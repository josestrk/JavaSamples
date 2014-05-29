package examenPruebaFinal;

import java.util.Comparator;

public class ComparaFecha implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Fecha f=(Fecha) o1;
		Fecha f2=(Fecha) o2;
			if(f.compareTo(f2)==1){
				return 1;
			}else if(f.compareTo(f2)==-1){
				return -1;
			}
		return 0;
	}
	
}
