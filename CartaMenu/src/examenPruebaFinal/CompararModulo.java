package examenPruebaFinal;

import java.util.Comparator;

public class CompararModulo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	try{
		String str=(String) ((Ej1Examinable)o1).getString();
		String str2=(String)((Ej1Examinable)o2).getString();
		if(str.compareTo(str2)==1){
			return 1;
		}else if(str.compareTo(str2)==-1){
			return -1;
		}
		//porque si pongo cero no rellena el set??
		return 1;
	}catch (Exception e){
		return -1;
	}
	}

}
