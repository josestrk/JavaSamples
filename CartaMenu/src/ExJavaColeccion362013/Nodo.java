package ExJavaColeccion362013;

public class Nodo {
	private Ordenable o;
	private Nodo sig;
	
	public Nodo(){
		o=null;
		sig=null;
	}
	public Nodo(Ordenable o){
		this.o=o;
		sig=null;
	}
	
	public void setSig(Nodo sig){
		this.sig=sig;
	}
	
	public Nodo getSig(){
		return sig;
	}
	
	public Ordenable getO(){
		return o;
	}
	
	public void setO(Ordenable o){
		this.o=o;
	}
	
}
