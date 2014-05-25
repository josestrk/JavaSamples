
public class Tiempo {
	private int h;
	private int m;
	private int s;

	public Tiempo() {
		h=0;
		m=0;
		s=0;
	}
	
	public Tiempo(Tiempo tiempoTotal) {
		// TODO Auto-generated constructor stub
	}
	
	public void suma(Tiempo t){
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
}
