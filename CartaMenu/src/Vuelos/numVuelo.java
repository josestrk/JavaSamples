package Vuelos;

import java.util.Comparator;

public class numVuelo implements Comparator {
	//como comparar
	
	@Override
	public int compare(Object o1, Object o2) {
		Vuelo a1=(Vuelo) o1;
		Vuelo a2=(Vuelo) o2;
		if(a1.getNumVuelo()>a2.getNumVuelo()){
			return 1;
		}else if(a1.getNumVuelo()==a2.getNumVuelo() ){
			return 0;
		}
		return -1;
	}

}
