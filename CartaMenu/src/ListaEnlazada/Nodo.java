package ListaEnlazada;

public class Nodo {
	private Object o;
	private Nodo sig;

	public Nodo() {
		o=null;
		sig=null;
	}

	public Nodo(Object o) {
		this.o=o;
		sig=null;
	}

	public Object getO() {
		return o;
	}
	
	public void setO(Object o){
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
