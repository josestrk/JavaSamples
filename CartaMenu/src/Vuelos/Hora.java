package Vuelos;

public class Hora {
	private int h;
	private int mm;

	
	public Hora(){
		h=0;mm=0;
	}
	
	public Hora(int h,int mm){
		this.h=h;this.mm=mm;
	}
	
	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	//comparador
	public int comparteTo(Hora hora) {
		if(this.h>hora.getH()){
			return 1;
		}else if (this.h<hora.getH()){
			return -1;
		}else{
			if(this.mm>hora.getMm())
				return 1;
			else
				return -1;
		}
	}

	@Override
	public String toString() {
		return "<" + h + ":" + mm + ">";
	}
	
	
	//validar dias y meses
	
	
	
	
}
