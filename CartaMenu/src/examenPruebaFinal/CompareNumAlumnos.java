package examenPruebaFinal;

import java.util.Comparator;

public class CompareNumAlumnos implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int numAlumnos=(Integer) ((Ej1Examen) o1).getNumAlumnos();
		int numAlumnos2=(Integer) ((Ej1Examen) o2).getNumAlumnos();
		if(numAlumnos>numAlumnos2){
			return 1;
		}else if(numAlumnos<numAlumnos2){
			return -1;
		}
		return 0;
	}
	
}
