package examenPruebaFinal;


public class Fecha implements Comparable {
	int a,m,d;
	public Fecha(){
		d=0;m=0;a=0;
	}
	public Fecha(int d,int m,int a){
		this.d=d;this.m=m;this.a=a;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	public String toString(){
		return d+"/"+m+"/"+a;
	}
	@Override
	public int compareTo(Object o) {
		Fecha f=(Fecha) o;
		if(this.a>f.getA()){
			return 1;
		}else if (this.a<f.getA()){
			return -1;
		}else{
			if(this.m>f.getM())
				return 1;
			else if (this.m<f.getM())
				return -1;
			else{
				if(this.d>f.getD())
					return 1;
				else if (this.d<f.getD())
					return -1;
			}
		}
		return 0;
	}
}
