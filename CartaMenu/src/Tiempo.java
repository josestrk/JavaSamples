
public class Tiempo {
	private int h;
	private int m;
	private int s;

	public Tiempo() {
		h=0;
		m=0;
		s=0;
	}
	
	public Tiempo(int h, int m, int s) {
		this.h=h;
		this.m=m;
		this.s=s;
	}
	
	public Tiempo(Tiempo tiempoTotal) {
		this.h=tiempoTotal.h;
		this.m=tiempoTotal.m;
		this.s=tiempoTotal.s;
	}
	
	public void suma(Tiempo t){

		this.s+=t.s;
		if(this.s>=60){
			this.s-=60;
			m++;
		}
		
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
		if(s>30){
			sumM++;
		}
		media=sumM/div;
		return media;
	}
	
	public boolean validarhora(){
		boolean sw=true;
		if(s>=60 && s<0)
			sw=false;
		else if(m>=60 && m<0)
			sw=false;
		return sw;
	}
}
