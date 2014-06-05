package ExJavaColeccion362013;

import java.util.Comparator;

public class CompararPuntos implements Comparator {

	@Override
	public int compare(Object o, Object o1) {
		Equipo c=(Equipo) o;
		Equipo c1=(Equipo) o1; 
		if(c.getRes().getPuntos()>c1.getRes().getPuntos()){
			return -1;
		}else if(c.getRes().getPuntos()<c1.getRes().getPuntos()){
			return 1;
		}else{
			return 0;
		}
	}

}

