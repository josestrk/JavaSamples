package ListaEnlazada;


public class ClaseListaEnlazada {
	private Object info;
	private Nodo inicio;
	
	public ClaseListaEnlazada(){
		
	}
	
	public void setInfo(Object o){
		this.info=o;
	}
	public Object getInfo(){
		return info;
	}
	
	public void setInicio(Nodo inicio){
		this.inicio=inicio;
	}
	
	public Nodo getInicio(){
		return this.inicio;
	}
	
	public String toString(){
		return (String)info;
	}
	// esto es LA MADRE DEL CORDERO
	public void addPrincipio(Object o){
		Nodo aux=new Nodo(o);
		aux.setSig(inicio.getSig());
		this.inicio.setSig(aux);
	}
	//ESTO ES DE CAJON 
	public void addFinal(Object o){
		Nodo aux=new Nodo(o);
		Nodo recorrete=new Nodo();
		recorrete=inicio.getSig();
		while(recorrete.getSig()!=null){
			recorrete=recorrete.getSig();
		}
		recorrete.setSig(aux);
	}
	//otro que se las trae
	public boolean borrar( Object o){
		Nodo recorrete=inicio;
		Nodo aux= new Nodo();
		boolean sw = false;
		while(recorrete!=null){// asi entra en el ultimo
			if(recorrete.getO()!=o){
				//borrar
				aux.setSig(recorrete.getSig());
				sw=true;
			}
			recorrete=recorrete.getSig();
		}
		
		return sw;
	}
	
	public boolean equals(ClaseListaEnlazada c){
		if(this.size()==c.size()){
			return true;
		}
		return false;
	}
	
	public int size(){
		int c=0;
		Nodo recorrete=new Nodo();
		recorrete=inicio;
		while(recorrete!=null){
			recorrete=recorrete.getSig();
			c++;
		}
		return c;
	}
	
	
}