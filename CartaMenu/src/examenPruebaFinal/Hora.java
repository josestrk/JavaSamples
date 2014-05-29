package examenPruebaFinal;

public class Hora implements Comparable {
	private int h;
	private int m;
	
	public Hora(){
		h=0;
		m=0;
	}
	public Hora(int h,int m){
		this.h=h;
		this.m=m;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public String toString(){
		return h+":"+m;
	}
	
	public int compareTo(Object o){
		Hora hora=(Hora) o;
		if(this.h>hora.getH())return 1;
		else if(this.h<hora.getH())return -1;
		else{
			if(this.m>hora.getM())return 1;
			else if(this.m<hora.getM())return -1;
			return 0;
		}
	}
}
