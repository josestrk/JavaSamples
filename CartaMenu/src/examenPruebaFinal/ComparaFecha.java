package examenPruebaFinal;

import java.util.Comparator;

public class ComparaFecha implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Fecha f=(Fecha) ((Ej1Examinable)o1).getF();
		Fecha f2=(Fecha) ((Ej1Examinable)o2).getF();
			if(f.compareTo(f2)==1){
				return 1;
			}else if(f.compareTo(f2)==-1){
				return -1;
			}else{
				//return new ComparaHora().compare(o1, o2);
				Hora h=(Hora) ((Ej1Examinable)o1).getH();
				Hora h2=(Hora)((Ej1Examinable)o2).getH();
				if(h.compareTo(h2)==1){
					return 1;
				}else if(h.compareTo(h2)==-1){
					return -1;
				}else{
					//ojo si hay la misma hora no la sube al tree set
					return 0;
				}
			}
	}
	
}
