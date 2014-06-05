package ExamenJun;

/**
 * 
 * @author jtrincadocastan
 *
 *
 *
 *
 */

public class ej3 implements Apilable{
	private Nodo pila;
	
	public ej3(){
		this.pila=new Nodo();
	}
	
	public int size(){
		Nodo aux=pila;
		int c=0;
		while(aux!=null){
			c++;
			aux=aux.getSig();
			
		}
		return c;
	}
	
	public void push(Object o){
		Nodo aux = new Nodo(o);
		aux.setSig(this.pila);
		this.pila=aux;
	}
	
	public Object pop(){
		
		Object sacar=pila.getO();
		pila=pila.getSig();
		return sacar;
	} 
	
	public boolean isEmpty(){
		if (pila==null){
			return true;
		}else{
			return false;
		}
	}

}
