package Vuelos;

import java.util.Comparator;

public class Destino implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Vuelo a1=(Vuelo) o1;
		Vuelo a2=(Vuelo) o2;
		if(a1.getDestino().compareTo(a2.getDestino())>0)
			return 1;
		else if (a1.getDestino().compareTo(a2.getDestino())<0)
			return -1;
		return 0;
	}

}
