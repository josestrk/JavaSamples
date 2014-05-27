package Vuelos;

import java.util.Comparator;

public class FyH implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// comparar por fecha y luego las horas para ordenar
		Vuelo a1=(Vuelo) o1;
		Vuelo a2=(Vuelo) o2;
		if(a1.getFecha().comparteTo(a2.getFecha())==1 || a1.getFecha().comparteTo(a2.getFecha())==0){
			if(a1.getHora().comparteTo(a2.getHora())==1)
				return 1;
			else
				return -1;
		}else if(a1.getFecha().comparteTo(a2.getFecha())==-1){
			return -1;
		}
		return 0;
	}

}
