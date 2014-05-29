package examenPruebaFinal;

import java.util.Comparator;

public class CompararModulo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	try{
		String Modulo=(String) ((Ej1Examen)o1).getModulo();
		String Modulo2=(String)((Ej1Examen)o2).getModulo();
		if(Modulo.compareTo(Modulo2)==1){
			return 1;
		}else if(Modulo.compareTo(Modulo2)==-11){
			return -1;
		}
		//porque si pongo cero no rellena el set??
		return 1;
	}catch (Exception e){
		return -1;
	}
	}

}
