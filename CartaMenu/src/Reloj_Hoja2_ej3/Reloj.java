package Reloj_Hoja2_ej3;

public class Reloj implements Contador{
	private int h;
	private int m;
	private int s;
	
	public Reloj(){
		h=0;
		m=0;
		s=0;
	}
	
	public Reloj(int h, int m, int s){
		this.h=h;
		this.h=h;
		this.h=h;
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

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	@Override
	public void iniciar(Object o) {
		Reloj r=(Reloj) o;
		h=r.getH();
		m=r.getM();
		s=r.getS();
	}

	@Override
	public Reloj leerValor() {
		return this;
	}

	@Override
	public void incrementar() {
		s++;
		if(s>=60){
			m++;
			s-=60;
			if(m>=60){
				h++;
				m-=60;
			}
		}
	}

	@Override
	public void decrementar() {
		if(h>0){
			s--;
			if(s<0){
				m--;
				s=59;
				if(m<0){
					h--;
					m=59;
				}
			}
		}else if(m>0){
			s--;
			if(s<0){
				m--;
				s=59;
			}
		}else{
			if(s>0){
				s--;
			}
		}
	}

	@Override
	public String toString() {
		return h + ":" + m + ":" + s;
	}
	
	

}
