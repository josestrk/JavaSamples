package eliza;

public class Nodo {
		private String o;
		private Nodo sig;

		public Nodo() {
			o=null;
			sig=null;
		}

		public Nodo(String o) {
			this.o=o;
			sig=null;
		}

		public String getO() {
			return o;
		}
		
		public void setO(String o){
			this.o=o;
		}
		
		public Nodo getSig() {
			return sig;
		}

		public void setSig(Nodo sig) {
			this.sig=sig;
		}
		
		public String toString(){
			return " - "+o;
		}
		
		

}
