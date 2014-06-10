package eliza;

public class Lista {
	private Nodo pila;
	
	public Lista(){
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
	
	public Object sacar(){
		
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