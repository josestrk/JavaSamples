package ExJavaColeccion362013;

import java.util.Comparator;

public class CompararNumF implements Comparator {

	@Override
	public int compare(Object o, Object o1) {
		Equipo c=(Equipo) o;
		Equipo c1=(Equipo) o1;
		if(c.getConjunto().size()>c1.getConjunto().size()){
			return 1;
		}else if(c.getConjunto().size()<c1.getConjunto().size()){
			return -1;
		}else{
			return 0;
		}
	}

}
