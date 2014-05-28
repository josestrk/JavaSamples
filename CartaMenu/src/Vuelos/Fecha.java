package Vuelos;

public class Fecha {
		private int d;
		private int m;
		private int a;
		
		public Fecha(){
			d=0;m=0;a=0;
		}
		
		public Fecha(int d,int m,int a){
			this.d=d;this.m=m;this.a=a;
		}

		public int getD() {
			return d;
		}

		public void setD(int d) {
			this.d = d;
		}

		public int getM() {
			return m;
		}

		public void setM(int m) {
			this.m = m;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}
		
		
		//validar dias y meses
		
		//comparador
		public int comparteTo(Fecha f) {
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
					else 
						return -1;
				}
					
			}
		}

		@Override
		public String toString() {
			return "**/" + d + "/" + m + "/" + a + "/**";
		}
		
}
