
public class Nodo {
	// Es un nodo estandard. En info introduce pasos de las recetas
	private Paso info;
	private Nodo sig;
	
	public Nodo(){
	}
	public Paso getInfo() {
		return info;
	}
	public void setInfo(Paso info) {
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