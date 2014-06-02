package ExamenJun;

public class ej3 implements Apilable{
	private Nodo pila;
	int cima;
	
	public ej3(){
		this.pila=new Nodo();
		cima=-1;
	}
	
	public int size(){
		return cima;
	}
	
	public void push(Object o){
		Nodo aux = new Nodo(o);
		aux.setSig(pila.getSig());
		pila.setSig(aux);
		cima++;
	}
	
	public Object pop(){
		Nodo sacar=pila;
		pila.setSig(pila);
		cima--;
		return sacar;
	}
	
	public boolean isEmpty(){
		if (cima==-1){
			return true;
		}else{
			return false;
		}
	}

}
