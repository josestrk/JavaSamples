/*
 * Es la lista de pasos de la receta 
 * Contiene un metodo suma en el cual se cuenta el tiempo en realizar cada paso de la lista
 * */

public class Lista {
private Nodo txtIni;
	
	public Lista(){
		this.txtIni=new Nodo();
	}
	
	
	public void add(Paso  p){
		while(txtIni.getSig()!=null){
			txtIni.getSig();
		}
		txtIni.setInfo(p);
		txtIni.setSig(null);
		
	}

	public Tiempo TiempoTotal(){
		Tiempo t=new Tiempo(); 
		Nodo aux=txtIni;
		
		while (aux!=null){
			t.suma(aux.getInfo().getTiempoPreparacion());
			aux.getSig();
		}
		return t;
	}
}
