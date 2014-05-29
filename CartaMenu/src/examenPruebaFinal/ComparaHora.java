package examenPruebaFinal;

import java.util.Comparator;
public class ComparaHora implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Hora h=(Hora) o1;
		Hora h2=(Hora) o2;
		if(h.compareTo(h2)==1){
			return 1;
		}else if(h.compareTo(h2)==-1){
			return -1;
		}
		return 0;
	}

}
