package ExJavaColeccion362013;

import java.util.Comparator;

public class CompararPG implements Comparator{
	@Override
	public int compare(Object o, Object o1) {
		Resultado c=(Resultado) o;
		Resultado c1=(Resultado) o1;
		if(c.getpG()>c1.getpG()){
			return 1;
		}else if(c.getpG()<c1.getpG()){
			return -1;
		}else{
			return 0;
		}
	}

}
