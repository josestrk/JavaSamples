package ExJavaColeccion362013;

public class Biblioteca {
	private Nodo lista;
	
	public Biblioteca(){
		lista=new Nodo();
	}
	public void add(Ordenable o){
		Nodo aux=new Nodo(o);
		aux.setSig(lista);
		lista=aux;
	}
	public String toString(){
		String s="";
		Nodo listaA=lista;
		while(listaA.getSig()!=null){
			s+="\n"+listaA.getO().toString();
			listaA=listaA.getSig();
		}
		return s;
	}
	public void ordenar(){
		Nodo orden=lista;
		Nodo aux=new Nodo();
		while(orden.getSig()!=null){//como ordenas una lista enlazada
			if(orden.getO().ordenar()>orden.getSig().getO().ordenar()){
				aux=lista.getSig();
				lista.setSig(lista.getSig().getSig());
				lista.getSig().setSig(aux);
				orden=orden.getSig();
			}else{
				orden=orden.getSig();
			}
		}
		lista=orden;
	}
	public String toStringOrd(){
		ordenar();
		return toString();
	}
	public String toStringNPres(){
		String s="";
		Nodo presList=lista;
		while(presList.getSig()!=null){
			if(!presList.getO().prestado()){
				s+="\n"+presList.getO();// como puedo eliminar las publicaciones??
			}
			presList=presList.getSig();
		}
		return s;
	}
	
}
