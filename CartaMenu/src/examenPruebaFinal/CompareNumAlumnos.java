package examenPruebaFinal;

import java.util.Comparator;

public class CompareNumAlumnos implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		try{
		int numAlumnos=(Integer) ((Ej1Examinable) o1).hayAlumnos();
		int numAlumnos2=(Integer) ((Ej1Examinable) o2).hayAlumnos();
		if(numAlumnos>numAlumnos2){
			return 1;
		}else if(numAlumnos<numAlumnos2){
			return -1;
		}
		return 0;
		}catch (HayPocos e){
			return 1;
		}
	}
	
}
