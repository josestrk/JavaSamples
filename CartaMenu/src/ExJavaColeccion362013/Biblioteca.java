package ExJavaColeccion362013;

public class Biblioteca {
	private Nodo lista;
	
	public Biblioteca(){
		lista=null;
	}
	public void add(Ordenable o){
		Nodo aux=new Nodo(o);
		aux.setSig(lista);
		lista=aux;
	}
	
	public void ordenar(){
		Nodo orden=lista;
		Nodo orden2=lista;
		Ordenable aux;
		while(orden.getSig()!=null){//como ordenas una lista enlazada
			orden2=orden.getSig();
			while(orden2!=null){
				if(   orden.getO().ordenar()  >  orden2.getO().ordenar()   ){
					aux=orden.getO();
					orden.setO(orden2.getO());
					orden2.setO(aux);
				}
				orden2=orden2.getSig();
			}
			orden=orden.getSig();
		}
	}
	
	public String toString(){
		String s="";
		Nodo listaA=lista;
		while(listaA!=null){
			s+="\n"+listaA.getO().toString();
			listaA=listaA.getSig();
		}
		return s;
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
