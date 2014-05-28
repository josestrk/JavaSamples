package Diccionario;
public class Nodo {
	private Palabra info;
	private Nodo sig;
	
	public Nodo(){
		this.sig=null;
		
	}
	public Nodo(Palabra info) {
		this.info = info;
		this.sig = null;
	}
	
	public Palabra getInfo() {
		return info;
	}
	public void setInfo(Palabra info) {
		this.info = info;
	}
	public Nodo getSig() {
		return sig;
	}
	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	public String toString() {
		return "[" + info + "]";
	}
	
	
}