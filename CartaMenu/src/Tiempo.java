
public class Tiempo {
	private int h;
	private int m;

	public Tiempo() {
		h=0;
		m=0;
	}
	
	public Tiempo(int h, int m) {
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

	public Tiempo(Tiempo tiempoTotal) {
		this.h=tiempoTotal.h;
		this.m=tiempoTotal.m;
	}
	
	public void suma(Tiempo t){
		this.m+=t.m;
		if(this.m>=60){
			this.h++;
			this.m-=60;
		}
		
		this.h+=t.h;
	}

	public double media(int div) {
		int sumM=h*60;
		double media;
		sumM+=m;
		media=sumM/div;
		return media;
	}
	
	public boolean validarhora(){
		boolean sw=true;
		if(m>=60 && m<0)
			sw=false;
		return sw;
	}
	//añadido por ejercicio 5
	public int compareTo(Tiempo o2){
		if(this.h>o2.h)
			return 1;
		else if (this.h<o2.h)
			return -1;
		else
			if(this.m>o2.m){
				return 1;
			}else if(this.m<o2.m){
				return -1;
			}else
				return 0;
				
	}
}
